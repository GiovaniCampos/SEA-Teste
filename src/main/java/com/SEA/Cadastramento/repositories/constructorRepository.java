package com.SEA.Cadastramento.repositories;

import com.SEA.Cadastramento.entites.UserConstructor;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface constructorRepository extends JpaRepository<UserConstructor, Class> {
}
