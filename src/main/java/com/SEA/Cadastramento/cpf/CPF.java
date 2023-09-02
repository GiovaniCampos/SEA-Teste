package com.SEA.Cadastramento.cpf;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
@Table(name= "cpfs")
@Entity(name="cpfs")
public class CPF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Pattern(regexp = "\\d{11}")
    private String value;

    public void setId(Long id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value.replaceAll("[^0-9]", "");
    }
}
