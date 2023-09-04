package com.SEA.Cadastramento.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name= "enderecos")
@Entity(name="enderecos")
public class Endereco {
    //public User user;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*public void setId(Long id) {
        this.id = user.getId();
    }*/

    @NotBlank
    private String cep;

}
