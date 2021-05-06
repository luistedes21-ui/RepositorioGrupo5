package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "preguntas")
public class Preguntas implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPreguntas;
	
	@Column(name = "definirPreguntas", nullable = false, length =30)
	private String definirPreguntas;

	public Preguntas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Preguntas(int idPreguntas, String definirPreguntas) {
		super();
		this.idPreguntas = idPreguntas;
		this.definirPreguntas = definirPreguntas;
	}

	public String getDefinirPreguntas() {
		return definirPreguntas;
	}

	public void setDefinirPreguntas(String definirPreguntas) {
		this.definirPreguntas = definirPreguntas;
	}

	public int getIdPreguntas() {
		return idPreguntas;
	}

	public void setIdPreguntas(int idPreguntas) {
		this.idPreguntas = idPreguntas;
	}

	

	
	
	
}
