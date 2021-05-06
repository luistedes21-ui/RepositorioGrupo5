package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.resultadoPreguntas;

public interface iresultadoPreguntasService {
	public void insertar(resultadoPreguntas resultadoPreguntas);
	public List<resultadoPreguntas>listar();
	public void eliminar ( int idresultadoPreguntas);

}
