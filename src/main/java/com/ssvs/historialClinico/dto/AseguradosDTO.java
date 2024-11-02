package com.ssvs.historialClinico.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class AseguradosDTO {

    @NotBlank(message = "El tipo de sangre es obligatorio")
    private String TipoSangre;

    @NotBlank(message = "La fecha es obligatorio")
    private LocalDateTime fechaNacimiento;
}
