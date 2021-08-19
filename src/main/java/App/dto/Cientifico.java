package App.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cientificos") 
public class Cientifico {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dni;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "id")
	private List<AsignadoA> AsignadoA;

	// Constructores
	public Cientifico() {

	}

	public Cientifico(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	// Getters y setters
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignadoA() {
		return AsignadoA;
	}

	public void setAsignadoA(List<AsignadoA> asignadoA) {
		AsignadoA = asignadoA;
	}

	// toString
	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
