package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.dao.iModalidadDao;
import pe.g5.upc.entity.Modalidad;
import pe.g5.upc.service.iModalidadService;

@Named
@RequestScoped
public class ModalidadServicioImpl implements iModalidadService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iModalidadDao mD;
	
	@Override
	public void insertar(Modalidad modalidad ) {
		mD.insertar(modalidad);
	}

	@Override
	public List<Modalidad> listar() {
		return mD.listar();
	}

}
