package co.Gestion_clientes.modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(name="nombre", length=40, nullable=false)
	private String nombre;
	@Column(name="apellido", length=40, nullable=false)
	private String apellido;
	@Column(name="telefono", length=15, nullable=false)
	private int telefono;
	@Column(name="email", length=40, nullable=false, unique=true)
	private String email;
	@Column(name="fecha_inicial", nullable=false)
	private Date finicial;
	
	
	public Cliente() {
		super();
	}


	public Cliente(Long id, String nombre, String apellido, int telefono, String email, Date finicial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.finicial = finicial;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getFinicial() {
		return finicial;
	}


	public void setFinicial(Date finicial) {
		this.finicial = finicial;
	}
	
	
	
}
