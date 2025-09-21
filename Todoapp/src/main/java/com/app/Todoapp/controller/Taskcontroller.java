package com.app.Todoapp.controller;

import org.springframework.ui.Model;
import com.app.Todoapp.entities.Task;
import com.app.Todoapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/tasks")
public class Taskcontroller     {
    private final TaskService taskService;

    public Taskcontroller(TaskService taskService) {
        this.taskService = taskService;
    }
@GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks" , tasks);
        return "tasks";
    }
    @PostMapping
    public String createTask(@RequestParam String title){
        taskService.createTask(title);
        return "redirect:/tasks";
    }
}