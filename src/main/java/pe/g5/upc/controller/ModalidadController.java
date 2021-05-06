package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Modalidad;
import pe.g5.upc.service.iModalidadService;
import pe.g5.upc.entity.Modalidad;
import pe.g5.upc.service.iModalidadService;

@Named
@RequestScoped
public class ModalidadController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private iModalidadService mService;
	
	private Modalidad modalidad;
	
	List<Modalidad>listaModalidades;
	
	@PostConstruct
	public void init() {
	this.listaModalidades = new ArrayList<Modalidad>();
	this.modalidad = new Modalidad();
	this.listar();
	}
	
	public String nuevoModalidad() {
		this.setModalidad(new Modalidad());
		return "modalidad.xhtml";
	}
	
	public void insertar() {
		mService.insertar(modalidad);
		limpiarModalidad();
		this.listar();
	}
	
	public void listar() {
		listaModalidades = mService.listar();
															
	}
	
	public void limpiarModalidad() {
		this.init();
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public List<Modalidad> getListaModalidades() {
		return listaModalidades;
	}

	public void setListaModalidades(List<Modalidad> listaModalidades) {
		this.listaModalidades = listaModalidades;
	}

	
}
