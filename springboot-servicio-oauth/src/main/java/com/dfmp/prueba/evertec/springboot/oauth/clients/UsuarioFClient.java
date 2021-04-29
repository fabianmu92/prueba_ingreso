package com.dfmp.prueba.evertec.springboot.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dfmp.prueba.evertec.springboot.oauth.models.entity.Usuario;

@FeignClient(name="servicio.usuarios")
public interface UsuarioFClient {
	@GetMapping("/usuarios/search/buscar-username")
	public Usuario findByUsername(@RequestParam String username);
}
