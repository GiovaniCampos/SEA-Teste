package com.SEA.Cadastramento.controller;

import com.SEA.Cadastramento.entites.*;
import com.SEA.Cadastramento.repositories.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        return mv;
    }

    @Autowired
    private UserRepository repository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;


    @GetMapping
    public List<User> getAll(){
        List<User> userList = repository.findAll();
        return userList;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    /*@PostMapping
    public User criarUsuario(@RequestBody UserConstructor userConstructor) {
        // Crie um novo usuário e salve-o
        User user = UserConstructor.getUser();
        User savedUser = repository.save(user);

        // Salve os detalhes do usuário
        Cliente cliente = UserConstructor.getCliente();
        Cliente.setUser(savedUser);
        ClienteRepository.save(Cliente);

        // Salve os emails
        List<Email> userEmails = UserConstructor.getEmails();
        userEmails.forEach(email -> email.setUser(savedUser));
        EmailRepository.saveAll(Email);

        // Salve os telefones
        List<Telefone> userPhones = UserConstructor.getTelefones();
        userPhones.forEach(phone -> phone.setUser(savedUser));
        TelefoneRepository.saveAll(Telefone);

        // Salve os endereços
        List<Endereco> userAddresses = UserConstructor.getEnderecos();
        userAddresses.forEach(address -> address.setUser(savedUser));
        EnderecoRepository.saveAll(Endereco);

        return savedUser;
    }*/

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return repository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
