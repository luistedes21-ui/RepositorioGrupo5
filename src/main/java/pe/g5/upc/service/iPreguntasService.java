package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Preguntas;

public interface iPreguntasService {
	public void insertar(Preguntas preguntas);
	public List<Preguntas>listar();
	public void eliminar ( int idPreguntas);

}
