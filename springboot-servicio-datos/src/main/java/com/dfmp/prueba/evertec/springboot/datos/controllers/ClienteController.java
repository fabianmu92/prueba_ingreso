package com.dfmp.prueba.evertec.springboot.datos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dfmp.prueba.evertec.springboot.datos.models.entity.Cliente;
import com.dfmp.prueba.evertec.springboot.datos.models.service.IClienteService;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	@Autowired
	private IClienteService clienteService;

	/**
	 * endpoint para listar todos los clientes registrados.
	 * @return Lista de clientes que estan registrados.
	 */
	@GetMapping("/listar")
	public List<Cliente> listar(){
		return clienteService.findAll();
	}
	/**
	 * Endpoint para obtener los datos de cliente
	 * @param id identificador del cliente a buscar, este parametro se recibe en la url.
	 * @return cliente que su identificador correponda  con el parametro recibido.
	 */
	@GetMapping("/ver/{id}")
	public Cliente ver(@PathVariable String id) {
		return clienteService.findById(id);
	}
	/**
	 * Endpoint para registrar un cliente
	 * @param cliente objeto del cliente a registrar
	 * @return cliente registrado si el proceso fue exitoso, en caso contrario retorna nulo.
	 */
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente crear (@Valid @RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	/**
	 * 	Endpoint para actualizar un cliente, solo se puede actualizar el correo y su nombre.
	 * @param cliente objeto del nuevo cliente
	 * @param id identificador del cliente a actualizar, este parametro se recibe en la url.
	 * @return cliente actualizado si el proceso fue exitoso, en caso contrario retorna nulo.
	 */
	@PutMapping("/actualizar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente actualizar(@Valid @RequestBody Cliente cliente, @PathVariable("id") String id) {
		Cliente updateCliente=clienteService.findById(id);
		if(updateCliente != null) { 
			updateCliente.setNombre(cliente.getNombre());
			updateCliente.setCorreo(cliente.getCorreo());
			updateCliente=clienteService.save(updateCliente);
		}
		return updateCliente;
	}
	/**
	 * Endpoint para eliminar un cliente por su identificador
	 * @param id identificador del cliente a eliminar, este parametro se recibe en la url.
	 */
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable("id") String id) {
		if(clienteService.existsById(id))
			clienteService.deleteById(id);
	}
}
