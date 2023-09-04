package com.SEA.Cadastramento.entites;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Role {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
}
