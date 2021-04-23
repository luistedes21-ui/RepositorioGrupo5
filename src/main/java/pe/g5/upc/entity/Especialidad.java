package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especialidad")
public class Especialidad implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEspecialidad;
	
	@Column(name = "nombreEspecialidad", nullable = false, length =30)
	private String nombreEspecialidad;

	

	public Especialidad() {
		super();
		
	}


	public Especialidad(int idEspecialidad, String nombreEspecialidad, Psicologo psicologo) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.nombreEspecialidad = nombreEspecialidad;
	}


	public int getIdEspecialidad() {
		return idEspecialidad;
	}


	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}


	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}


	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEspecialidad;
		result = prime * result + ((nombreEspecialidad == null) ? 0 : nombreEspecialidad.hashCode());
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
		Especialidad other = (Especialidad) obj;
		if (idEspecialidad != other.idEspecialidad)
			return false;
		if (nombreEspecialidad == null) {
			if (other.nombreEspecialidad != null)
				return false;
		} else if (!nombreEspecialidad.equals(other.nombreEspecialidad))
			return false;
		return true;
	}



	
	
	
}
