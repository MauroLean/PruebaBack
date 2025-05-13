package com.salvus.proyecto.mapper;

import com.salvus.proyecto.DTO.EmergenciaRespuestaDTO;
import com.salvus.proyecto.entity.Emergencia;
import org.springframework.stereotype.Component;
import java.util.Base64;

@Component
public class EmergenciaMapper {

    public EmergenciaRespuestaDTO toEmergenciaRespuestaDTO(Emergencia emergencia) {
        EmergenciaRespuestaDTO dto = new EmergenciaRespuestaDTO();
        if (emergencia == null) {
            return dto;
        }

        dto.setIdEmergencia(emergencia.getIdEmergencia() != null ? emergencia.getIdEmergencia() : null);
        dto.setTipoSangre(emergencia.getTipoSangre() != null ? emergencia.getTipoSangre() : null);
        dto.setAlergias(emergencia.getAlergias() != null ? emergencia.getAlergias() : null);
        dto.setMedicacionHabitual(emergencia.getMedicacionHabitual() != null ? emergencia.getMedicacionHabitual() : null);
        dto.setTratamientoEmergencia(emergencia.getTratamientoEmergencia() != null ? emergencia.getTratamientoEmergencia() : null);
        dto.setEnfermedadesPreexistentes(emergencia.getEnfermedadesPreexistentes() != null ? emergencia.getEnfermedadesPreexistentes() : null);
        dto.setNombreContactoEmergencia(emergencia.getNombreContactoEmergencia() != null ? emergencia.getNombreContactoEmergencia() : null);
        dto.setTelefonoContactoEmergencia(emergencia.getTelefonoContactoEmergencia() != null ? emergencia.getTelefonoContactoEmergencia() : null);
        dto.setParentesco(emergencia.getParentesco() != null ? emergencia.getParentesco() : null);
        dto.setDescripcionGeneral(emergencia.getDescripcionGeneral() != null ? emergencia.getDescripcionGeneral() : null);

        if (emergencia.getUsuario() != null) {
            dto.setNombre(emergencia.getUsuario().getNombre() != null ? emergencia.getUsuario().getNombre() : null);
            dto.setApellido(emergencia.getUsuario().getApellido() != null ? emergencia.getUsuario().getApellido() : null);
            dto.setDireccion(emergencia.getUsuario().getDireccion() != null ? emergencia.getUsuario().getDireccion() : null);
            dto.setFotoPerfilBase64(emergencia.getUsuario().getFotoPerfil() != null ? 
                Base64.getEncoder().encodeToString(emergencia.getUsuario().getFotoPerfil()) : null);
            dto.setFechaNacimiento(emergencia.getUsuario().getFechaNacimiento() != null ? emergencia.getUsuario().getFechaNacimiento() : null);
        }

        return dto;
    }
}