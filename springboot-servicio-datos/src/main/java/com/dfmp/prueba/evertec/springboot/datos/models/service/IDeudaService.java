package com.dfmp.prueba.evertec.springboot.datos.models.service;

import java.util.List;

import com.dfmp.prueba.evertec.springboot.datos.models.entity.Deuda;

public interface IDeudaService {
	List<Deuda> findAll();
	Deuda findById(String id);
	List<Deuda> findByClienteId(String clienteId);
	public Deuda save(Deuda deuda);
	public void deleteById(String id);
	public boolean existsById(String id);
}
