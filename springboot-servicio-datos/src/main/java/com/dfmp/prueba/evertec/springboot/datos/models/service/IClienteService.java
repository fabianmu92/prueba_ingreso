package com.dfmp.prueba.evertec.springboot.datos.models.service;

import java.util.List;

import com.dfmp.prueba.evertec.springboot.datos.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public Cliente findById(String id);
	public Cliente save(Cliente cliente);
	public void deleteById(String id);
	public boolean existsById(String id);
}
