package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iModalidadDao;
import pe.g5.upc.entity.Modalidad;

public class ModalidadDaoImpl implements iModalidadDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Modalidad modalidad) {
		em.persist(modalidad);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Modalidad> listar() {
		List<Modalidad> lista = new ArrayList<Modalidad>();
		Query q = em.createQuery("select m from Modalidad m");
		lista = (List<Modalidad>) q.getResultList();
		return lista;
	}

}
