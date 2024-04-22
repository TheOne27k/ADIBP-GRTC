package com.grtc.adibp.services;

import com.grtc.adibp.entities.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<E extends BaseEntity, ID extends Serializable> {

    public List<E> findAll() throws Exception;

    public E findById(ID id) throws  Exception;
    public E save(E entity) throws  Exception;
    public E update(E entity, ID id) throws Exception;
    public boolean delete(ID id) throws  Exception;
}
