package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iPrimerContactoDao;
import pe.g5.upc.entity.PrimerContacto;

public class PrimercontactoDaoImpl implements iPrimerContactoDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(PrimerContacto primercontacto) {
		em.persist(primercontacto);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PrimerContacto> listar() {
		List<PrimerContacto> lista = new ArrayList<PrimerContacto>();
		Query q = em.createQuery("select m from PrimerContacto m");
		lista = (List<PrimerContacto>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idPrimerContacto) {
		PrimerContacto primercontacto = new PrimerContacto();
		primercontacto = em.getReference(PrimerContacto.class, idPrimerContacto);
		em.remove(primercontacto);
		
	}
}
