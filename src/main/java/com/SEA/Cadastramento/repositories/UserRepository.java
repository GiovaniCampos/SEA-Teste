package com.SEA.Cadastramento.repositories;

import com.SEA.Cadastramento.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
}
