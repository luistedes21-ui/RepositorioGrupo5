package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Servicio;

public interface iServicioService {
	public void insertar(Servicio servicio);
	public List<Servicio>listar();
	public List<Servicio>listarPorEspecialidad(String nombreEspecialidad);
	public void eliminar ( int idServicio);

}
