package com.SEA.Cadastramento.repositories;

import com.SEA.Cadastramento.entites.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
