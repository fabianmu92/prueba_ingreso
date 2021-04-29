package com.dfmp.prueba.evertec.springboot.oauth.services;

import com.dfmp.prueba.evertec.springboot.oauth.models.entity.Usuario;

public interface  IUsuarioService {
	public Usuario findByUsername(String username);
}
