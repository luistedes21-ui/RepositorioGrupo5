package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.Reserva;

public interface iReservaDao {
	public void insertar(Reserva reserva);
	public List<Reserva> listar();
	public void eliminar (int idReserva);
	
	
	
}
