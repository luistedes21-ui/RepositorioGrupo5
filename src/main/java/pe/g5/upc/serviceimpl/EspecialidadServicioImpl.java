package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iEspecialidadDao;
import pe.g5.upc.entity.Especialidad;
import pe.g5.upc.service.iEspecialidadService;

@Named
@RequestScoped
public class EspecialidadServicioImpl implements iEspecialidadService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iEspecialidadDao mD;
	
	@Override
	public void insertar(Especialidad especialidad ) {
		mD.insertar(especialidad);
	}

	@Override
	public List<Especialidad> listar() {
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idEspecialidad) {
		mD.eliminar(idEspecialidad);
	}
	
}
