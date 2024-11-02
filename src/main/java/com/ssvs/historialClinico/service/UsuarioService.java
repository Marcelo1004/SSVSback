package com.ssvs.historialClinico.service;


import com.ssvs.historialClinico.dto.UsuarioDTO;
import com.ssvs.historialClinico.entity.Usuarios;
import com.ssvs.historialClinico.exception.ResourceNotFound;
import com.ssvs.historialClinico.repository.UsuariosRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.time.LocalDateTime;


@AllArgsConstructor
@Service
public class UsuarioService {

    private final UsuariosRepository usuariosRepository;
    private final ModelMapper mapper;

    public Iterable<Usuarios> findAll(){
        return usuariosRepository.findAll();
    }
    public Usuarios findById(Integer id){
        return usuariosRepository.findById(id)
                .orElseThrow(ResourceNotFound::new);
    }
    public Usuarios create(UsuarioDTO usuarioDTO){
        Usuarios usuarios = mapper.map(usuarioDTO, Usuarios.class);
        usuarios.setCreatedAt(LocalDateTime.now());
        return usuariosRepository.save(usuarios);
    }
    public Usuarios update(  Integer id,
                             UsuarioDTO usuarioDTO){
        Usuarios usuariosFromDb = findById(id);

        mapper.map(usuarioDTO, usuariosFromDb);

        return usuariosRepository.save(usuariosFromDb);
    }
    public void delete(  Integer id){
        Usuarios usuariosFromDb = findById(id);
        usuariosRepository.delete(usuariosFromDb);
    }


}
