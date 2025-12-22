package com.todopro.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todopro.backend.models.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

    
}