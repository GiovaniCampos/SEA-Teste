package com.SEA.Cadastramento.config;

import com.SEA.Cadastramento.user.User;
import com.SEA.Cadastramento.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("dev")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Giovani", "gigio31722", "admin");
        User u2 = new User(null, "PTK", "vitorpatrickalves", "user");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
