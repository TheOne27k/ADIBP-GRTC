package com.grtc.adibp.controllers;

import com.grtc.adibp.entities.BaseEntity;
import com.grtc.adibp.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl<E extends BaseEntity, S extends BaseServiceImpl<E, Long>> implements IBaseController<E, Long> {
    @Autowired
    protected S service;

    @GetMapping("")
    public ResponseEntity<?> getAll() throws Exception{
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intentelo de nuevo\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intentelo de nuevo\"}");
        }
    }
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intentelo de nuevo\"}");
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody E entity, @PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(entity, id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intentelo de nuevo\"}");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intentelo de nuevo\"}");
        }
    }
}
