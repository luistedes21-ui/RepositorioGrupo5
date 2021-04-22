package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.Psicologo;

public interface iPsicologoDao {
	public void insertar(Psicologo psicologo);
	public List<Psicologo> listar();
	public void eliminar (int idPsicologo);
	
	
	
}
