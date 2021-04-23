package pe.g5.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iPacienteDao;
import pe.g5.upc.entity.Paciente;

public class PacienteDaoImpl implements iPacienteDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	@Transactional
	@Override
	public void insertar(Paciente paciente) {
		em.persist(paciente);
	}
    @SuppressWarnings("unchecked")
	@Override
	public List<Paciente> listar() {
    	List <Paciente> lista = new ArrayList<Paciente>();
    	Query q = em.createQuery("select m from Paciente m");
    	lista = (List<Paciente>) q.getResultList();
		return lista;
	}
 
    @Transactional
	@Override
	public void eliminar(int idPaciente) {
    	
    	Paciente paciente = new Paciente();
    	paciente = em.getReference(Paciente.class, idPaciente);
    	em.remove(paciente);
		
	}

	
	
}