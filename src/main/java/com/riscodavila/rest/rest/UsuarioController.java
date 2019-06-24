package com.riscodavila.rest.rest;

import com.riscodavila.rest.dao.UsuarioDAO;
import com.riscodavila.rest.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @GetMapping("/usuario")
    public List<Usuario> obtenerUsuarios() {
        return usuarioDAO.findAll();
    }
}
