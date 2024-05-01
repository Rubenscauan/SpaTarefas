package com.tarefas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarefas.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}