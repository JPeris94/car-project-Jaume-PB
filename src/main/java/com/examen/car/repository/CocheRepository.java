package com.examen.car.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.car.model.Coche;

@Repository
public interface CocheRepository {

	List<Coche> findAll();

	
}
