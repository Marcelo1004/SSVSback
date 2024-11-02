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
public class Asegurados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    private String TipoSangre;

    private LocalDateTime fechaNacimiento;

    /*public Date getFechaNacimiento(){
        return fechaNacimiento;}
    public void  setfechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }*/
}
