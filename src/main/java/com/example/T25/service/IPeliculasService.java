package com.example.T25.service;

import java.util.List;

import com.example.T25.dto.Peliculas;

public interface IPeliculasService {

	//Metodos del CRUD
	
	public List<Peliculas> listarPeliculas(); //Listar All 
	
	public Peliculas crearPelicula(Peliculas peliculas);	//CREATE
	
	public Peliculas leerPelicula(Long id); // READ
		
	public Peliculas actualizarPelicula(Peliculas pelicula); // UPDATE
	
	public void borrarPelicula(Long id);// DELETE
	
	
}