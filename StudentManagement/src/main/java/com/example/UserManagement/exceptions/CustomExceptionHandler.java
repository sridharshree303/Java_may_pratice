package com.example.UserManagement.exceptions;

import javax.transaction.InvalidTransactionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);
	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(){
		LOG.error("handleUserNotFoundException");
		String s = " Student not found";
		HttpHeaders headers = new HttpHeaders();
		headers.add("messgae","User not found");
		return new ResponseEntity<Object>(s,headers,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DataAlreadyExistsException.class)
	public ResponseEntity<Object> handleUserAlreadyExistsException(){
		LOG.error("handleUserAlreadyExistsException");
		String s = " Student already exist";
		HttpHeaders headers = new HttpHeaders();
		headers.add("message","User already exists");
		return new ResponseEntity<Object>(s,headers,HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(InvalidTransactionException.class)
	public ResponseEntity<Object> handleInvalidTransactionException(){
		LOG.error("handleInvalidTransactionException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message","Invalid Transaction Details Provided");
		return new ResponseEntity<Object>(null,headers,HttpStatus.BAD_REQUEST);
	}
}
