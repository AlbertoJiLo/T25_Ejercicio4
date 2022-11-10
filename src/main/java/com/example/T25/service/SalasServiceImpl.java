package com.example.T25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T25.dao.ISalasDAO;
import com.example.T25.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService{
	
	//Utilizamos los metodos de la interface ISalaDAO, es como si instanciaramos.
	@Autowired
	ISalasDAO iSalasDAO;
	
	@Override
	public List<Salas> listarSalas() {
		return iSalasDAO.findAll();
	}
	
	@Override
	public Salas crearSala(Salas sala) {
		return iSalasDAO.save(sala);
	}

	@Override
	public Salas leerSala(Long id) {
		return iSalasDAO.findById(id).get();
	}


	@Override
	public Salas actualizarSala(Salas sala) {
		return iSalasDAO.save(sala);
	}

	@Override
	public void borrarSala(Long id) {
		iSalasDAO.deleteById(id);
	}

}
