package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iServicioDao;
import pe.g5.upc.entity.Servicio;
import pe.g5.upc.service.iServicioService;

@Named
@RequestScoped
public class ServicioServiceImpl implements iServicioService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iServicioDao mD;
	
	@Override
	public void insertar(Servicio servicio) {
		mD.insertar(servicio);
	}

	@Override
	public List<Servicio> listar() {
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idServicio) {
		mD.eliminar(idServicio);
	}
	
}
