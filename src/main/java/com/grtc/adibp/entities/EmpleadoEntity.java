package com.grtc.adibp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class EmpleadoEntity extends BaseEntity{
    @Column(name = "lastname", columnDefinition = "varchar(50)",nullable = false)
    private String lastName;
}
