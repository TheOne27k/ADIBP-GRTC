package com.grtc.adibp.services;

import com.grtc.adibp.entities.BienPatrimonialEntity;
import com.grtc.adibp.repositories.IBaseRepository;
import com.grtc.adibp.repositories.IBienPatrimonialRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BienPatrimonialServiceImpl extends BaseServiceImpl<BienPatrimonialEntity, Long>  implements IBienPatrimonialService {
    @Autowired
    private IBienPatrimonialRepository bienPatrimonialRepository;

    public BienPatrimonialServiceImpl(IBaseRepository<BienPatrimonialEntity, Long> baseRepository) {
        super(baseRepository);
    }
    @Override
    public List<BienPatrimonialEntity> findByEstadoBueno(){
        try {
            List<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoBueno();
            return bienPatrimonialEntiys;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Page<BienPatrimonialEntity> findByEstadoBueno(Pageable pageable) throws Exception {
        try {
            Page<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoBueno(pageable);
            return bienPatrimonialEntiys;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<BienPatrimonialEntity> findByEstadoRecuperable(){
        try {
            List<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoRecuperable();
            return bienPatrimonialEntiys;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Page<BienPatrimonialEntity> findByEstadoRecuperable(Pageable pageable) throws Exception {
        try {
            Page<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoRecuperable(pageable);
            return bienPatrimonialEntiys;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<BienPatrimonialEntity> findByEstadoMaloRecuperable(){
        try {
            List<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoMaloRecuperable();
            return bienPatrimonialEntiys;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Page<BienPatrimonialEntity> findByEstadoMaloRecuperable(Pageable pageable) throws Exception {
        try {
            Page<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoMaloRecuperable(pageable);
            return bienPatrimonialEntiys;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<BienPatrimonialEntity> findByEstadoMaloNoRecuperable(){
        try {
            List<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoMaloNoRecuperable();
            return bienPatrimonialEntiys;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Page<BienPatrimonialEntity> findByEstadoMaloNoRecuperable(Pageable pageable) throws Exception {
        try {
            Page<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoMaloNoRecuperable(pageable);
            return bienPatrimonialEntiys;
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

}
