package com.salvus.proyecto.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salvus.proyecto.entity.Usuario;
import com.salvus.proyecto.repository.UsuarioRepositorio;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    //Guardar o actualizar un usuario
    public void saveOrUpdate (Usuario usuario)
    {
        usuarioRepositorio.save(usuario); // el metodo save sirve tanto para crear un usuario como  para guardar
    }
    // Buscar un usuario por su nombre
    public Optional<Usuario> getUserByNombre(String nombre) {
        return usuarioRepositorio.findByNombre(nombre);
    }


    // Eliminar un usuario por su ID
    public void delete(Long id) {
        usuarioRepositorio.deleteById(id);
    }
}
