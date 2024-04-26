package com.grtc.adibp.controllers;

import com.grtc.adibp.entities.DesplazamientoEntity;
import com.grtc.adibp.services.DesplazamientoServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/adibp/desplazamientos")
@PreAuthorize("hasRole('ADMIN') or hasRole('SUPPORT')")
public class DesplazamientoController  extends BaseControllerImpl<DesplazamientoEntity, DesplazamientoServiceImpl>{
    @GetMapping("/buscar-codigo-patrimonial")
    public ResponseEntity<?> ListByCodigoPatrimonial(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByCodigoPatrimonial(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-codigo-patrimonial-paginado")
    public ResponseEntity<?> ListByCodigoPatrimonial(@RequestParam String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.finByCodigoPatrimonial(filtro, pageable));
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-area-origen")
    public ResponseEntity<?> ListByAreaOrigen(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByAreaOrigen(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-area-origen-paginado")
    public ResponseEntity<?> ListByAreaOrigen(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByAreaOrigen(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-area-destino")
    public ResponseEntity<?> ListByAreaDestine(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByAreaDestino(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-area-destino-paginado")
    public ResponseEntity<?> ListByAreaDestine(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByAreaDestino(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-empleado-origen")
    public ResponseEntity<?> ListByEmployableOrigen(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEmpleadoOrigen(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-empleado-origen-paginado")
    public ResponseEntity<?> ListByEmployableOrigen(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEmpleadoOrigen(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-empleado-destino")
    public ResponseEntity<?> ListByEmployableDestine(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEmpleadoDestino(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-empleado-destino-paginado")
    public ResponseEntity<?> ListByEmployableDestine(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEmpleadoDestino(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-fecha")
    public ResponseEntity<?> ListByFecha(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByFecha(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-fecha-paginado")
    public ResponseEntity<?> ListByFecha(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByFecha(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-anio")
    public ResponseEntity<?> ListByAnio(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByAnio(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-anio-paginado")
    public ResponseEntity<?> ListByAnio(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByAnio(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-anio-y-mes")
    public ResponseEntity<?> ListByMesAndAnio(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByMesAndAnio(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
    @GetMapping("/buscar-anio-y-mes-paginado")
    public ResponseEntity<?> ListByMesAndAnio(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findByMesAndAnio(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde\"}");
        }
    }
}
