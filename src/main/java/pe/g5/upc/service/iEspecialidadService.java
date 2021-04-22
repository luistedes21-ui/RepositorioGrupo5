package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Especialidad;

public interface iEspecialidadService {
	public void insertar(Especialidad especialidad);
	public List<Especialidad>listar();
	public void eliminar ( int idEspecialidad);

}
