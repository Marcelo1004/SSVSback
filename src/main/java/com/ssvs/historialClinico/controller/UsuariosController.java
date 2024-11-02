package com.ssvs.historialClinico.controller;

import com.ssvs.historialClinico.dto.UsuarioDTO;
import com.ssvs.historialClinico.entity.Usuarios;
import com.ssvs.historialClinico.repository.UsuariosRepository;
import com.ssvs.historialClinico.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/api/usuarios")
@RestController
public class UsuariosController {


    private final UsuarioService usuarioService;



    @GetMapping
    Iterable<Usuarios> list(){
        return usuarioService.findAll();
    }

    @GetMapping("{id}")
    public Usuarios get( @PathVariable Integer id){
        return usuarioService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Usuarios create( @Validated @RequestBody UsuarioDTO usuariosDTO){
        return usuarioService.create(usuariosDTO);
    }
    @PutMapping("{id}")
    public Usuarios update( @PathVariable Integer id,
                            @Validated @RequestBody UsuarioDTO usuariosDTO){
        return usuarioService.update(id,usuariosDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete( @PathVariable Integer id){
        usuarioService.delete(id);
    }
}
