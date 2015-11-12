/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.service.factory;

import java.util.List;

/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
public interface GenericService<T> {

    void save( T t );
    void saveAll( List<T> ts );
    void update( T t );
    void delete( T t );

}
