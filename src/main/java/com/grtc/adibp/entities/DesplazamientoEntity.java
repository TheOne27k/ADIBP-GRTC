package com.grtc.adibp.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "desplazamientos")
public class DesplazamientoEntity extends BaseEntity {

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "desplazamiento_bienp",
            joinColumns = @JoinColumn(name = "desplazamiento_id"),
            inverseJoinColumns = @JoinColumn(name = "bienpatrimonial_id")
    )
    private List<BienPatrimonialEntity> bienPatrimonial;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_area_origen")
    private AreaEntity areaOrigen;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_area_destino")
    private AreaEntity areaDestino;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_empleado_origen")
    private EmpleadoEntity empleadoOrigen;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_empleado_destino")
    private EmpleadoEntity empleadoDestino;
}