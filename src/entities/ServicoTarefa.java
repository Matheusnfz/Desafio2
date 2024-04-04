package entities;

import java.util.HashSet;

public class ServicoTarefa {
	private HashSet<Tarefa> tarefas;

    public ServicoTarefa() {
        tarefas = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void visualizarTarefas() {
        System.out.println("Tarefas cadastradas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.getNome());
        }
    }

    public void removerTarefa(Tarefa tarefa) {
        
    	tarefas.remove(tarefa);
    }

    public boolean temTarefa(String nome) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
}