package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iAutoevaluacionDao;
import pe.g5.upc.entity.Autoevaluacion;
import pe.g5.upc.service.iAutoevaluacionService;

@Named
@RequestScoped
public class AutoevaluacionServicioImpl implements iAutoevaluacionService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iAutoevaluacionDao mD;
	
	@Override
	public void insertar(Autoevaluacion autoevaluacion ) {
		mD.insertar(autoevaluacion);
	}

	@Override
	public List<Autoevaluacion> listar() {
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idAutoevaluacion) {
		mD.eliminar(idAutoevaluacion);
	}
	
}
