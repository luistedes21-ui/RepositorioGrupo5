package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modalidad")
public class Modalidad implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idModalidad;
	
	@Column(name = "nombreModalidad", nullable = false, length =30)
	private String nombreModalidad;

	public Modalidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modalidad(int idModalidad, String nombreModalidad) {
		super();
		this.idModalidad = idModalidad;
		this.nombreModalidad = nombreModalidad;
	}

	public int getIdModalidad() {
		return idModalidad;
	}

	public void setIdModalidad(int idModalidad) {
		this.idModalidad = idModalidad;
	}

	public String getNombreModalidad() {
		return nombreModalidad;
	}

	public void setNombreModalidad(String nombreModalidad) {
		this.nombreModalidad = nombreModalidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idModalidad;
		result = prime * result + ((nombreModalidad == null) ? 0 : nombreModalidad.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modalidad other = (Modalidad) obj;
		if (idModalidad != other.idModalidad)
			return false;
		if (nombreModalidad == null) {
			if (other.nombreModalidad != null)
				return false;
		} else if (!nombreModalidad.equals(other.nombreModalidad))
			return false;
		return true;
	}

	

}
