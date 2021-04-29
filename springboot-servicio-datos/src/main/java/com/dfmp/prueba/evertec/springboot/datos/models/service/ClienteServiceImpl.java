package com.dfmp.prueba.evertec.springboot.datos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dfmp.prueba.evertec.springboot.datos.models.dao.ClienteDAO;
import com.dfmp.prueba.evertec.springboot.datos.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private ClienteDAO clienteDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>)clienteDAO.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(String id) {
		return clienteDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDAO.save(cliente);
	}


	@Override
	@Transactional
	public void deleteById(String id) {
		clienteDAO.deleteById(id);
	}
	
	@Override
	@Transactional
	public boolean existsById(String id) {
		return clienteDAO.existsById(id);
	}
}
