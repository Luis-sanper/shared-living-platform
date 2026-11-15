package com.sharedliving.platform.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<HouseholdTask> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public HouseholdTask createTask(@RequestBody Map<String, String> data) {
        return taskService.createTask(
                data.get("title"),
                data.get("description")
        );
    }
}

