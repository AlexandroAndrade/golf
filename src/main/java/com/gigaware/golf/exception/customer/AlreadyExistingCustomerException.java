/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.exception.customer;

import java.io.Serializable;

/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
public class AlreadyExistingCustomerException
        extends Exception
        implements Serializable {

    private static final long serialVersionUID = -7747626887466967549L;

    public AlreadyExistingCustomerException() {
        super();
    }

    public AlreadyExistingCustomerException( String message ) {
        super( message );
    }

}
