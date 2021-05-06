package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Modalidad;

public interface iModalidadService {
	public void insertar(Modalidad modalidad);
	public List<Modalidad>listar();
}
