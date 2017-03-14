package com.examen.car.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.examen.car.model.Coche;
import com.examen.car.repository.CocheRepository;
import com.examen.car.service.CocheService;
import com.examples.spring.model.Persona;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class CocheController {
	
	private static final Logger logger = LoggerFactory.getLogger(CocheController.class);
	public static final String VIEW_ADD_COCHE = "addCoche";
	@Autowired
	CocheRepository CocheRepository;
	@Autowired
	CocheService CocheService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@GetMapping(value = "/")
	public String findAllCoche(Model model) {
		model.addAttribute("Coche", CocheService.getCoche());
		return "listar";
	}
	
	@GetMapping(value="/editar")
	public String editar(Model model){
		model.addAttribute("coche", new Coche());
		return "editar";
	}
	
	@PostMapping("/add")
	public String addCoche(@Valid @ModelAttribute("Coche") Coche coche, BindingResult result, Model model) {
	//	cocheValidator.validate(coche, result);
		
		if (result.hasErrors()){
			System.out.println(result.getAllErrors());
			return VIEW_ADD_COCHE;
		}
	
		if (CocheService.cocheAlreadyExists(coche, result)){
			return VIEW_ADD_COCHE;
		}else {
			CocheService.saveCoche(coche);
			return "listar";	
		}
	
	
	
	
	
	
}
	
	
	
	

