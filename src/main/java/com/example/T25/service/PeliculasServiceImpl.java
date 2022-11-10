package com.example.T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T25.dao.IPeliculasDAO;
import com.example.T25.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService{
	
	//Utilizamos los metodos de la interface IPeliculaDAO, es como si instanciaramos.
	@Autowired
	IPeliculasDAO iPeliculaDAO;
	
	@Override
	public List<Peliculas> listarPeliculas() {
		return iPeliculaDAO.findAll();
	}
	
	@Override
	public Peliculas crearPelicula(Peliculas pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Peliculas leerPelicula(Long id) {
		return iPeliculaDAO.findById(id).get();
	}


	@Override
	public Peliculas actualizarPelicula(Peliculas pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void borrarPelicula(Long id) {
		iPeliculaDAO.deleteById(id);
	}

}
