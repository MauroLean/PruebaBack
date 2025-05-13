package com.salvus.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salvus.proyecto.entity.Uid;

import java.util.Optional;

public interface UidRepositorio extends JpaRepository<Uid, Long> {
    Optional<Uid> findByUidCodigo(String uidCodigo);
    boolean existsByUidCodigo(String uidCodigo);
}