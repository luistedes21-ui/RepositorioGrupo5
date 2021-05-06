package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autoevaluacion")
public class Autoevaluacion implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAutoevaluacion;
	
	@Column(name = "preguntas", nullable = false, length =50)
	private String preguntas;

	@Column(name = "respuestas", nullable = false, length =1)
	private Boolean respuestas;

	public Autoevaluacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autoevaluacion(int idAutoevaluacion, String preguntas, Boolean respuestas) {
		super();
		this.idAutoevaluacion = idAutoevaluacion;
		this.preguntas = preguntas;
		this.respuestas = respuestas;
	}

	public int getIdAutoevaluacion() {
		return idAutoevaluacion;
	}

	public void setIdAutoevaluacion(int idAutoevaluacion) {
		this.idAutoevaluacion = idAutoevaluacion;
	}

	public String getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(String preguntas) {
		this.preguntas = preguntas;
	}

	public Boolean getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(Boolean respuestas) {
		this.respuestas = respuestas;
	}
	





	
	
	
}
