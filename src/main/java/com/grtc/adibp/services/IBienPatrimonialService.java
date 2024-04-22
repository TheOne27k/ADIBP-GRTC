package com.grtc.adibp.services;

import com.grtc.adibp.entities.BienPatrimonialEntity;

import java.util.List;


public interface IBienPatrimonialService extends IBaseService<BienPatrimonialEntity, Long>{
    public List<BienPatrimonialEntity> findByEstadoBueno() throws Exception;
    public List<BienPatrimonialEntity> findByEstadoRecuperable() throws Exception;
    public List<BienPatrimonialEntity> findByEstadoMaloRecuperable() throws Exception;
    public List<BienPatrimonialEntity> findByEstadoMaloNoRecuperable() throws Exception;
}
