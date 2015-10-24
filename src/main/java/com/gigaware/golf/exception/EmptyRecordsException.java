/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.exception;

import java.io.Serializable;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public class EmptyRecordsException 
	extends Exception 
	implements Serializable {
	
	private static final long serialVersionUID = 6937801463709653968L;

	public EmptyRecordsException() {

    }

    public EmptyRecordsException(Exception e) {
        super(e);
    }

    public EmptyRecordsException(String message) {
        super(message);
    }
    
}
