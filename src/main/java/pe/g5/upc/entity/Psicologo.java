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
@Table(name = "psicologo")
public class Psicologo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPsicologo;
	
	@Column(name = "nombrePsicologo", nullable = false, length =30)
	private String nombrePsicologo;

	@Column(name = "CodigoCPSP", nullable = false, length =30)
	private String CodigoCPSP;
	
	@ManyToOne
	@JoinColumn(name="idEspecialidad ", nullable = false)
	public Especialidad especialidad;

	public Psicologo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Psicologo(int idPsicologo, String nombrePsicologo, String codigoCPSP, Especialidad especialidad) {
		super();
		this.idPsicologo = idPsicologo;
		this.nombrePsicologo = nombrePsicologo;
		CodigoCPSP = codigoCPSP;
		this.especialidad = especialidad;
	}

	public int getIdPsicologo() {
		return idPsicologo;
	}

	public void setIdPsicologo(int idPsicologo) {
		this.idPsicologo = idPsicologo;
	}

	public String getNombrePsicologo() {
		return nombrePsicologo;
	}

	public void setNombrePsicologo(String nombrePsicologo) {
		this.nombrePsicologo = nombrePsicologo;
	}

	public String getCodigoCPSP() {
		return CodigoCPSP;
	}

	public void setCodigoCPSP(String codigoCPSP) {
		CodigoCPSP = codigoCPSP;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}




	
}
