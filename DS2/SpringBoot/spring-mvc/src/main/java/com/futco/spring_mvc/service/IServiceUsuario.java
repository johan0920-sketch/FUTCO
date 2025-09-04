package com.futco.spring_mvc.service;

import com.futco.spring_mvc.dtos.UsarioResponseNameAndLastname;
import com.futco.spring_mvc.dtos.UsuarioCreateResponse;
import com.futco.spring_mvc.model.Usuario;

public interface IServiceUsuario {
    UsuarioCreateResponse crearUsuario(Usuario usuario);
    UsarioResponseNameAndLastname obtenerNombreYApellido(String nombre, String apellido);
}
