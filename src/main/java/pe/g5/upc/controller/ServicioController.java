package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Servicio;
import pe.g5.upc.service.iServicioService;
import pe.g5.upc.entity.Especialidad;
import pe.g5.upc.service.iEspecialidadService;


@Named
@RequestScoped
public class ServicioController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iServicioService sService;
	
	@Inject
	private iEspecialidadService eService;
	
	private Especialidad especialidad;
	private Servicio servicio;
	
	List<Especialidad>listaEspecialidades;
	List<Servicio>listaServicios;
	
	@PostConstruct
	public void init() {
		servicio = new Servicio();
		especialidad = new Especialidad();
		this.listaEspecialidades = new ArrayList<Especialidad>();
		this.listaServicios = new ArrayList<Servicio>();
		this.listarServicio();
		listarEspecialidad();
	}
	
	public String nuevoServicio() {
		this.setServicio(new Servicio());
		return "servicio.xhtml";
	}
	public String nuevoEspecialidad() {
		this.setEspecialidad(new Especialidad());
		return "especialidad.xhtml";
	}
	
	public void insertarServicio() {
		sService.insertar(servicio);
		limpiarServicio();
	}
	
	public void listarServicio() {
		listaServicios = sService.listar();													
	}
	
	public void listarEspecialidad() {
		listaEspecialidades = eService.listar()	;
															
	}
	
	public void limpiarServicio() {
		this.init();
	}
	public void eliminar(Servicio servicio) {
		sService.eliminar(servicio.getIdServicio());
		this.listarServicio();
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad ( Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	
	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public List<Servicio> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(List<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}
	public List<Especialidad> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(List<Especialidad> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}
	
}
