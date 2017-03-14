package com.examen.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.examen.car.model.Coche;
import com.examen.car.repository.CocheRepository;


@Service
public class CocheService {
	
	@Autowired
	CocheRepository CocheRepository;
	
//	@Transactional
	public List <Coche> getCoche(){
		return CocheRepository.findAll();
	}

	public boolean cocheAlreadyExists(Coche coche, BindingResult result) {
		// TODO Auto-generated method stub
		return false;
	}

	public void saveCoche(Coche coche) {
		// TODO Auto-generated method stub
		
	}


}