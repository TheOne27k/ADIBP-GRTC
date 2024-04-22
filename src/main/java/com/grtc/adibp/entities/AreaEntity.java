package com.grtc.adibp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "areas")
public class AreaEntity extends BaseEntity {
}
