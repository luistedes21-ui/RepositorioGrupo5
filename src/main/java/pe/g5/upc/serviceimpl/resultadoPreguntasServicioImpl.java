package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iresultadoPreguntasDao;
import pe.g5.upc.entity.resultadoPreguntas;
import pe.g5.upc.service.iresultadoPreguntasService;

@Named
@RequestScoped
public class resultadoPreguntasServicioImpl implements iresultadoPreguntasService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iresultadoPreguntasDao mD;
	
	@Override
	public void insertar(resultadoPreguntas resultadoPreguntas ) {
		mD.insertar(resultadoPreguntas);
	}

	@Override
	public List<resultadoPreguntas> listar() {
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idresultadoPreguntas) {
		mD.eliminar(idresultadoPreguntas);
	}
	
}
