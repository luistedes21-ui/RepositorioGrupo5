package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iPsicologoDao;
import pe.g5.upc.entity.Psicologo;

public class PsicologoDaoImpl implements iPsicologoDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Psicologo psicologo) {
		em.persist(psicologo);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Psicologo> listar() {
		List<Psicologo> lista = new ArrayList<Psicologo>();
		Query q = em.createQuery("select m from Psicologo m");
		lista = (List<Psicologo>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idPsicologo) {
		Psicologo psicologo = new Psicologo();
		psicologo = em.getReference(Psicologo.class, idPsicologo);
		em.remove(psicologo);
		
	}
}
