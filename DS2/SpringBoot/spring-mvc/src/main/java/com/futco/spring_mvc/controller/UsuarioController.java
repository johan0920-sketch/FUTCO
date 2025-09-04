package com.futco.spring_mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.futco.spring_mvc.dtos.UsarioResponseNameAndLastname;
import com.futco.spring_mvc.dtos.UsuarioCreateResponse;
import com.futco.spring_mvc.model.Usuario;
import com.futco.spring_mvc.service.IServiceUsuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final IServiceUsuario serviceUsuario;

    public UsuarioController(IServiceUsuario serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }

    @PostMapping
    public UsuarioCreateResponse create(@RequestBody Usuario usuario) {
        return serviceUsuario.crearUsuario(usuario);
    }
    
    @PostMapping("/params")
    public UsarioResponseNameAndLastname getUsuarioNombreApellido(@RequestParam("name") String nombre, @RequestParam("lastname") String apellido) {
        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido);
        return serviceUsuario.obtenerNombreYApellido(nombre, apellido);
    }
    

}
