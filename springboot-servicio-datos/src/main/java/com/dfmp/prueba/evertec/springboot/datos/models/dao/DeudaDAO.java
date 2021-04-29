package com.dfmp.prueba.evertec.springboot.datos.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dfmp.prueba.evertec.springboot.datos.models.entity.Deuda;

public interface DeudaDAO extends CrudRepository<Deuda, String> {
	
	public List<Deuda> findByClienteId(String clientId);

}
