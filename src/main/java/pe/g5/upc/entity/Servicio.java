package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "servicio")
public class Servicio implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idServicio;
	
	
	@Column(name = "nombreServicio", nullable = false, length =30)
	@Size(min = 5, max=15, message="El nombre del curso debe tener mínimo 1 caracter y máximo 40 caracteres")
	private String nombreServicio;
	
	
	@Column(name="costoServicio", nullable= false)
	private int costoServicio;

	@ManyToOne
	@JoinColumn(name="idEspecialidad", nullable = false)
	public Especialidad especialidad;

	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + costoServicio;
		result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
		result = prime * result + idServicio;
		result = prime * result + ((nombreServicio == null) ? 0 : nombreServicio.hashCode());
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
		Servicio other = (Servicio) obj;
		if (costoServicio != other.costoServicio)
			return false;
		if (especialidad == null) {
			if (other.especialidad != null)
				return false;
		} else if (!especialidad.equals(other.especialidad))
			return false;
		if (idServicio != other.idServicio)
			return false;
		if (nombreServicio == null) {
			if (other.nombreServicio != null)
				return false;
		} else if (!nombreServicio.equals(other.nombreServicio))
			return false;
		return true;
	}






	public Servicio(int idServicio,
			@Size(min = 5, max = 15, message = "El nombre del curso debe tener mínimo 1 caracter y máximo 40 caracteres") String nombreServicio,
			int costoServicio, Especialidad especialidad) {
		super();
		this.idServicio = idServicio;
		this.nombreServicio = nombreServicio;
		this.costoServicio = costoServicio;
		this.especialidad = especialidad;
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

	public int getCostoServicio() {
		return costoServicio;
	}

	public void setCostoServicio(int costoServicio) {
		this.costoServicio = costoServicio;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}


	
	
	
}
