package com.SEA.Cadastramento.config;

import com.SEA.Cadastramento.entites.*;
import com.SEA.Cadastramento.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@Configuration
@Profile("dev")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private constructorRepository constructorRepository;


    @Override
    public void run(String... args) throws Exception {
        /*User a1 = new User(null, "Giovani", "gigio31722");
        Cliente b1 = new Cliente(null, "GIGI", a1);*/
        User a2 = new User(null, "ericsan", "sandubas");
        Cliente b2 = new Cliente(null, "sanduiche", a2);
        Email c2 = new Email(null, a2, "ericsanduiches@gmail.com");
        Telefone d2 = new Telefone(null, a2, "celular", 12345678);
        Endereco e2 = new Endereco(null, a2, 70293080, "logradouroSAN", "bairroSAN", "SANpauLO", "SAN", null);
        UserConstructor f2 = new UserConstructor(a2, b2, c2, d2, e2);
        constructorRepository.save(f2);
    }
}
