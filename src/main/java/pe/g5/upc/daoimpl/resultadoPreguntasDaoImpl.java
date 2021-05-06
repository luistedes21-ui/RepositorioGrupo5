package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iresultadoPreguntasDao;
import pe.g5.upc.entity.resultadoPreguntas;

public class resultadoPreguntasDaoImpl implements iresultadoPreguntasDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(resultadoPreguntas resultadoPreguntas) {
		em.persist(resultadoPreguntas);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<resultadoPreguntas> listar() {
		List<resultadoPreguntas> lista = new ArrayList<resultadoPreguntas>();
		Query q = em.createQuery("select m from resultadoPreguntas m");
		lista = (List<resultadoPreguntas>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idresultadoPreguntas) {
		resultadoPreguntas ResultadoPreguntas = new resultadoPreguntas();
		ResultadoPreguntas = em.getReference(resultadoPreguntas.class, idresultadoPreguntas);
		em.remove(ResultadoPreguntas);
		
	}
}
