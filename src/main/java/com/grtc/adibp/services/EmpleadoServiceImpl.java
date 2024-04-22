package com.grtc.adibp.services;

import com.grtc.adibp.entities.EmpleadoEntity;
import com.grtc.adibp.repositories.IBaseRepository;
import com.grtc.adibp.repositories.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImpl extends BaseServiceImpl<EmpleadoEntity, Long> implements IEmpleadoService {

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl(IBaseRepository<EmpleadoEntity, Long> baseRepository) {
        super(baseRepository);
    }
}
