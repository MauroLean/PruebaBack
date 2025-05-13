package com.salvus.proyecto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "persona")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Integer idpersona;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDateTime fechaNacimiento;

    @Column(name = "Dni", unique = true, nullable = false)
    private Integer dni;

    @Lob
    @Column(name = "foto_perfil")
    private byte[] fotoPerfil;

    @Column(name = "direccion")
    private String direccion;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Uid uid;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Emergencia emergencia;
}