package com.SEA.Cadastramento.repositories;

import com.SEA.Cadastramento.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
