package com.codewithpiyu.fullstack.exception;

public class UserNotFoundException extends RuntimeException{
 
	public UserNotFoundException(Long id) {
		super("Coud not found the user with id "+id);
			
		
	}
	
}
