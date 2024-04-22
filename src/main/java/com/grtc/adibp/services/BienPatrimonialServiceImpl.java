package com.grtc.adibp.services;

import com.grtc.adibp.entities.BienPatrimonialEntity;
import com.grtc.adibp.repositories.IBaseRepository;
import com.grtc.adibp.repositories.IBienPatrimonialRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BienPatrimonialServiceImpl extends BaseServiceImpl<BienPatrimonialEntity, Long>  implements IBienPatrimonialService {
    @Autowired
    private IBienPatrimonialRepository bienPatrimonialRepository;

    public BienPatrimonialServiceImpl(IBaseRepository<BienPatrimonialEntity, Long> baseRepository) {
        super(baseRepository);
    }
    @Override
    @Transactional
    public List<BienPatrimonialEntity> findByEstadoBueno(){
        try {
            List<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoBueno();
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
    public List<BienPatrimonialEntity> findByEstadoMaloRecuperable(){
        try {
            List<BienPatrimonialEntity> bienPatrimonialEntiys = bienPatrimonialRepository.findByEstadoMaloRecuperable();
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

}
