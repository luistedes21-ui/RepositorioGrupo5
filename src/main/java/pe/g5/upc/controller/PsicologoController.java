package pe.g5.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.entity.Psicologo;
import pe.g5.upc.service.iPsicologoService;

@Named
@RequestScoped
public class PsicologoController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iPsicologoService mService;
	private Psicologo psicologo;
	List<Psicologo>listaPsicologos;
	
	@PostConstruct
	public void init() {
		this.listaPsicologos = new ArrayList<Psicologo>();
		this.psicologo = new Psicologo ();
		this.listar();
	}
	
	public String nuevoPsicologo() {
		this.setPsicologo(new Psicologo());
		return "psicologo.xhtml";
	}
	
	public void insertar() {
		mService.insertar(psicologo);
		limpiarPsicologo();
	}
	
	public void listar() {
		listaPsicologos = mService.listar();
															
	}
	
	public void limpiarPsicologo() {
		this.init();
	}
	public void eliminar(Psicologo psicologo) {
		mService.eliminar(psicologo.getIdPsicologo());
		this.listar();
	}
	
	public Psicologo getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}

	public List<Psicologo> getListaPsicologos() {
		return listaPsicologos;
	}

	public void setListaPsicologos(List<Psicologo> listaPsicologos) {
		this.listaPsicologos = listaPsicologos;
	}
	
}
