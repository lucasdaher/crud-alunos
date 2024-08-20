package com.lucasdaher.cadastrodealunos.repositories;

import com.lucasdaher.cadastrodealunos.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositories extends JpaRepository<AlunoModel, Integer> {
}
