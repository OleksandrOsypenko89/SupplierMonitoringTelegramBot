package com.osypenko.suppliermonitoringtelegrambot.model;

import com.osypenko.suppliermonitoringtelegrambot.entities.Task;
import com.osypenko.suppliermonitoringtelegrambot.model.repositories.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class TaskService {
    private final TaskRepository taskRepository;

    //Создание списка всех задач
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    //Получение информации о конкретной задаче по ее названию
    public Task getTaskForExtraInfo(String key) {
        Map<String, Task> taskMap = new HashMap<>();
        for (Task task : getAllTasks()) {
            taskMap.put(task.getText(), task);
        }
        return taskMap.get(key);
    }

    //Создание списка с названием задач
    public Set<String> getTaskSetList() {
        Set<String> taskExtraInfo = new HashSet<>();
        for (Task allTask : getAllTasks()) {
            taskExtraInfo.add(allTask.getText());
        }
        return taskExtraInfo;
    }
}
