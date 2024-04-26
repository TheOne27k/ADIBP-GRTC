package com.grtc.adibp.services;

import com.grtc.adibp.entities.DesplazamientoEntity;
import com.grtc.adibp.repositories.IBaseRepository;
import com.grtc.adibp.repositories.IDesplazamientoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DesplazamientoServiceImpl extends BaseServiceImpl<DesplazamientoEntity, Long> implements IDesplazamientoService {

    @Autowired
    private IDesplazamientoRepository desplazamientoRepository;
    public DesplazamientoServiceImpl(IBaseRepository<DesplazamientoEntity, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<DesplazamientoEntity> findByCodigoPatrimonial(String filtro) throws Exception {
        try {
            List<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByCodigoPatrimonial(filtro);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DesplazamientoEntity> finByCodigoPatrimonial(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByCodigoPatrimonial(filtro, pageable);
            return desplazamientos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<DesplazamientoEntity> findByAreaOrigen(String filtro) throws Exception {
        try {
            List<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByAreaOrigen(filtro);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DesplazamientoEntity> findByAreaOrigen(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByAreaOrigen(filtro, pageable);
            return desplazamientos;
        } catch (Exception e) {
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public List<DesplazamientoEntity> findByAreaDestino(String filtro) throws Exception {
        try {
            List<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByAreaDestino(filtro);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DesplazamientoEntity> findByAreaDestino(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByAreaDestino(filtro, pageable);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public List<DesplazamientoEntity> findByEmpleadoOrigen(String filtro) throws Exception {
        try {
            List<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByEmpleadoOrigen(filtro);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DesplazamientoEntity> findByEmpleadoOrigen(String filtro, Pageable pageable) throws Exception {
        try{
            Page<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByEmpleadoOrigen(filtro, pageable);
            return desplazamientos;
        }catch ( Exception e){
        throw  new Exception(e.getMessage());
        }
    }

    @Override
    public List<DesplazamientoEntity> findByEmpleadoDestino(String filtro) throws Exception {
        try {
            List<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByEmpleadoDestino(filtro);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DesplazamientoEntity> findByEmpleadoDestino(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByEmpleadoDestino(filtro, pageable);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public List<DesplazamientoEntity> findByFecha(String filtro) throws Exception {
        try {
            List<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByFecha(filtro);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DesplazamientoEntity> findByFecha(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByFecha(filtro, pageable);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public List<DesplazamientoEntity> findByAnio(String filtro) throws Exception {
        try {
            List<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByAnio(filtro);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DesplazamientoEntity> findByAnio(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByAnio(filtro, pageable);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public List<DesplazamientoEntity> findByMesAndAnio(String filtro) throws Exception {
        try {
            List<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByMesAndAnio(filtro);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }

    @Override
    public Page<DesplazamientoEntity> findByMesAndAnio(String filtro, Pageable pageable) throws Exception {
        try {
            Page<DesplazamientoEntity> desplazamientos = desplazamientoRepository.findByMesAndAnio(filtro, pageable);
            return desplazamientos;
        }catch ( Exception e){
            throw  new Exception(e.getMessage());
        }
    }
}
