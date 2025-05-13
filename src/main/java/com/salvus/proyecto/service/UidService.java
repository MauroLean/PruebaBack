package com.salvus.proyecto.service;

import com.salvus.proyecto.entity.Uid;
import com.salvus.proyecto.entity.Usuario;
import com.salvus.proyecto.repository.UidRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UidService {

    @Autowired
    private final UidRepositorio uidRepositorio;

    public UidService(UidRepositorio uidRepositorio) {
        this.uidRepositorio = uidRepositorio;
    }

    // Guardar un UID proporcionado manualmente
    public Uid guardarUid(String uidCodigo, Usuario usuario, Long uidId) {
        if (uidRepositorio.existsByUidCodigo(uidCodigo)) {
            throw new RuntimeException("El UID ya está registrado");
        }

        Uid uid = new Uid();
        uid.setUidId(uidId); // Asignar el UID_id manualmente
        uid.setUidCodigo(uidCodigo);
        uid.setUsuario(usuario);
        return uidRepositorio.save(uid);
    }

    // Buscar un UID por su código
    public Optional<Uid> findByUidCodigo(String uidCodigo) {
        return uidRepositorio.findByUidCodigo(uidCodigo);
    }
}