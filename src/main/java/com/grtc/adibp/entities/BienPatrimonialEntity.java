package com.grtc.adibp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bienes_patrimoniales")
public class BienPatrimonialEntity extends BaseEntity{
    @Column(name = "codigopatrimonial", columnDefinition="CHAR(12)", unique = true)
    private String codigoPatrimonial;
    @Column(name = "marca", length = 50)
    private String marca;
    @Column(name = "modelo", length = 50)
    private String modelo;
    @Column(name = "serie", length = 50)
    private String serie;
    @Column(name = "estado")
    private BPEstado estado;
    @Column(name = "color", length = 50)
    private String color;
}
