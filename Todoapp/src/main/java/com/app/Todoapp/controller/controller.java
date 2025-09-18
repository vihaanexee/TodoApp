package com.app.Todoapp.controller;

import com.app.Todoapp.services.TaskService;
import org.springframework.stereotype.Controller;


@Controller
public class controller     {
    private final TaskService taskService;

    public controller(TaskService taskService) {
        this.taskService = taskService;
    }
}
