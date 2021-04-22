package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name = "especialidadPsicologo", nullable = false, length =30)
	private String especialidadPsicologo;

	public Psicologo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Psicologo(int idPsicologo, String nombrePsicologo, String codigoCPSP, String especialidadPsicologo) {
		super();
		this.idPsicologo = idPsicologo;
		this.nombrePsicologo = nombrePsicologo;
		CodigoCPSP = codigoCPSP;
		this.especialidadPsicologo = especialidadPsicologo;
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

	public String getEspecialidadPsicologo() {
		return especialidadPsicologo;
	}

	public void setEspecialidadPsicologo(String especialidadPsicologo) {
		this.especialidadPsicologo = especialidadPsicologo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CodigoCPSP == null) ? 0 : CodigoCPSP.hashCode());
		result = prime * result + ((especialidadPsicologo == null) ? 0 : especialidadPsicologo.hashCode());
		result = prime * result + idPsicologo;
		result = prime * result + ((nombrePsicologo == null) ? 0 : nombrePsicologo.hashCode());
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
		Psicologo other = (Psicologo) obj;
		if (CodigoCPSP == null) {
			if (other.CodigoCPSP != null)
				return false;
		} else if (!CodigoCPSP.equals(other.CodigoCPSP))
			return false;
		if (especialidadPsicologo == null) {
			if (other.especialidadPsicologo != null)
				return false;
		} else if (!especialidadPsicologo.equals(other.especialidadPsicologo))
			return false;
		if (idPsicologo != other.idPsicologo)
			return false;
		if (nombrePsicologo == null) {
			if (other.nombrePsicologo != null)
				return false;
		} else if (!nombrePsicologo.equals(other.nombrePsicologo))
			return false;
		return true;
	}

	
	
	
}
