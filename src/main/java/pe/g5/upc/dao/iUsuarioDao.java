package pe.g5.upc.dao;

import java.util.List;

import pe.g5.upc.entity.Usuarios;

public interface iUsuarioDao {
	public void insertar(Usuarios usuarios);
	public List<Usuarios> listar();
	public void eliminar (int idUsuarios);
	
	
	
}
