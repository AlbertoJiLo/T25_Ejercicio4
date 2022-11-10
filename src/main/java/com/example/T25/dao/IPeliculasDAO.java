package com.example.T25.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T25.dto.Peliculas;


public interface IPeliculasDAO extends JpaRepository<Peliculas, Long>{
	
}
