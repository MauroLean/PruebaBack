package com.salvus.proyecto.DTO;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class RegistroDTO {
    // Datos de Usuario
    private Long userId;
    private String nombre;
    private String apellido;
    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd") // Esto es para transformar a un String con ese formato de fecha.
    private LocalDate fecha_nacimiento;
    private int dni;
    private String fotoPerfilBase64;
    private String direccion;
    // Datos de Emergencia
    private Long emergenciaId;
    private String emergencia_med_Habitual;
    private String emergencia_trat_Emergencia;
    private String emergencia_enf_Preexistente;
    private String emergencia_nombre_Contacto_Emergencia;
    private String emergencia_telefono_Contacto_Emergencia;
    private String parentesco_Contacto_Emergencia;
    private String descripcion_general;
    // Datos de UID
    private Long uidId;
    private String uidCodigo;



 
}
