package com.doxily.taskapp.persistence.repository;

import com.doxily.taskapp.persistence.models.Project;

import java.util.Optional;

public interface IProjectRepository {
    Optional<Project> findById(Long id);
    Project save (Project project);
}
