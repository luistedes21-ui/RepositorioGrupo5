package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.Servicio;

public interface iServicioDao {
	public void insertar(Servicio servicio);
	public List<Servicio> listar();
	public void eliminar (int idServicio);
	public List<Servicio>listarPorEspecialidad(String nombreEspecialidad);	
	
	
}
