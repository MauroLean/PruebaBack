package com.salvus.proyecto.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EmergenciaRespuestaDTO {
    // Este DTO es para mostrar los datos personales de emergencia de cada usuario
    // Datos personales del usuario
    private String nombre;
    private String apellido;
    private String fotoPerfilBase64;
    private LocalDateTime fechaNacimiento; // Acá agregue la fecha de nacimiento (*-*)
    private String direccion;
    // Datos de emergencia
    private Integer idEmergencia;
    private String tipoSangre;
    private String alergias;
    private String medicacionHabitual;
    private String tratamientoEmergencia;
    private String enfermedadesPreexistentes;
    private LocalDateTime ultimaActualizacion;
    private String nombreContactoEmergencia;
    private String telefonoContactoEmergencia;
    private String parentesco;
    private String descripcionGeneral;
}