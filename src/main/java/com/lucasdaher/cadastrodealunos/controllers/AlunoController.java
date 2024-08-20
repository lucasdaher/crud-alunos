package com.lucasdaher.cadastrodealunos.controllers;

import com.lucasdaher.cadastrodealunos.models.AlunoModel;
import com.lucasdaher.cadastrodealunos.repositories.AlunoRepositories;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@CrossOrigin("*")
@AllArgsConstructor
public class AlunoController {
    private AlunoRepositories alunoRepositories;

    @GetMapping
    public ResponseEntity<List<AlunoModel>> pegarTodosAlunos() {
        return new ResponseEntity<>(alunoRepositories.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AlunoModel> adicionarAluno(@RequestBody AlunoModel aluno) {
        aluno.setId(null);
        return new ResponseEntity<>(alunoRepositories.save(aluno), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<AlunoModel> editarAluno(@RequestBody AlunoModel alunoNovo) {
        return new ResponseEntity<>(alunoRepositories.save(alunoNovo), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> removerAluno(@PathVariable Integer id) {
        alunoRepositories.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
