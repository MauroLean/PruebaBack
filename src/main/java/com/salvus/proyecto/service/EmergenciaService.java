package com.salvus.proyecto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salvus.proyecto.entity.Emergencia;
import com.salvus.proyecto.repository.EmergenciaRepositorio;

@Service
public class EmergenciaService {

    @Autowired
    private final EmergenciaRepositorio emergenciaRepositorio;

    public EmergenciaService (EmergenciaRepositorio emergenciaRepositorio){
        this.emergenciaRepositorio = emergenciaRepositorio;
    }

    public Emergencia save(Emergencia emergencia){
        return emergenciaRepositorio.save(emergencia);
    }

    public Optional<Emergencia> findByUsuarioIdPersona(Integer idpersona){
        return emergenciaRepositorio.findByUsuarioIdpersona(idpersona);
    }
    
}
