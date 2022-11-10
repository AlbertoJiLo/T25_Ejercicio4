package com.example.T25.dto;

import java.util.List;

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
@Table(name="peliculas")

public class Peliculas {

	//Atributos de la entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int calificacion_edad;
	
	@OneToMany
	@JoinColumn(name="pelicula_id")
	private List<Peliculas> pelicula_id;
	
	//Constructores
	
	public Peliculas() {
		
	}
	
	public Peliculas(Long id, String nombre, int calificacion_edad) {
		this.id=id;
		this.nombre=nombre;
		this.calificacion_edad=calificacion_edad;
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
		
	public int getCalificacion_edad() {
		return calificacion_edad;
	}

	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Peliculas")
	public List<Peliculas> getPeliculas_id() {
		return pelicula_id;
	}

	public void setPeliculas_id(List<Peliculas> pelicula_id) {
		this.pelicula_id = pelicula_id;
	}
	
	

	//To string personalizado
	@Override
	public String toString() {
		return "Peliculas [id = " + id +", nombre = " + nombre +", calificacion edad " + calificacion_edad + " ] ";
	}
}
