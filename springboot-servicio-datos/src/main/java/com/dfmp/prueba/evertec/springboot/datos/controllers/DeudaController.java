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
import com.dfmp.prueba.evertec.springboot.datos.models.entity.Deuda;
import com.dfmp.prueba.evertec.springboot.datos.models.service.IDeudaService;

@RestController
@RequestMapping("deudas")
public class DeudaController {
	
	@Autowired
	private IDeudaService deudaService;
	
	/**
	 * endpoint para listar todos las deudas registradas.
	 * @return Lista de deudas que estan registrados.
	 */
	@GetMapping("/listar")
	public List<Deuda> listar(){
		return deudaService.findAll();
	}
	/**
	 * Endpoint para obtener una deuda que corresponda con el identificador dado
	 * @param id identificador de la deuda a buscar, este parametro se recibe en la url.
	 * @return deuda que su identificador correponda  con el parametro recibido.
	 */
	@GetMapping("/ver/{id}")
	public Deuda ver(@PathVariable("id") String id) {
		return deudaService.findById(id);
	}
	/**
	 * Endpoint para listar las deudas por el codigo del cliente
	 * @param clientId
	 * @return Lista de deudas que pertenencen a un cliente que corresponda por el identificador buscado, en caso contrario retorna nulo.
	 */
	@GetMapping("/listar/cliente/{id}")
	public List<Deuda> listarCliente(@PathVariable("id") String clientId) {
		return deudaService.findByClienteId(clientId);
	}
	/**
	 * Endpoint para registrar una deuda a un cliente
	 * @param deuda objeto de la deuda a registrar
	 * @return la deuda registrado si el proceso fue exitoso, en caso contrario retorna nulo.
	 */
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Deuda crear(@Valid @RequestBody Deuda deuda) {
		return deudaService.save(deuda);
	}
	/**
	 * 	Endpoint para actualizar una deuda, solo se puede actualizar la fecha y el monto.
	 * @param deuda  objeto de la deuda actualizada
	 * @param id identificador de la deuda a actualizar, este parametro se recibe en la url.
	 * @return deuda actualizado si el proceso fue exitoso, en caso contrario retorna nulo.
	 */
	@PutMapping("/actualizar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Deuda actualizar(@Valid @RequestBody Deuda deuda, @PathVariable("id") String id) {
		Deuda updateDeuda=deudaService.findById(id);
		if(updateDeuda!=null) {
			updateDeuda.setFechaVencimiento(deuda.getFechaVencimiento());
			updateDeuda.setMonto(deuda.getMonto());
			updateDeuda=deudaService.save(updateDeuda);			
		}
		return updateDeuda;
	}
	/**
	 * Endpoint para eliminar una deuda por du identificador
	 * @param id  identificador de la deuda a eliminar, este parametro se recibe en la url.
	 */
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable("id") String id) {
		if(deudaService.existsById(id))
			deudaService.deleteById(id);
	}

}
