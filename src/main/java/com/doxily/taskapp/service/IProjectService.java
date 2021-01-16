package com.doxily.taskapp.service;

import com.doxily.taskapp.persistence.models.Project;

import java.util.Optional;

public interface IProjectService {
    Optional<Project> findById(Long id);
    Project save(Project project);
}
