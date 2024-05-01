package com.tarefas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarefas.Model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}