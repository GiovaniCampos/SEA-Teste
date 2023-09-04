package com.SEA.Cadastramento.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name= "telefones")
@Entity(name="telefones")

public class Telefone {
    //public User user;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*public void setId(Long id) {
        this.id = user.getId();
    }*/

    @NotBlank
    private String type;

    @NotBlank
    private String number;

}
