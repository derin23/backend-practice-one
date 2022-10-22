package com.derin.backendpracticeone.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Cound not find user with id " + id);
    }
}
