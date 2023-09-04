package com.SEA.Cadastramento.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
@Table(name= "cpfs")
@Entity(name="cpfs")
public class CPF {
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private Long id;

    /*public User user;
    public void setId(Long id) {
        this.id = user.getId();
    }*/

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
