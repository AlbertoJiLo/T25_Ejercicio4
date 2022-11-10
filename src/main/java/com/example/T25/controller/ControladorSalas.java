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

import com.example.T25.dto.Salas;
import com.example.T25.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorSalas {
	
	@Autowired
	SalasServiceImpl salasServiceImpl;
	
	@GetMapping("/salas")
	public List<Salas> listarSalas(){
		return salasServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Salas crearSala(@RequestBody Salas sala) {
		
		return salasServiceImpl.crearSala(sala);
		
	}
	
	
	@GetMapping("/salas/{id}")
	public Salas leerSala(@PathVariable(name="id") Long id) {
		
		Salas sala= new Salas();
		
		sala=salasServiceImpl.leerSala(id);
		
		System.out.println("Sala segun ID: "+sala);
		
		return sala;
	}
	
	@PutMapping("/salas/{id}")
	public Salas actualizarSala(@PathVariable(name="id")Long id,@RequestBody Salas sala) {
		
		Salas sala_seleccionado= new Salas();
		Salas sala_actualizado= new Salas();
		
		sala_seleccionado= salasServiceImpl.leerSala(id);

		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula_id(sala.getPelicula_id());

		
		sala_actualizado = salasServiceImpl.actualizarSala(sala_seleccionado);
		
		System.out.println("El sala actualizado es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{id}")
	public void borrarSala(@PathVariable(name="id")Long id) {
		salasServiceImpl.borrarSala(id);
	}
	
	
}
