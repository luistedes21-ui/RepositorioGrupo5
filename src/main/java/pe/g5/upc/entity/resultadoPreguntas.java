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
	
	@Column(name = "ResultadoPorAutoevaluación", nullable = false, length =50)
	private String ResultadoPorAutoevaluación;

	public resultadoPreguntas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public resultadoPreguntas(int resultadoPregunta, String resultadoPorAutoevaluación) {
		super();
		this.resultadoPregunta = resultadoPregunta;
		ResultadoPorAutoevaluación = resultadoPorAutoevaluación;
	}

	public int getResultadoPregunta() {
		return resultadoPregunta;
	}

	public void setResultadoPregunta(int resultadoPregunta) {
		this.resultadoPregunta = resultadoPregunta;
	}

	public String getResultadoPorAutoevaluación() {
		return ResultadoPorAutoevaluación;
	}

	public void setResultadoPorAutoevaluación(String resultadoPorAutoevaluación) {
		ResultadoPorAutoevaluación = resultadoPorAutoevaluación;
	}

	
	
}
