package com.salvus.proyecto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "emergencia")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Emergencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emergencia")
    private Integer idEmergencia;

    @Column(name = "tipo_sangre")
    private String tipoSangre;

    @Column(name = "alergias", nullable = false)
    private String alergias;

    @Column(name = "medicacion_habitual", nullable = false)
    private String medicacionHabitual;

    @Column(name = "tratamiento_emergencia", nullable = false)
    private String tratamientoEmergencia;

    @Column(name = "enfermedades_preexistentes", nullable = false)
    private String enfermedadesPreexistentes;

    @Column(name = "ultima_actualizacion", nullable = false)
    private LocalDateTime ultimaActualizacion;

    @Column(name = "nombre_contacto_emergencia", nullable = false)
    private String nombreContactoEmergencia;

    @Column(name = "telefono_contacto_emergencia", nullable = false)
    private String telefonoContactoEmergencia;

    @Column(name = "parentesco", nullable = false)
    private String parentesco;

    @Column(name = "descripcion_general", nullable = false)
    private String descripcionGeneral;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_idpersona", referencedColumnName = "idpersona")
    private Usuario usuario;

    public enum TipoSangre {
        A_POS, A_NEG, B_POS, B_NEG, AB_POS, AB_NEG, O_POS, O_NEG
    }
}