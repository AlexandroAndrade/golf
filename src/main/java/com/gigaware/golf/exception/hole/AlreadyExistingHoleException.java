/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.exception.hole;

import java.io.Serializable;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public class AlreadyExistingHoleException 
	extends Exception 
	implements Serializable {

	private static final long serialVersionUID = 2206217570665020822L;

	public AlreadyExistingHoleException(){
    }
    
    public AlreadyExistingHoleException(Exception e){
        super(e);
    }
    
    public AlreadyExistingHoleException(String message){
        super(message);
    }
    
}
