package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.Modalidad;

public interface iModalidadDao {
	public void insertar(Modalidad modalidad);
	public List<Modalidad> listar();
	
}
