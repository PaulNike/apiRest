package com.codigo.apirest.dao;

import com.codigo.apirest.entity.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovilDAO extends JpaRepository<Automovil,Long> {
}
