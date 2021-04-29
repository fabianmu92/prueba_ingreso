package com.dfmp.prueba.evertec.springboot.usuarios.models;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.dfmp.prueba.evertec.springboot.usuarios.models.entity.Role;

//@RepositoryRestResource(path="roles")
public interface RolesDAO /*extends PagingAndSortingRepository<Role, Long>*/{
	
	
/*	@RestResource(path="buscar-nombre")
	public Role findByNombre(@Param("nombre")String nombre);
*/
}
