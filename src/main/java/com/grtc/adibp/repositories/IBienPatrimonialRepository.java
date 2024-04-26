package com.grtc.adibp.repositories;


import com.grtc.adibp.entities.BienPatrimonialEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBienPatrimonialRepository extends IBaseRepository<BienPatrimonialEntity, Long>{
    @Query(value = "SELECT bp FROM BienPatrimonialEntity bp WHERE bp.estado = 0")
    List<BienPatrimonialEntity> findByEstadoBueno();
    @Query(value = "SELECT bp FROM BienPatrimonialEntity bp WHERE bp.estado = 0")
    Page<BienPatrimonialEntity> findByEstadoBueno(Pageable pageable);
    @Query(value = "SELECT bp FROM BienPatrimonialEntity bp WHERE bp.estado = 1")
    List<BienPatrimonialEntity> findByEstadoRecuperable();
    @Query(value = "SELECT bp FROM BienPatrimonialEntity bp WHERE bp.estado = 1")
    Page<BienPatrimonialEntity> findByEstadoRecuperable(Pageable pageable);
    @Query(value = "SELECT bp FROM BienPatrimonialEntity bp WHERE bp.estado = 2")
    List<BienPatrimonialEntity> findByEstadoMaloRecuperable();
    @Query(value = "SELECT bp FROM BienPatrimonialEntity bp WHERE bp.estado = 2")
    Page<BienPatrimonialEntity> findByEstadoMaloRecuperable(Pageable pageable);
    @Query(value = "SELECT bp FROM BienPatrimonialEntity bp WHERE bp.estado = 3")
    List<BienPatrimonialEntity> findByEstadoMaloNoRecuperable();
    @Query(value = "SELECT bp FROM BienPatrimonialEntity bp WHERE bp.estado = 3")
    Page<BienPatrimonialEntity> findByEstadoMaloNoRecuperable(Pageable pageable);
}
