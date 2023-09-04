package com.SEA.Cadastramento.config;

import com.SEA.Cadastramento.entites.Email;
import com.SEA.Cadastramento.entites.User;
import com.SEA.Cadastramento.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("dev")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("giovanimigon@gmail.com"));
        emails.add(new Email("vitorpatrickalves@gmail.com"));
        User u1 = new User(null, "Giovani", "gigio31722", "admin", emails);
        User u2 = new User(null, "PTK", "vitorpatrickalves", "user", emails);

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
