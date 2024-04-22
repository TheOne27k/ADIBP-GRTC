package com.grtc.adibp.services;

import com.grtc.adibp.entities.DesplazamientoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDesplazamientoService extends IBaseService<DesplazamientoEntity, Long>{
    List<DesplazamientoEntity> findByCodigoPatrimonial( String filtro) throws Exception;
    Page<DesplazamientoEntity> finByCodigoPatrimonial (String filtro, Pageable pageable) throws Exception;
    List<DesplazamientoEntity> findByAreaOrigen(String filtro) throws Exception;
    Page<DesplazamientoEntity> findByAreaOrigen(String filtro, Pageable pageable) throws Exception;
    List<DesplazamientoEntity> findByAreaDestino(String filtro) throws Exception;
    Page<DesplazamientoEntity> findByAreaDestino(String filtro, Pageable pageable) throws Exception;
    List<DesplazamientoEntity> findByEmpleadoOrigen(String filtro) throws Exception;
    Page<DesplazamientoEntity> findByEmpleadoOrigen(String filtro, Pageable pageable) throws Exception;
    List<DesplazamientoEntity> findByEmpleadoDestino(String filtro) throws Exception;
    Page<DesplazamientoEntity> findByEmpleadoDestino(String filtro, Pageable pageable) throws Exception;
}
