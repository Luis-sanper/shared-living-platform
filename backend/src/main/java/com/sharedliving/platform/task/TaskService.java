package com.sharedliving.platform.task;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<HouseholdTask> tasks = new ArrayList<>();
    private long nextId = 1;

    public HouseholdTask createTask(String title, String description) {
        HouseholdTask task = new HouseholdTask(nextId, title, description, false);
        nextId++;
        tasks.add(task);
        return task;
    }

    public List<HouseholdTask> getAllTasks(){
        return tasks;
    }
}
