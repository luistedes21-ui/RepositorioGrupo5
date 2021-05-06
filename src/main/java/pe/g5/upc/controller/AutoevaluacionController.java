package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Autoevaluacion;
import pe.g5.upc.service.iAutoevaluacionService;

@Named
@RequestScoped
public class AutoevaluacionController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private iAutoevaluacionService mService;
	
	private Autoevaluacion autoevaluacion;
	
	List<Autoevaluacion>listaAutoevaluacion;
	
	@PostConstruct
	public void init() {
	this.listaAutoevaluacion = new ArrayList<Autoevaluacion>();
	this.autoevaluacion = new Autoevaluacion();
	this.listar();
	}
	
	public String Autoevaluacion() {
		this.setAutoevaluacion(new Autoevaluacion());
		return "autoevaluacion.xhtml";
	}
	
	
	public void insertarEspecialidad() {
		mService.insertar(autoevaluacion);
		limpiarAutoevaluacion();
	}
	
	public void listar() {
		listaAutoevaluacion = mService.listar();
															
	}
	
	public void limpiarAutoevaluacion() {
		this.init();
	}
	
	public void eliminar(Autoevaluacion autoevaluacion) {
		mService.eliminar(autoevaluacion.getIdAutoevaluacion());
		this.listar();
	}
	
	public Autoevaluacion getAutoevaluacion() {
		return autoevaluacion;
	}

	
	public void setAutoevaluacion(Autoevaluacion autoevaluacion) {
		this.autoevaluacion = autoevaluacion;
	}

	public List<Autoevaluacion> getListaEspecialidades() {
		return listaAutoevaluacion;
	}

	public void setListaAutoevaluacion(List<Autoevaluacion> listaAutoevaluacion) {
		this.listaAutoevaluacion = listaAutoevaluacion;
	}
	
}
