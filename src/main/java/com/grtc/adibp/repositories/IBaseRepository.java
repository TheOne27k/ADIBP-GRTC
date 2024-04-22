package com.grtc.adibp.repositories;

import com.grtc.adibp.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface IBaseRepository<E extends BaseEntity, ID extends Serializable> extends JpaRepository<E, ID> {
}
