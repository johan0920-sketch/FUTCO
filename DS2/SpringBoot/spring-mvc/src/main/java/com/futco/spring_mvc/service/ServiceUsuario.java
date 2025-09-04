package com.futco.spring_mvc.service;

import org.springframework.stereotype.Service;

import com.futco.spring_mvc.dtos.UsarioResponseNameAndLastname;
import com.futco.spring_mvc.dtos.UsuarioCreateResponse;
import com.futco.spring_mvc.model.Usuario;

@Service
public class ServiceUsuario implements IServiceUsuario {

    @Override
    public UsuarioCreateResponse crearUsuario(Usuario usuario) {
        UsuarioCreateResponse usuarioCreateResponse = new UsuarioCreateResponse();
        usuarioCreateResponse.setNombre(usuario.getNombre().toUpperCase());
        usuarioCreateResponse.setApellido(usuario.getApellido().toUpperCase());
        return usuarioCreateResponse;
    }

    @Override
    public UsarioResponseNameAndLastname obtenerNombreYApellido(String nombre, String apellido) {
        UsarioResponseNameAndLastname response = new UsarioResponseNameAndLastname();
        response.setNombreCompleto(nombre + " " + apellido);
        return response;
    }

}
