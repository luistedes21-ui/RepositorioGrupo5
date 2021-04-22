package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idServicio;
	
	@Column(name = "nombreServicio", nullable = false, length =30)
	private String nombreServicio;

	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Servicio(int idServicio, String nombreServicio) {
		super();
		this.idServicio = idServicio;
		this.nombreServicio = nombreServicio;
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	

	
	
	
}
