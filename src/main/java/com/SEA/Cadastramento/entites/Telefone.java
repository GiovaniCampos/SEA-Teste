package com.SEA.Cadastramento.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
@Table(name= "telefones")
@Entity(name="telefones")

public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne@JoinColumn(name = "user_id")
    private User user;

    @NotBlank
    private String type;

    @NotBlank
    private String number;

}
