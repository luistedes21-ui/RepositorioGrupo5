package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.g5.upc.dao.iPsicologoDao;
import pe.g5.upc.entity.Psicologo;
import pe.g5.upc.service.iPsicologoService;

@Named
@RequestScoped
public class PsicologoServicioImpl implements iPsicologoService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iPsicologoDao mD;
	
	@Override
	public void insertar(Psicologo psicologo) {
		mD.insertar(psicologo);
	}

	@Override
	public List<Psicologo> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idPsicologo) {
		mD.eliminar(idPsicologo);
	}
	
}
