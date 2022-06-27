package com.xender.practical.exception;

import javax.transaction.InvalidTransactionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(){
		LOG.error("handleUserNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("messgae","User not found");
		return new ResponseEntity<Object>(null,headers,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DataAlreadyExistsException.class)
	public ResponseEntity<Object> handleUserAlreadyExistsException(){
		LOG.error("handleUserAlreadyExistsException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message","User already exists");
		return new ResponseEntity<Object>(null,headers,HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(InvalidTransactionException.class)
	public ResponseEntity<Object> handleInvalidTransactionException(){
		LOG.error("handleInvalidTransactionException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message","Invalid Transaction Details Provided");
		return new ResponseEntity<Object>(null,headers,HttpStatus.BAD_REQUEST);
	}
}
