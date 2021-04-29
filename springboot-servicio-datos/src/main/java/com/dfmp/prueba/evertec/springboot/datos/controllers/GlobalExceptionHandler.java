package com.dfmp.prueba.evertec.springboot.datos.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public @ResponseBody Map<String, Object> handleAllException(Exception ex, WebRequest req) {
		Map<String, Object> errorMap = new HashMap<String, Object>();
		errorMap.put("mensajeUsuario", "Ocurrio un error, intentelo nuevamente");
		errorMap.put("mensajeTecnico", ex.getMessage());

		return errorMap;
	}
}
