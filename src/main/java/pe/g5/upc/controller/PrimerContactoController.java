package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.PrimerContacto;
import pe.g5.upc.service.iPrimerContactoService;
import pe.g5.upc.entity.Reserva;
import pe.g5.upc.service.iReservaService;


@Named
@RequestScoped
public class PrimerContactoController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iPrimerContactoService pcService;
	@Inject
	private iReservaService rService;
	
	
	private PrimerContacto primercontacto;
	private Reserva reserva;
	
	List<PrimerContacto>listaPrimerContactos;
	List<Reserva>listaReservas;
	
	@PostConstruct
	public void init() {
		reserva= new Reserva();
		primercontacto = new PrimerContacto();
		this.listaReservas = new ArrayList<Reserva>();
		this.listaPrimerContactos = new ArrayList<PrimerContacto>();
		this.listarReserva();
		listarPrimerContacto();
		
	}
	
	
	public String nuevoPrimerContacto() {
		this.setPrimerContacto(new PrimerContacto());
		return "primercontacto.xhtml";
	}
	
	public String nuevoReserva() {
		this.setReserva(new Reserva());
		return "reserva.xhtml";
	}
	public void insertarPrimerContacto() {
		pcService.insertar(primercontacto);
		limpiarPrimerContacto();
	}
	
	public void listarPrimerContacto() {
		listaPrimerContactos = pcService.listar();													
	}
	
	
	public void listarReserva() {
		listaReservas = rService.listar();													
	}
	
	
	
		
	public void limpiarPrimerContacto() {
		this.init();
	}
	public void eliminar(PrimerContacto primercontacto) {
		pcService.eliminar(primercontacto.getIdPrimerContacto());
		this.listarPrimerContacto();
	}
	
	
	public PrimerContacto getPrimerContacto() {
		return primercontacto;
	}	
	public void setPrimerContacto ( PrimerContacto primercontacto) {
		this.primercontacto = primercontacto;
	}	
	
	
	public Reserva getReserva() {
		return reserva;
	}	
	public void setReserva ( Reserva reserva) {
		this.reserva = reserva;
	}
	
	

	
	public List<PrimerContacto> getListaPrimerContactos() {
		return listaPrimerContactos;
	}
	public void setListaPrimerContactos(List<PrimerContacto> listaPrimerContactos) {
		this.listaPrimerContactos = listaPrimerContactos;
	}
	
	
	
	
	
	public List<Reserva> getListaReservas() {
		return listaReservas;
	}
	public void setListaReservas(List<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}
	

}
