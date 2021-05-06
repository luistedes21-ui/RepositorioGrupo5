package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.Preguntas;

public interface iPreguntasDao {
	void insertar(Preguntas preguntas);
	public List<Preguntas> listar();
	public void eliminar (int idPreguntas);
	
	
	
}
