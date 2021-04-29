package com.dfmp.prueba.evertec.springboot.datos.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="deudas")
public class Deuda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="identificador",nullable=false, length = 15)
	@NotEmpty(message ="El parámetro identificador no puede quedar en blanco.")
	@Size(max= 15, message = "El parámetro identificador no puede tener un tamaño superior a 15 caracteres.")
	@NotNull(message = "El parámetro identificador no puede ser nulo.")
	private String id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento")
	@JsonFormat(pattern="dd-MM-yyyy")
//	@NotNull(message = "El parámetro fecha de vencimiento no puede ser nulo.")
	private Date fechaVencimiento;
	
	@Column(name="monto", precision = 20, nullable = false)
	@NotNull(message = "El parámetro monto no puede ser nulo.")
	@PositiveOrZero(message="El parámetro monto debe ser superior a 0.")
	private BigDecimal monto;
	
	/*@ManyToOne(optional = false)
	private Cliente cliente;*/
	@Column(name="cliente_identificador",nullable=false, length = 15)
	@NotNull(message = "El parámetro clienteId no puede ser nulo.")
	private String clienteId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getClienteId() {
		return clienteId;
	}

	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}

	/*public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}*/
	
	
	
	
	
	
	
}
