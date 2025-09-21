package com.app.Todoapp.services;

import com.app.Todoapp.entities.Task;
import com.app.Todoapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {   //constructor of task repository to interact with the database
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();  // checks the database and finds all the tasks and displays it
    }

    public Task createTask(String title) {
        Task task = new Task();   // creates a task asks for a title by default sets the toggle to uncomplete and saves it to the database
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
        return task;
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id); //takes the id as input and deletes it from the database using the repository
    }

    public Task toggleTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task id"));
        task.setCompleted(!task.isCompleted()); //it will change whatever the value of the boolean if task is completed or not
        taskRepository.save(task);
        return task;
    }
}
