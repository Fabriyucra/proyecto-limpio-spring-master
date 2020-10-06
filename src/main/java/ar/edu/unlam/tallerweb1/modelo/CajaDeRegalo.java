package ar.edu.unlam.tallerweb1.modelo;
/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity*/
public class CajaDeRegalo {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numeroDeCaja;
	
	private String nombre;
	private String descripcion;
	private Double precio;
	private Categoria categoria;
	
	
	public CajaDeRegalo (String nombre, String descripcion, Double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
