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

    @GetMapping("/sleep")
    public String pruebaSleep() {
        try {
            System.out.println("Inicio Sleep");
            Thread.sleep(65000);
            System.out.println("Fin Sleep");
        } catch (InterruptedException ie) {
            System.err.println("Error interruptedException");
        }
        return "OK";
    }

    @GetMapping("/sleep2")
    public String pruebaSleep2() {
        try {
            System.out.println("Inicio Sleep");
            Thread.sleep(10000);
            System.out.println("Fin Sleep");
        } catch (InterruptedException ie) {
            System.err.println("Error interruptedException");
        }
        return "OK2";
    }
}
