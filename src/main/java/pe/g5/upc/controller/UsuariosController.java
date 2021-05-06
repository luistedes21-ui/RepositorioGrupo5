package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Usuarios;
import pe.g5.upc.service.iUsuariosService;

@Named
@RequestScoped
public class UsuariosController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private iUsuariosService mService;
	
	private Usuarios usuarios;
	
	List<Usuarios>listaUsuarios;
	
	@PostConstruct
	public void init() {
	this.listaUsuarios = new ArrayList<Usuarios>();
	this.usuarios = new Usuarios();
	this.listar();
	}
	
	public String nuevoUsuarios() {
		this.setUsuarios(new Usuarios());
		return "usuarios.xhtml";
	}
	
	
	public void insertarUsuarios() {
		mService.insertar(usuarios);
		limpiarUsuarios();
	}
	
	public void listar() {
		listaUsuarios = mService.listar();
															
	}
	
	public void limpiarUsuarios() {
		this.init();
	}
	
	public void eliminar(Usuarios usuarios) {
		mService.eliminar(usuarios.getIdUsuarios());
		this.listar();
	}
	
	public Usuarios getUsuarios() {
		return usuarios;
	}

	
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public List<Usuarios> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuarios> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
}
