package com.app.Todoapp.repository;

import com.app.Todoapp.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
