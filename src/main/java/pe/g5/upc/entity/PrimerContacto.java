package pe.g5.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PrimerContacto")
public class PrimerContacto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPrimerContacto;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idReserva", nullable = false)
	private Reserva reserva;
	
	@Column(name = "NumeroSesiones", nullable = false)
	private int NumeroSesiones;
	
	



	

	
	
	
}
