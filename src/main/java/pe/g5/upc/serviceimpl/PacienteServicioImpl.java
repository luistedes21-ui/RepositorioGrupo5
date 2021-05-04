package pe.g5.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iPacienteDao;
import pe.g5.upc.entity.Paciente;
import pe.g5.upc.service.iPacienteService;

@Named
@RequestScoped
public class PacienteServicioImpl implements iPacienteService,Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private iPacienteDao mD;
	@Override
	
	public void insertar(Paciente paciente) {
		
		mD.insertar(paciente);
	}

	@Override
	public List<Paciente> listar() {
		
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idPaciente) {
		
		mD.eliminar(idPaciente);
	}
	

}
