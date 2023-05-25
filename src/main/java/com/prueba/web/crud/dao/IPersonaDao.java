package com.prueba.web.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.prueba.web.crud.model.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long>{

}
