package com.dfmp.prueba.evertec.springboot.datos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.dfmp.prueba.evertec.springboot.datos.models.entity.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, String>{

}
