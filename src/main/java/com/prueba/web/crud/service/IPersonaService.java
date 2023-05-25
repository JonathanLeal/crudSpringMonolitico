package com.prueba.web.crud.service;

import java.util.List;

import com.prueba.web.crud.model.Persona;

public interface IPersonaService {
	public List<Persona> listarPersonas();
	public void guardar(Persona persona);
	public void eliminar(Persona persona);
	public Persona encontrarPersona(Persona persona);
}
