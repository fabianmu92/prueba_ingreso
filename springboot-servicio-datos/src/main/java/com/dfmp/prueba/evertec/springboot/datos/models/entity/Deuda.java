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
import javax.validation.constraints.Size;

@Entity
@Table(name="deudas")
public class Deuda implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="identificador",nullable=false, length = 15)
	@NotEmpty(message ="No parametro identificador no puede quedar en blanco.")
	@Size(max= 15, message = "El parametro identificador no puede tener un tamaño superior a 15 caracteres.")
	@NotNull(message = "El parametro identificador no puede ser nulo.")
	private String id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vencimiento")
	@NotNull(message = "El parametro fecha de vencimiento no puede ser nulo.")
	@NotEmpty(message ="El parametro fecha de vencimiento no puede quedar en blanco.")
	private Date fechaVencimiento;
	
	@Column(name="monto", precision = 20, nullable = false)
	@NotEmpty(message ="No parametro monto no puede quedar en blanco.")
	@NegativeOrZero(message="El monto no puede ser una cantidad positiva superior a 0.")
	@NotNull(message = "El parametro monto no puede ser nulo.")
	private BigDecimal monto;
	
	/*@ManyToOne(optional = false)
	private Cliente cliente;*/
	@Column(name="cliente_identificador",nullable=false, length = 15)
	@NotNull(message = "El parametro clienId no puede ser nulo.")
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
