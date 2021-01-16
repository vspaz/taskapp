package com.doxily.taskapp.service;

import com.doxily.taskapp.persistence.models.Project;
import com.doxily.taskapp.persistence.repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProjectServiceImpl implements IProjectService {
    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Autowired
    private IProjectRepository projectRepository;

}
