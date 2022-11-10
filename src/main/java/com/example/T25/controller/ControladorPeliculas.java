package com.example.T25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.T25.dto.Peliculas;
import com.example.T25.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorPeliculas {
	
	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listarPeliculas(){
		return peliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Peliculas crearPelicula(@RequestBody Peliculas pelicula) {
		
		return peliculasServiceImpl.crearPelicula(pelicula);
		
	}
	
	
	@GetMapping("/peliculas/{id}")
	public Peliculas leerPelicula(@PathVariable(name="id") Long id) {
		
		Peliculas pelicula= new Peliculas();
		
		pelicula=peliculasServiceImpl.leerPelicula(id);
		
		System.out.println("Pelicula segun ID: "+pelicula);
		
		return pelicula;
	}
	
	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarPelicula(@PathVariable(name="id")Long id,@RequestBody Peliculas pelicula) {
		
		Peliculas pelicula_seleccionado= new Peliculas();
		Peliculas pelicula_actualizado= new Peliculas();
		
		pelicula_seleccionado= peliculasServiceImpl.leerPelicula(id);

		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacion_edad(pelicula.getCalificacion_edad());
		
		pelicula_actualizado = peliculasServiceImpl.actualizarPelicula(pelicula_seleccionado);
		
		System.out.println("El pelicula actualizado es: "+ pelicula_actualizado);
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void borrarPelicula(@PathVariable(name="id")Long id) {
		peliculasServiceImpl.borrarPelicula(id);
	}
	
	
}
