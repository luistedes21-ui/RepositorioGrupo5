package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iServicioDao;
import pe.g5.upc.entity.Servicio;

public class ServicioDaoImpl implements iServicioDao, Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "a")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Servicio servicio) {
		em.persist(servicio);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> listar() {
		List<Servicio> lista = new ArrayList<Servicio>();
		Query q = em.createQuery("select m from Servicio m");
		lista = (List<Servicio>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idServicio) {
		Servicio servicio = new Servicio();
		servicio = em.getReference(Servicio.class, idServicio);
		em.remove(servicio);

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> listarPorEspecialidad(String nombreEspecialidad) {
		List<Servicio> lista = new ArrayList<Servicio>();
		try {
			Query q = em.createQuery("from Servicio s where s.especialidad.nombreEspecialidad like :especialidad");
			q.setParameter("especialidad", nombreEspecialidad);
			lista = (List<Servicio>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar colaborador");
		}
		return lista;
	}
}
