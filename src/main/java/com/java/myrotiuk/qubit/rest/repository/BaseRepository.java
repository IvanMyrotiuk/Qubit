package com.java.myrotiuk.qubit.rest.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

/**
 * Created by Ivan on 20.01.2019. All rights reserved.
 */
@NoRepositoryBean
public interface BaseRepository<T,ID> extends Repository<T,ID> {

    <S extends T> S save(S entity);
}
