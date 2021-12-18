package com.devsuperior.dslearnbds.services.exceptions;

public class UnauthorizedException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UnauthorizedException(String msg) {
		super(msg);
	}
	
	public UnauthorizedException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
