package com.SEA.Cadastramento.repositories;

import com.SEA.Cadastramento.entites.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
