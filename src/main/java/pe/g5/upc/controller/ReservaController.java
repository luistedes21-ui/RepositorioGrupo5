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
import pe.g5.upc.entity.Especialidad;
import pe.g5.upc.service.iEspecialidadService;
import pe.g5.upc.entity.Servicio;
import pe.g5.upc.service.iServicioService;

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
	private iEspecialidadService eService;
	@Inject
	private iServicioService sService;

	private Reserva reserva;
	private Paciente paciente;
	private Psicologo psicologo;
	private Especialidad especialidad;
	private Servicio servicio;

	List<Reserva> listaReservas;
	List<Paciente> listaPacientes;
	List<Psicologo> listaPsicologos;
	List<Especialidad> listaEspecialidades;
	List<Servicio> listaServicios;

	@PostConstruct
	public void init() {
		reserva = new Reserva();
		paciente = new Paciente();
		psicologo = new Psicologo();
		especialidad = new Especialidad();
		servicio = new Servicio();
		this.listaReservas = new ArrayList<Reserva>();
		this.listaPacientes = new ArrayList<Paciente>();
		this.listaPsicologos = new ArrayList<Psicologo>();
		this.listaEspecialidades = new ArrayList<Especialidad>();
		this.listaServicios = new ArrayList<Servicio>();
		this.listarReserva();
		listarPaciente();
		listarPsicologo();
		psicologo= this.listaPsicologos.get(2);
		listarEspecialidad();

	}
	
	public void handleChange(){
		   System.out.println("New value: " + psicologo.getNombrePsicologo());
		}
	
	
	

	public List<Servicio> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(List<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
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

	public void insertarReserva() {
		rService.insertar(reserva);
		limpiarReserva();
	}

	public void listarServicio() {
		listaServicios = sService.listarPorEspecialidad(psicologo.getEspecialidad().getNombreEspecialidad());
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

	public void listarEspecialidad() {
		listaEspecialidades = eService.listar();
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

	public Psicologo getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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

}
