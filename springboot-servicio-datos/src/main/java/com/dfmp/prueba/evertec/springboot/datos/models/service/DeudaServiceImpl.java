package com.dfmp.prueba.evertec.springboot.datos.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dfmp.prueba.evertec.springboot.datos.models.dao.DeudaDAO;
import com.dfmp.prueba.evertec.springboot.datos.models.entity.Deuda;

@Service
public class DeudaServiceImpl implements IDeudaService {

	@Autowired
	private DeudaDAO deudaDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Deuda> findAll() {
		return (List<Deuda>)deudaDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Deuda findById(String id) {
		return deudaDAO.findById(id).orElse(null);
	}

	@Override
	
	public List<Deuda> findByClienteId(String clienteId) {
		return (List<Deuda>)deudaDAO.findByClienteId(clienteId);
	}

	@Override
	@Transactional
	public Deuda save(Deuda deuda) {
		return deudaDAO.save(deuda);
	}


	@Override
	@Transactional
	public void deleteById(String id) {
		deudaDAO.deleteById(id);
	}
	
	@Override
	@Transactional
	public boolean existsById(String id) {
		return deudaDAO.existsById(id);
	}

}
