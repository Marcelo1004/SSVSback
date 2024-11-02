package com.ssvs.historialClinico.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;


@Setter
@Getter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NonNull
    private String correo;

    @NonNull
    private String password;
    @NonNull
    private String nombre;
    @NonNull
    private String apellido;
    @NonNull
    private char sexo;

    @NonNull
    private LocalDateTime createdAt;
    @NonNull
    private char estado;



}
