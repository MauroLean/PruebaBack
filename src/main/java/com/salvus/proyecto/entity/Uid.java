package com.salvus.proyecto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "UID")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Uid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid_id")
    private Long uidId;

    @Column(name = "uid", nullable = false)
    private String uidCodigo;

    @OneToOne
    @JoinColumn(name = "persona_idpersona", referencedColumnName = "idpersona")
    private Usuario usuario;
}
