package com.app.Todoapp.repository;

import com.app.Todoapp.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
//interacts with the database helps reduce boilerplate code
public interface TaskRepository extends JpaRepository<Task, Long> {
}
