package com.SEA.Cadastramento.entites;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor

@Entity
public class UserConstructor {
    @Id
    private User user;
    private Cliente cliente;
    private Email emails;
    private Telefone telefones;
    private Endereco enderecos;
    /*private List<Email> emails;
    private List<Telefone> telefones;
    private List<Endereco> enderecos;*/
}
