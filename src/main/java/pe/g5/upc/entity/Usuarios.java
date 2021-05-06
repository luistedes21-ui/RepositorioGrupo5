package pe.g5.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuarios;
	
	@Column(name = "Contrase�a", nullable = false, length =30)
	private String Contrase�a;

	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuarios(int idUsuarios, String contrase�a) {
		super();
		this.idUsuarios = idUsuarios;
		Contrase�a = contrase�a;
	}

	public String getContrase�a() {
		return Contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		Contrase�a = contrase�a;
	}

	public int getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	


	
	
	
}
