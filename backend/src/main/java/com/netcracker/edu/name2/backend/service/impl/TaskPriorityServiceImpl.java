package com.netcracker.edu.name2.backend.service.impl;

import com.netcracker.edu.name2.backend.entity.TaskPriority;
import com.netcracker.edu.name2.backend.repository.TaskPriorityRepository;
import com.netcracker.edu.name2.backend.service.TaskPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskPriorityServiceImpl implements TaskPriorityService {

    private TaskPriorityRepository taskPriorityRepository;

    @Autowired
    public TaskPriorityServiceImpl(TaskPriorityRepository taskPriorityRepository) {
        this.taskPriorityRepository = taskPriorityRepository;
    }

    @Override
    public Optional<TaskPriority> findByName(String name) {
        return taskPriorityRepository.findByName(name);
    }
}
