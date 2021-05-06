package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iUsuarioDao;
import pe.g5.upc.entity.Usuarios;

public class UsuarioDaoImpl implements iUsuarioDao, Serializable {
	private static final long serialVersionUID=1L;
	
	@PersistenceContext(unitName = "a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Usuarios usuarios) {
		em.persist(usuarios);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuarios> listar() {
		List<Usuarios> lista = new ArrayList<Usuarios>();
		Query q = em.createQuery("select m from Usuarios m");
		lista = (List<Usuarios>) q.getResultList();
		return lista;
	}

	@Override
	public void eliminar(int idUsuarios) {
		Usuarios usuarios = new Usuarios();
		usuarios = em.getReference(Usuarios.class, idUsuarios);
		em.remove(usuarios);
		
	}
}
