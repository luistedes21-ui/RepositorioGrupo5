package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Autoevaluacion;

public interface iAutoevaluacionService {
	public void insertar(Autoevaluacion autoevaluacion);
	public List<Autoevaluacion>listar();
	public void eliminar ( int idAutoevaluacion);

}
