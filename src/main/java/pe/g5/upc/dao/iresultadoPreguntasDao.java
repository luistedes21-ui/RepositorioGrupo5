package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.resultadoPreguntas;

public interface iresultadoPreguntasDao {
	public void insertar(resultadoPreguntas resultadoPregunta);
	public List<resultadoPreguntas> listar();
	public void eliminar (int idresultadoPreguntas);
	
	
	
}
