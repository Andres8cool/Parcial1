package com.example.API.REST.services;
import com.example.API.REST.entities.Base;
import com.example.API.REST.entities.Persona;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
public interface BaseService<E extends Base, ID extends Serializable> {
    List<E> findAll() throws Exception;

    E findById(ID id) throws Exception;

    E save(E entity) throws Exception;

    E update(ID id, E entity) throws Exception;

    boolean delete(ID id) throws Exception;
}