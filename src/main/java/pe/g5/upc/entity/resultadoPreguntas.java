package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resultadoPregunta")
public class resultadoPreguntas implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int resultadoPregunta;
	
	@Column(name = "ResultadoPorAutoevaluaci�n", nullable = false, length =50)
	private String ResultadoPorAutoevaluaci�n;

	public resultadoPreguntas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public resultadoPreguntas(int resultadoPregunta, String resultadoPorAutoevaluaci�n) {
		super();
		this.resultadoPregunta = resultadoPregunta;
		ResultadoPorAutoevaluaci�n = resultadoPorAutoevaluaci�n;
	}

	public int getResultadoPregunta() {
		return resultadoPregunta;
	}

	public void setResultadoPregunta(int resultadoPregunta) {
		this.resultadoPregunta = resultadoPregunta;
	}

	public String getResultadoPorAutoevaluaci�n() {
		return ResultadoPorAutoevaluaci�n;
	}

	public void setResultadoPorAutoevaluaci�n(String resultadoPorAutoevaluaci�n) {
		ResultadoPorAutoevaluaci�n = resultadoPorAutoevaluaci�n;
	}

	
	
}
