package com.app.Todoapp.controller;

import org.springframework.ui.Model;     // ✅ CORRECT! This is from Spring
import com.app.Todoapp.entities.Task;
import com.app.Todoapp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/tasks")
public class controller     {
    private final TaskService taskService;

    public controller(TaskService taskService) {
        this.taskService = taskService;
    }
@GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks" , tasks);
        return "tasks";
    }
}