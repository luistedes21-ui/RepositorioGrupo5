package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iAutoevaluacionDao;
import pe.g5.upc.entity.Autoevaluacion;

public class AutoevaluacionDaoImpl implements iAutoevaluacionDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Autoevaluacion autoevaluacion) {
		em.persist(autoevaluacion);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Autoevaluacion> listar() {
		List<Autoevaluacion> lista = new ArrayList<Autoevaluacion>();
		Query q = em.createQuery("select m from Autoevaluacion m");
		lista = (List<Autoevaluacion>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idAutoevaluacion) {
		Autoevaluacion autoevaluacion = new Autoevaluacion();
		autoevaluacion = em.getReference(Autoevaluacion.class, idAutoevaluacion);
		em.remove(autoevaluacion);
		
	}
}
