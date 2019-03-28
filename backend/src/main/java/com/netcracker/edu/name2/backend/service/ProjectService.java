package com.netcracker.edu.name2.backend.service;

import com.netcracker.edu.name2.backend.entity.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    Iterable<Project> findAll();

    Optional<Project> findById(Long id);

    Project save(Project project);

    void delete(Long id);
}
