package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Reserva;
import pe.g5.upc.service.iReservaService;
import pe.g5.upc.entity.Psicologo;
import pe.g5.upc.service.iPsicologoService;
import pe.g5.upc.entity.Paciente;
import pe.g5.upc.service.iPacienteService;
import pe.g5.upc.entity.Modalidad;
import pe.g5.upc.entity.iModalidadService;

@Named
@RequestScoped
public class ReservaController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iReservaService rService;
	@Inject
	private iPsicologoService pService;
	@Inject
	private iPacienteService pcService;
	@Inject
	private iModalidadService pcService;
	
	private Reserva reserva;
	private Paciente paciente;
	private Psicologo psicologo;
	private Modalidad modalidad;
	
	List<Reserva>listaReservas;
	List<Paciente>listaPacientes;
	List<Psicologo>listaPsicologos;
	List<Modalidad> listaModalidad;
	
	@PostConstruct
	public void init() {
		reserva= new Reserva();
		paciente = new Paciente();
		psicologo = new Psicologo(); 
		modalidad = new Modalidad();
		this.listaReservas = new ArrayList<Reserva>();
		this.listaPacientes = new ArrayList<Paciente>();
		this.listaPsicologos = new ArrayList<Psicologo>();
		this.listaModalidad = new ArrayList<Modalidad>();
		this.listarReserva();
		listarPaciente();
		listarPsicologo();
		listarModalidad();
	}
	
	public String nuevoReserva() {
		this.setReserva(new Reserva());
		return "reserva.xhtml";
	}
	public String nuevoPaciente() {
		this.setPaciente(new Paciente());
		return "paciente.xhtml";
	}
	public String nuevoPsicologo() {
		this.setPsicologo(new Psicologo());
		return "psicologo.xhtml";
	}
	public String nuevoModalidad() {
		this.setModalidad(new Modalidad());
		return "modalidad.xhtml";
	}
	
	public void insertarReserva() {
		rService.insertar(reserva);
		limpiarReserva();
	}
	
	public void listarReserva() {
		listaReservas = rService.listar();													
	}
	
	public void listarPaciente() {
		listaPacientes = pcService.listar();													
	}
	public void listarPsicologo() {
		listaPsicologos = pService.listar();													
	}
	public void listarModalidad() {
		listaModalidad = pService.listar();													
	}
	
		
	public void limpiarReserva() {
		this.init();
	}
	public void eliminar(Reserva reserva) {
		rService.eliminar(reserva.getIdReserva());
		this.listarReserva();
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Psicologo getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public List<Reserva> getListaReservas() {
		return listaReservas;
	}

	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}

	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(List<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	public List<Psicologo> getListaPsicologos() {
		return listaPsicologos;
	}

	public void setListaPsicologos(List<Psicologo> listaPsicologos) {
		this.listaPsicologos = listaPsicologos;
	}

	public List<Psicologo> getListaModalidad() {
		return listaModalidad;
	}

	public void setListaModalidad(List<Psicologo> listaModalidad) {
		this.listaModalidad = listaModalidad;
	}
	
	
}
