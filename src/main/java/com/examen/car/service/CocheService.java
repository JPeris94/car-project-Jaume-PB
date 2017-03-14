package com.examen.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}