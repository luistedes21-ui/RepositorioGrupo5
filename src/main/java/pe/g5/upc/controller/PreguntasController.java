package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Preguntas;
import pe.g5.upc.service.iPreguntasService;


@Named
@RequestScoped
public class PreguntasController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private iPreguntasService mService;
	
	private Preguntas preguntas;
	
	List<Preguntas>listaPreguntas;
	
	@PostConstruct
	public void init() {
	this.listaPreguntas = new ArrayList<Preguntas>();
	this.preguntas = new Preguntas();
	this.listar();
	}
	
	public String nuevoPreguntas() {
		this.setPreguntas(new Preguntas());
		return "preguntas.xhtml";
	}
	
	
	public void insertarPreguntas() {
		mService.insertar(preguntas);
		limpiarPreguntas();
	}
	
	public void listar() {
		listaPreguntas = mService.listar();
															
	}
	
	public void limpiarPreguntas() {
		this.init();
	}
	
	public void eliminar(Preguntas preguntas) {
		mService.eliminar(preguntas.getIdPreguntas());
		this.listar();
	}
	
	public Preguntas getPreguntas() {
		return preguntas;
	}

	
	public void setPreguntas(Preguntas preguntas) {
		this.preguntas = preguntas;
	}

	public List<Preguntas> getListaPreguntas() {
		return listaPreguntas;
	}

	public void setListaPreguntas(List<Preguntas> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}
	
}
