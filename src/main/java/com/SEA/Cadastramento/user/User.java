package com.SEA.Cadastramento.user;

import jakarta.persistence.*;

@Table(name= "users")
@Entity(name="users")
public class User {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
