package com.grtc.adibp.repositories;

import com.grtc.adibp.entities.DesplazamientoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDesplazamientoRepository extends IBaseRepository<DesplazamientoEntity, Long>{

    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.bienPatrimonial b WHERE b.codigoPatrimonial = :codigoPatrimonial")
    List<DesplazamientoEntity> findByCodigoPatrimonial(@Param("codigoPatrimonial") String filtro);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.bienPatrimonial b WHERE b.codigoPatrimonial = :codigoPatrimonial")
    Page<DesplazamientoEntity> findByCodigoPatrimonial(@Param("codigoPatrimonial") String filtro, Pageable pageable);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.areaOrigen a WHERE a.name LIKE %:filtro%")
    List<DesplazamientoEntity> findByAreaOrigen(@Param("filtro") String filtro);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.areaOrigen a WHERE a.name LIKE %:filtro%")
    Page<DesplazamientoEntity> findByAreaOrigen(@Param("filtro") String filtro, Pageable pageable);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.areaDestino a WHERE a.name LIKE %:filtro%")
    List<DesplazamientoEntity> findByAreaDestino(@Param("filtro") String filtro);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.areaDestino a WHERE a.name LIKE %:filtro%")
    Page<DesplazamientoEntity> findByAreaDestino(@Param("filtro") String filtro, Pageable pageable);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.empleadoOrigen e WHERE e.name LIKE %:filtro% OR e.lastName LIKE %:filtro%")
    List<DesplazamientoEntity> findByEmpleadoOrigen(@Param("filtro") String filtro);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.empleadoOrigen e WHERE e.name LIKE %:filtro% OR e.lastName LIKE %:filtro%")
    Page<DesplazamientoEntity> findByEmpleadoOrigen(@Param("filtro") String filtro, Pageable pageable);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.empleadoDestino e WHERE e.name LIKE %:filtro% OR e.lastName LIKE %:filtro%")
    List<DesplazamientoEntity> findByEmpleadoDestino(@Param("filtro") String filtro);
    @Query(value = "SELECT d FROM DesplazamientoEntity d JOIN d.empleadoDestino e WHERE e.name LIKE %:filtro% OR e.lastName LIKE %:filtro%")
    Page<DesplazamientoEntity> findByEmpleadoDestino(@Param("filtro") String filtro, Pageable pageable);
    @Query(value = "SELECT d FROM DesplazamientoEntity d WHERE d.fecha = :filtro")
    List<DesplazamientoEntity> findByFecha(@Param("filtro") String filtro);
    @Query(value = "SELECT d FROM DesplazamientoEntity d WHERE d.fecha = :filtro")
    Page<DesplazamientoEntity> findByFecha(@Param("filtro") String filtro, Pageable pageable);
    @Query(value = "SELECT d FROM DesplazamientoEntity d WHERE YEAR(d.fecha) = :filtro")
    List<DesplazamientoEntity> findByAnio(@Param("filtro") String filtro);
    @Query(value = "SELECT d FROM DesplazamientoEntity d WHERE YEAR(d.fecha) = :filtro")
    Page<DesplazamientoEntity> findByAnio(@Param("filtro") String filtro, Pageable pageable);
    @Query(value = "SELECT d FROM DesplazamientoEntity d WHERE CONCAT(YEAR(d.fecha), '-', MONTH(d.fecha)) = :filtro")
    List<DesplazamientoEntity> findByMesAndAnio(@Param("filtro") String filtro);
    @Query(value = "SELECT d FROM DesplazamientoEntity d WHERE CONCAT(YEAR(d.fecha), '-', MONTH(d.fecha)) = :filtro")
    Page<DesplazamientoEntity> findByMesAndAnio(@Param("filtro") String filtro, Pageable pageable);
}
