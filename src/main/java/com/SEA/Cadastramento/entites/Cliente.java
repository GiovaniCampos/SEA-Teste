package com.SEA.Cadastramento.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name= "clientes")
@Entity(name="clientes")
public class Cliente {
    @Id
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

}
