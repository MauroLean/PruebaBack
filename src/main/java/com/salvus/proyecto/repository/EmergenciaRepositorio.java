package com.salvus.proyecto.repository;

import com.salvus.proyecto.entity.Emergencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmergenciaRepositorio extends JpaRepository<Emergencia, Integer> {
    Optional<Emergencia> findByUsuarioIdpersona(Integer idpersona);
}