package com.SEA.Cadastramento.entites;

import lombok.Data;

import java.util.List;

@Data
public class UserConstructor {
    private User user;
    private Cliente cliente;
    private List<Email> emails;
    private List<Telefone> telefones;
    private List<Endereco> enderecos;
}
