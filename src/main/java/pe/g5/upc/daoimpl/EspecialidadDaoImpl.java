package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iEspecialidadDao;
import pe.g5.upc.entity.Especialidad;

public class EspecialidadDaoImpl implements iEspecialidadDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Especialidad especialidad) {
		em.persist(especialidad);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Especialidad> listar() {
		List<Especialidad> lista = new ArrayList<Especialidad>();
		Query q = em.createQuery("select m from Especialidad m");
		lista = (List<Especialidad>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idEspecialidad) {
		Especialidad especialidad = new Especialidad();
		especialidad = em.getReference(Especialidad.class, idEspecialidad);
		em.remove(especialidad);
		
	}
}
