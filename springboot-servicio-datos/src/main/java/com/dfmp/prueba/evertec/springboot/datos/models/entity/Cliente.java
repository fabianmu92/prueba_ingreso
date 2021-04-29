package com.dfmp.prueba.evertec.springboot.datos.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="identificador",nullable = false, length = 15)
	@NotEmpty(message ="El parametro identificador no puede quedar en blanco.")
	@NotNull(message = "El parametro identificador no puede ser nulo.")
	@Size(max= 15, message = "El parametro identificador no puede tener un tamaño superior a 15 caracteres.")
	private String id;
	
	@Column(name="nombre",nullable = false, length = 60)
	@NotEmpty(message ="El parametro nombre no puede quedar en blanco.")
	@NotNull(message = "El parametro nombre no puede ser nulo.")
	@Size(max = 15,message = "El parametro nombre no puede tener un tamaño superior a 60 caracteres.")
	private String nombre;
	
	@Column(name="correo", length = 60)
	@Size(max = 15,message = "El parametro correo correo no puede tener un tamaño superior a 60 caracteres.")
	@Email(message = "El parametro correo debe tener un correo valido.")
	private String correo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteId")
	private List<Deuda> deudas;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<Deuda> getDeudas() {
		return deudas;
	}
	public void setDeudas(List<Deuda> deudas) {
		this.deudas = deudas;
	}
	
	
	
	
	
	
	

}
