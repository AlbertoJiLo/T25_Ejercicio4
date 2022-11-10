package com.example.T25.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T25.dto.Salas;


public interface ISalasDAO extends JpaRepository<Salas, Long>{
	;
	
}
