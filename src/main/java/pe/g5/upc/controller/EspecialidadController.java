package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Especialidad;
import pe.g5.upc.service.iEspecialidadService;
import pe.g5.upc.entity.Psicologo;
import pe.g5.upc.service.iPsicologoService;

@Named
@RequestScoped
public class EspecialidadController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iPsicologoService pService;
	
	
	@Inject
	private iEspecialidadService mService;
	
	private Especialidad especialidad;
	private Psicologo psicologo;
	
	List<Especialidad>listaEspecialidades;
	List<Psicologo>listaPsicologos;
	
	@PostConstruct
	public void init() {
		psicologo = new Psicologo();
		especialidad = new Especialidad();
		this.listaEspecialidades = new ArrayList<Especialidad>();
		this.listaPsicologos= new ArrayList<Psicologo>();
		this.listar();
		listarEspecialidad();
	}
	
	public String nuevoEspecialidad() {
		this.setEspecialidad(new Especialidad());
		return "especialidad.xhtml";
	}
	public String nuevoPsicologo() {
		this.setPsicologo(new Psicologo());
		return "psicologo.xhtml";
	}
	
	
	public void insertarEspecialidad() {
		mService.insertar(especialidad);
		limpiarEspecialidad();
	}
	
	public void listar() {
		listaPsicologos = pService.listar();
															
	}
	public void listarEspecialidad() {
		listaEspecialidades = mService.listar()	;
	}
	
	public void limpiarEspecialidad() {
		this.init();
	}
	
	public void eliminar(Especialidad especialidad) {
		mService.eliminar(especialidad.getIdEspecialidad());
		this.listarEspecialidad();
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public List<Especialidad> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(List<Especialidad> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}
	
}
