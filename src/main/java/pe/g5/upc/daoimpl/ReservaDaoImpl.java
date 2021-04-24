package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iReservaDao;
import pe.g5.upc.entity.Reserva;

public class ReservaDaoImpl implements iReservaDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Reserva reserva) {
		em.persist(reserva);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> listar() {
		List<Reserva> lista = new ArrayList<Reserva>();
		Query q = em.createQuery("select m from Reserva m");
		lista = (List<Reserva>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idReserva) {
		Reserva reserva = new Reserva();
		reserva = em.getReference(Reserva.class, idReserva);
		em.remove(reserva);
		
	}
}
