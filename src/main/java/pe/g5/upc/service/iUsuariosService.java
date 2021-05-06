package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Usuarios;

public interface iUsuariosService {
	public void insertar(Usuarios usuarios);
	public List<Usuarios>listar();
	public void eliminar ( int idUsuarios);

}
