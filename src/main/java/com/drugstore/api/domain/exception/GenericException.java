package com.drugstore.api.domain.exception;

public class GenericException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GenericException(String message) {
		super(message);
	}
	
	public GenericException(String message, Throwable cause) {
		super(message, cause);
	}
}