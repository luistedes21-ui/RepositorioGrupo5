package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.Autoevaluacion;

public interface iAutoevaluacionDao {
	public void insertar(Autoevaluacion autoevaluacion); 
	public List<Autoevaluacion> listar();
	public void eliminar (int idAutoevaluacion);
	
}
