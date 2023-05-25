package com.prueba.web.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba.web.crud.model.Persona;
import com.prueba.web.crud.service.IPersonaService;

@Controller
public class PersonaController {
	@Autowired
	private IPersonaService perSer;
	
	@GetMapping("/")
	public String lista(Model model) {
		var personas = perSer.listarPersonas();
		model.addAttribute("personas", personas);
		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(Persona persona) {
		return "modificar";
	}
	
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
		perSer.guardar(persona);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(Persona persona, Model model) {
		persona = perSer.encontrarPersona(persona);
		model.addAttribute("persona", persona);
		return "modificar";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Persona persona) {
		perSer.eliminar(persona);
		return "redirect:/";
	}
}