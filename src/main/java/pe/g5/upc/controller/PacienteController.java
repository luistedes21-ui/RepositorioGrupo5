package pe.g5.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.g5.upc.entity.Paciente;
import pe.g5.upc.service.iPacienteService;

@Named
@RequestScoped

public class PacienteController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private iPacienteService mService;
	private Paciente paciente;
	List<Paciente> listaPaciente;
	
	@PostConstruct
	public void init() {
		this.listaPaciente = new ArrayList<Paciente>();
		this.paciente = new Paciente();
		this.listar();
	}

	public String nuevoPaciente() {
		this.setPaciente(new Paciente());
		return "paciente.xhtml";
	}
	
	public void insertar() {
		mService.insertar(paciente);
		limpiarPaciente();
	}
	
	public void listar() {
		listaPaciente = mService.listar();
	}
	
	public void limpiarPaciente() {
		this.init();
	}
	
	public void eliminar(Paciente paciente) {
		mService.eliminar(paciente.getIdPaciente());
		this.listar();
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getListaPaciente() {
		return listaPaciente;
	}

	public void setListaPaciente(List<Paciente> listaPaciente) {
		this.listaPaciente = listaPaciente;
	}
	
}
