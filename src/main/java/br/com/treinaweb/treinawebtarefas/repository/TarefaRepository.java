package br.com.treinaweb.treinawebtarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.treinaweb.treinawebtarefas.domain.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, String> {
    
}
