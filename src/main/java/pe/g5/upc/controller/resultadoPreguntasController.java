package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.resultadoPreguntas;
import pe.g5.upc.service.iresultadoPreguntasService;


@Named
@RequestScoped
public class resultadoPreguntasController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private iresultadoPreguntasService mService;
	
	private resultadoPreguntas resultadoPreguntas;
	
	List<resultadoPreguntas>listaresultadoPreguntas;
	
	@PostConstruct
	public void init() {
	this.listaresultadoPreguntas = new ArrayList<resultadoPreguntas>();
	this.resultadoPreguntas = new resultadoPreguntas();
	this.listar();
	}
	
	public String nuevoresultadoPreguntas() {
		this.setresultadoPreguntas(new resultadoPreguntas());
		return "resultadoPreguntas.xhtml";
	}
	
	
	public void insertarresultadoPreguntas() {
		mService.insertar(resultadoPreguntas);
		limpiarresultadoPreguntas();
	}
	
	public void listar() {
		listaresultadoPreguntas = mService.listar();
															
	}
	
	public void limpiarresultadoPreguntas() {
		this.init();
	}
	
	public void eliminar(resultadoPreguntas resultadoPreguntas) {
		mService.eliminar(resultadoPreguntas.getResultadoPregunta());
		this.listar();
	}
	
	public resultadoPreguntas getresultadoPreguntas() {
		return resultadoPreguntas;
	}

	
	public void setresultadoPreguntas(resultadoPreguntas resultadoPreguntas) {
		this.resultadoPreguntas = resultadoPreguntas;
	}

	public List<resultadoPreguntas> getListaresultadoPreguntas() {
		return listaresultadoPreguntas;
	}

	public void setListaresultadoPreguntas(List<resultadoPreguntas> listaresultadoPreguntas) {
		this.listaresultadoPreguntas = listaresultadoPreguntas;
	}
	
}
