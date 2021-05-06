package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iUsuarioDao;
import pe.g5.upc.entity.Usuarios;
import pe.g5.upc.service.iUsuariosService;

@Named
@RequestScoped
public class UsuariosServicioImpl implements iUsuariosService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iUsuarioDao mD;
	
	@Override
	public void insertar(Usuarios usuarios ) {
		mD.insertar(usuarios);
	}

	@Override
	public List<Usuarios> listar() {
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idUsuarios) {
		mD.eliminar(idUsuarios);
	}
	
}
