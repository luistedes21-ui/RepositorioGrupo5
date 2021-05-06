package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.PrimerContacto;

public interface iPrimerContactoDao {
	public void insertar(PrimerContacto primercontacto);
	public List<PrimerContacto> listar();
	public void eliminar (int idPrimerContacto);
	
	
	
}
