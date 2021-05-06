package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iPreguntasDao;
import pe.g5.upc.entity.Preguntas;

public class PreguntasDaoImpl implements iPreguntasDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Preguntas preguntas) {
		em.persist(preguntas);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Preguntas> listar() {
		List<Preguntas> lista = new ArrayList<Preguntas>();
		Query q = em.createQuery("select m from Preguntas m");
		lista = (List<Preguntas>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idPreguntas) {
		Preguntas preguntas = new Preguntas();
		preguntas = em.getReference(Preguntas.class, idPreguntas);
		em.remove(preguntas);
		
	}
}
