package com.salvus.proyecto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salvus.proyecto.entity.Usuario;
@Repository
public interface  UsuarioRepositorio extends  JpaRepository<Usuario, Long> {
        Optional<Usuario> findByNombre(String nombre);  // método que busque por nombre.
        Optional<Usuario> findByUid_UidCodigo(String uidCodigo);
    
    
}
