package pe.g5.upc.service;

import java.util.List;

import pe.g5.upc.entity.Paciente;

public interface iPacienteService {

	public void insertar(Paciente paciente);
	public List<Paciente> listar();
	public void eliminar(int idPaciente);
}
