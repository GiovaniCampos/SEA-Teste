package com.SEA.Cadastramento.entites;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Table(name= "users")
@Entity(name="users")
@EqualsAndHashCode(of="id")
@AllArgsConstructor
public class User {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;

}