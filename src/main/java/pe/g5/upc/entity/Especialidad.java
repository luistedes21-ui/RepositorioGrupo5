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

@Entity
@Table(name = "especialidad")
public class Especialidad implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEspecialidad;
	
	@Column(name = "nombreEspecialidad", nullable = false, length =30)
	private String nombreEspecialidad;

	
	@ManyToOne
	@JoinColumn(name="idPsicologo ", nullable = true)
	public Psicologo psicologo;


	public Especialidad() {
		super();
		
	}


	public Especialidad(int idEspecialidad, String nombreEspecialidad, Psicologo psicologo) {
		super();
		this.idEspecialidad = idEspecialidad;
		this.nombreEspecialidad = nombreEspecialidad;
		this.psicologo = psicologo;
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


	public Psicologo getPsicologo() {
		return psicologo;
	}


	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}


	
	
	
}
