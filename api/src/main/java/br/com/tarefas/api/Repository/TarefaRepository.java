package br.com.tarefas.api.Repository;

import br.com.tarefas.api.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
