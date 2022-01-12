package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class RessourceNotFoundExeptions extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RessourceNotFoundExeptions(String message) {
		super(message);
	}
}
