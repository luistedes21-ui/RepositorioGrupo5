package pe.g5.upc.serviceimpl;


import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.g5.upc.dao.iReservaDao;
import pe.g5.upc.entity.Reserva;
import pe.g5.upc.service.iReservaService;

@Named
@RequestScoped
public class ReservaServiceImpl implements iReservaService, Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private iReservaDao mD;
	
	@Override
	public void insertar(Reserva reserva) {
		mD.insertar(reserva);
	}

	@Override
	public List<Reserva> listar() {
		return mD.listar();
	}

	@Override
	@Transactional
	public void eliminar(int idReserva) {
		mD.eliminar(idReserva);
	}
	
}
