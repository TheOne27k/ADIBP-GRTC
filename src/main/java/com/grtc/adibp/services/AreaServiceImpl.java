package com.grtc.adibp.services;

import com.grtc.adibp.entities.AreaEntity;
import com.grtc.adibp.repositories.IAreaRepository;
import com.grtc.adibp.repositories.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl extends BaseServiceImpl<AreaEntity, Long> implements IAreaService {
    @Autowired
    private IAreaRepository areaRepository;

    public AreaServiceImpl(IBaseRepository<AreaEntity, Long> baseRepository) {
        super(baseRepository);
    }
}
