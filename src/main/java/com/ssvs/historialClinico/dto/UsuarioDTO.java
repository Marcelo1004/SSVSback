package com.ssvs.historialClinico.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UsuarioDTO {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Email(message = "El correo es invalido")
    @NotBlank(message = "El correo es obligatorio")
    private String correo;
    @NotBlank(message = "La contraseña es obligatoria")
    private String password;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;
    @NotBlank(message = "El sexo es obligatorio")
    private char sexo;
    @NotBlank(message = "El estado es obligatorio")
    private char estado;
}
