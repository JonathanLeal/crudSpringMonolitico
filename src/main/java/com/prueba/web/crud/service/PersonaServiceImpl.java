package com.prueba.web.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.web.crud.dao.IPersonaDao;
import com.prueba.web.crud.model.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao perDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> listarPersonas() {
		// TODO Auto-generated method stub
		return (List<Persona>) perDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		perDao.save(persona);
	}

	@Override
	@Transactional
	public void eliminar(Persona persona) {
		// TODO Auto-generated method stub
		perDao.delete(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona encontrarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return perDao.findById(persona.getId()).orElse(null);
	}

}
