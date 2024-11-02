package com.ssvs.historialClinico.controller;


import com.ssvs.historialClinico.dto.AseguradosDTO;
import com.ssvs.historialClinico.dto.UsuarioDTO;
import com.ssvs.historialClinico.entity.Asegurados;
import com.ssvs.historialClinico.entity.Usuarios;
import com.ssvs.historialClinico.service.AseguradoService;
import com.ssvs.historialClinico.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RequestMapping("/api/asegurados")
@RestController
public class AseguradosController {

    private final AseguradoService aseguradoService;

    @GetMapping
    Iterable<Asegurados> list(){
        return aseguradoService.findAll();
    }

    @GetMapping("{id}")
    public Asegurados get( @PathVariable Integer id){
        return aseguradoService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Asegurados create( @Validated @RequestBody AseguradosDTO aseguradosDTO){
        return aseguradoService.create(aseguradosDTO);
    }
    @PutMapping("{id}")
    public Asegurados update( @PathVariable Integer id,
                            @Validated @RequestBody AseguradosDTO aseguradosDTO){
        return aseguradoService.update(id,aseguradosDTO);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete( @PathVariable Integer id){
        aseguradoService.delete(id);
    }
}
