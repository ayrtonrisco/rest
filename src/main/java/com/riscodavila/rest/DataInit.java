package com.riscodavila.rest;

import com.github.javafaker.Faker;
import com.riscodavila.rest.dao.UsuarioDAO;
import com.riscodavila.rest.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class DataInit implements ApplicationRunner {

    @Autowired
    private UsuarioDAO usuarioDAO;

    private static final Faker faker = new Faker(new Locale("es"));

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 0; i < 10; i++) {
            Usuario user = new Usuario();
            user.setNombre(faker.leagueOfLegends().champion());
            user.setBirthday(faker.date().birthday());
            user.setPassword(faker.phoneNumber().phoneNumber());
            user.setUsername(faker.pokemon().name());

            usuarioDAO.save(user);
        }
    }
}
