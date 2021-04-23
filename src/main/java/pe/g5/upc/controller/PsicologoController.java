package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Psicologo;
import pe.g5.upc.service.iPsicologoService;
import pe.g5.upc.entity.Especialidad;
import pe.g5.upc.service.iEspecialidadService;

@Named
@RequestScoped
public class PsicologoController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iPsicologoService pService;
	
	@Inject
	private iEspecialidadService eService;
	
	private Psicologo psicologo;
	private Especialidad especialidad;
	
	List<Psicologo>listaPsicologos;
	List<Especialidad>listaEspecialidades;
	
	@PostConstruct
	public void init() {
		psicologo = new Psicologo();
		especialidad = new Especialidad();
		this.listaEspecialidades = new ArrayList<Especialidad>();
		this.listaPsicologos= new ArrayList<Psicologo>();
		this.listarPsicologo();
		listarEspecialidad();
	}
	
	public String nuevoPsicologo() {
		this.setPsicologo(new Psicologo());
		return "psicologo.xhtml";
	}
	
	public String nuevoEspecialidad() {
		this.setEspecialidad(new Especialidad());
		return "especialidad.xhtml";
	}
	public void insertarPsicologo() {
		pService.insertar(psicologo);
		limpiarPsicologo();
	}
	
	public void listarPsicologo() {
		listaPsicologos = pService.listar();
															
	}
	public void listarEspecialidad() {
		listaEspecialidades = eService.listar()	;
															
	}
	
	
	public void limpiarPsicologo() {
		this.init();
	}
	public void eliminar(Psicologo psicologo) {
		pService.eliminar(psicologo.getIdPsicologo());
		this.listarPsicologo();
	}
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad ( Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	
	public Psicologo getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}

	public List<Psicologo> getListaPsicologos() {
		return listaPsicologos;
	}

	public void setListaPsicologos(List<Psicologo> listaPsicologos) {
		this.listaPsicologos = listaPsicologos;
	}
	public List<Especialidad> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(List<Especialidad> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}
	
}
