/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.service.factory;

import java.util.List;

/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
public interface GenericService<T, E extends Throwable> {

    void save( T t ) throws E;
    void saveAll( List<T> ts );
    void update( T t ) throws E;
    void delete( T t );

}
