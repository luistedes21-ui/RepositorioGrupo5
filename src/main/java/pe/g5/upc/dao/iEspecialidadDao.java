package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.Especialidad;

public interface iEspecialidadDao {
	public void insertar(Especialidad especialidad);
	public List<Especialidad> listar();
	public void eliminar (int idEspecialidad);
	
	
	
}
