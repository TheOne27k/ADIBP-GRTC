package com.grtc.adibp.controllers;

import com.grtc.adibp.entities.BienPatrimonialEntity;
import com.grtc.adibp.services.BienPatrimonialServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/adibp/bienes-patrimoniales")
public class BienPatrimonialController extends BaseControllerImpl<BienPatrimonialEntity, BienPatrimonialServiceImpl>{
    @GetMapping("/buscar-codigo-patrimonial")
    public ResponseEntity<?> ListByCodigoPatrimonial(@RequestParam String codigoPatrimonial){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByCodigoPatrimonial(codigoPatrimonial));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-estado-bueno")
    public ResponseEntity<?> GetByEstadoBueno(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEstadoBueno());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-estado-bueno-paginado")
    public ResponseEntity<?> GetByEstadoBueno(@RequestParam Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEstadoBueno(pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-estado-recuperable")
    public ResponseEntity<?> GetByEstadoRecuperable(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEstadoRecuperable());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-estado-recuperable-paginado")
    public ResponseEntity<?> GetByEstadoRecuperable(@RequestParam Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEstadoRecuperable(pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-estado-malo-recuperable")
    public ResponseEntity<?> GetByEstadoMaloRecuperable(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEstadoMaloRecuperable());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-estado-malo-recuperable-paginado")
    public ResponseEntity<?> GetByEstadoMaloRecuperable(@RequestParam Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEstadoMaloRecuperable(pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-estado-malo-no-recuperable")
    public ResponseEntity<?> GetByEstadoMaloNoRecuperable(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEstadoMaloNoRecuperable());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-estado-malo-no-recuperable-paginado")
    public ResponseEntity<?> GetByEstadoMaloNoRecuperable(@RequestParam Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEstadoMaloNoRecuperable(pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
}
