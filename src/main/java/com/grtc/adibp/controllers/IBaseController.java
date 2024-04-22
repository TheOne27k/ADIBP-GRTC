package com.grtc.adibp.controllers;

import com.grtc.adibp.entities.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface IBaseController <E extends BaseEntity, ID extends Serializable>{

    public ResponseEntity<?> getAll() throws Exception;

    public ResponseEntity<?> getById(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@RequestBody E entity, @PathVariable ID id);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
