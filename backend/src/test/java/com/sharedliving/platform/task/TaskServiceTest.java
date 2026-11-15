package com.sharedliving.platform.task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    void createdTaskShouldHaveIdAndStartIncomplete() {
        TaskService taskService = new TaskService();

        HouseholdTask task = taskService.createTask(
                "Clean kitchen",
                "Before dinner"
        );

        assertEquals(1L, task.getId());
        assertFalse(task.isCompleted());
        assertEquals("Clean kitchen", task.getTitle());
        assertEquals("Before dinner", task.getDescription());
    }

    @Test
    void createdTasksShouldBeStoredAndUseDifferentIds() {
        TaskService taskService = new TaskService();

        taskService.createTask("Clean kitchen", "Before dinner");
        taskService.createTask("Take out trash", "Before 8 PM");

        // Check that both tasks are stored
        assertEquals(2, taskService.getAllTasks().size());
        assertEquals(1L, taskService.getAllTasks().get(0).getId());
       // Check that each task has a different sequential ID
        assertEquals(2L, taskService.getAllTasks().get(1).getId());
    }

}
