package com.example.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Atividade, Long> {
}
