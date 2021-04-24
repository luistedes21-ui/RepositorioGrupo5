package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Reserva;

public interface iReservaService {
	public void insertar(Reserva reserva);
	public List<Reserva>listar();
	public void eliminar ( int idReserva);

}
