package com.ssvs.historialClinico.service;


import com.ssvs.historialClinico.dto.AseguradosDTO;
import com.ssvs.historialClinico.dto.UsuarioDTO;
import com.ssvs.historialClinico.entity.Asegurados;
import com.ssvs.historialClinico.entity.Usuarios;
import com.ssvs.historialClinico.exception.ResourceNotFound;
import com.ssvs.historialClinico.repository.AseguradosRepository;
import com.ssvs.historialClinico.repository.UsuariosRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class AseguradoService {
    private final AseguradosRepository aseguradosRepository;
    private final ModelMapper mapper;

    public Iterable<Asegurados> findAll(){
        return aseguradosRepository.findAll();
    }
    public Asegurados findById(Integer id){
        return aseguradosRepository.findById(id)
                .orElseThrow(ResourceNotFound::new);
    }
    public Asegurados create(AseguradosDTO aseguradoDTO){
        Asegurados asegurados = mapper.map(aseguradoDTO, Asegurados.class);
        return aseguradosRepository.save(asegurados);
    }
    public Asegurados update(  Integer id,
                               AseguradosDTO aseguradoDTO){
        Asegurados aseguradosFromDb = findById(id);

        mapper.map(aseguradoDTO, aseguradosFromDb);

        return aseguradosRepository.save(aseguradosFromDb);
    }
    public void delete(  Integer id){
        Asegurados aseguradosFromDb = findById(id);
        aseguradosRepository.delete(aseguradosFromDb);
    }
}
