package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Psicologo;

public interface iPsicologoService {
	public void insertar(Psicologo psicologo);
	public List<Psicologo>listar();
	public void eliminar ( int idPsicologo);

}
