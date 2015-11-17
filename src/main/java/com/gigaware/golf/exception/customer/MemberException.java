/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.exception.customer;

import java.io.Serializable;

/**
 * @author Alex Andrade ( yngwie_alex@hotmail.com )
 */
public class MemberException
        extends Exception
        implements Serializable {

    private static final long serialVersionUID = -7747626887466967549L;

    public MemberException() {
        super();
    }

    public MemberException( String message ) {
        super( message );
    }

}
