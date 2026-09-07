package com.example.todo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService {

    private final Repository repo;

    // With a single constructor, Spring automatically injects the Repository bean
    public AtividadeService(Repository repo) {
        this.repo = repo;
    }

    public List<Atividade> listar() {
        return repo.findAll();
    }
}