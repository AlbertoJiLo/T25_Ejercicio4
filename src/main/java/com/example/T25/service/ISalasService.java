package com.example.T25.service;

import java.util.List;

import com.example.T25.dto.Salas;

public interface ISalasService {

	//Metodos del CRUD
	
	public List<Salas> listarSalas(); //Listar All 
	
	public Salas crearSala(Salas sala);	//CREATE
	
	public Salas leerSala(Long id); // READ
		
	public Salas actualizarSala(Salas sala); // UPDATE
	
	public void borrarSala(Long id);// DELETE
	
	
}
