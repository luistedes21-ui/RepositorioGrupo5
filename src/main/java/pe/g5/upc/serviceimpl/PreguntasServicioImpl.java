package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iPreguntasDao;
import pe.g5.upc.entity.Preguntas;
import pe.g5.upc.service.iPreguntasService;

@Named
@RequestScoped
public class PreguntasServicioImpl implements iPreguntasService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iPreguntasDao mD;
	
	@Override
	public void insertar(Preguntas preguntas ) {
		mD.insertar(preguntas);
	}

	@Override
	public List<Preguntas> listar() {
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idPreguntas) {
		mD.eliminar(idPreguntas);
	}
	
}
