package br.com.treinaweb.treinawebtarefas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treinaweb.treinawebtarefas.domain.Tarefa;
import br.com.treinaweb.treinawebtarefas.repository.TarefaRepository;

@Service
public class TarefaService {
    
    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> listarTarefas() {
        return repository.findAll();
    }

    public Tarefa listarTarefaPorId(String id) {
        return repository.getOne(id);
    }

    public void removerTarefaPorId(String id) {
        repository.deleteById(id);
    }

    public void cadastrarTarefa(Tarefa tarefa) {
        repository.save(tarefa);
    }

    public void editarTarefa(Tarefa tarefa) {
        repository.save(tarefa);
    }
}
