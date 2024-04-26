package com.grtc.adibp.services;

import com.grtc.adibp.entities.BienPatrimonialEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface IBienPatrimonialService extends IBaseService<BienPatrimonialEntity, Long>{
    public BienPatrimonialEntity findByCodigoPatrimonial(String codigoPatrimonial) throws Exception;
    public List<BienPatrimonialEntity> findByEstadoBueno() throws Exception;
    public Page<BienPatrimonialEntity> findByEstadoBueno(Pageable pageable) throws Exception;
    public List<BienPatrimonialEntity> findByEstadoRecuperable() throws Exception;
    public Page<BienPatrimonialEntity> findByEstadoRecuperable(Pageable pageable) throws Exception;
    public List<BienPatrimonialEntity> findByEstadoMaloRecuperable() throws Exception;
    public Page<BienPatrimonialEntity> findByEstadoMaloRecuperable(Pageable pageable) throws Exception;
    public List<BienPatrimonialEntity> findByEstadoMaloNoRecuperable() throws Exception;
    public Page<BienPatrimonialEntity> findByEstadoMaloNoRecuperable(Pageable pageable) throws Exception;
}
