package com.salvus.proyecto.controller;

import com.salvus.proyecto.DTO.EmergenciaRespuestaDTO;
import com.salvus.proyecto.entity.Uid;
import com.salvus.proyecto.entity.Emergencia;
import com.salvus.proyecto.mapper.EmergenciaMapper;
import com.salvus.proyecto.service.EmergenciaService;
import com.salvus.proyecto.service.UidService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/emergencia")
public class EmergenciaController {

    private final UidService uidService;
    private final EmergenciaService emergenciaService;
    private final EmergenciaMapper emergenciaMapper;

    public EmergenciaController(UidService uidService, EmergenciaService emergenciaService, EmergenciaMapper emergenciaMapper) {
        this.uidService = uidService;
        this.emergenciaService = emergenciaService;
        this.emergenciaMapper = emergenciaMapper;
    }

    @GetMapping("/{uid}")
    public ResponseEntity<EmergenciaRespuestaDTO> obtenerEmergenciaPorUid(@PathVariable String uid) {
        Optional<Uid> uidEntity = uidService.findByUidCodigo(uid);
        if (uidEntity.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Uid uidObj = uidEntity.get();
        if (uidObj.getUsuario() == null) {
            return ResponseEntity.notFound().build();
        }

        Integer idpersona = uidObj.getUsuario().getIdpersona();
        Optional<Emergencia> emergencia = emergenciaService.findByUsuarioIdPersona(idpersona);
        if (emergencia.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        EmergenciaRespuestaDTO dto = emergenciaMapper.toEmergenciaRespuestaDTO(emergencia.get());
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}