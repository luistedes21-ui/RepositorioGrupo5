package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iPrimerContactoDao;
import pe.g5.upc.entity.PrimerContacto;
import pe.g5.upc.service.iPrimerContactoService;

@Named
@RequestScoped
public class PrimerContactoServiceImpl implements iPrimerContactoService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iPrimerContactoDao mD;
	
	@Override
	public void insertar(PrimerContacto primercontacto) {
		mD.insertar(primercontacto);
	}

	@Override
	public List<PrimerContacto> listar() {
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idPrimerContacto) {
		mD.eliminar(idPrimerContacto);
	}
	
}
