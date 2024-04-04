package aplicattion;

import java.util.Scanner;

import entities.ServicoTarefa;
import entities.Tarefa;

public class GerenciadorTarefas {

	public static void main(String[] args) {
		Scanner sc 
		= new Scanner(System.in);
        ServicoTarefa servicoTarefa = new ServicoTarefa();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Visualizar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - Sair");

            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o nome da tarefa:");
                sc.nextLine();
                String nome = sc.nextLine();

                if (!servicoTarefa.temTarefa(nome)) {
                    Tarefa tarefa = new Tarefa(nome);
                    servicoTarefa.adicionarTarefa(tarefa);
                } else {
                    System.out.println("Tarefa já existente.");
                }

            } else if (escolha == 2) {
                servicoTarefa.visualizarTarefas();

            } else if (escolha == 3) {
                System.out.println("Digite o nome da tarefa:");
                sc.nextLine();
                String nome = sc.nextLine();

                if (servicoTarefa.temTarefa(nome)) {
                    Tarefa tarefa = new Tarefa(nome);
                    servicoTarefa.removerTarefa(tarefa);
                } else {
                    System.out.println("Tarefa não existente.");
                }

            } else if (escolha == 4) {
                break;

            } else {
                System.out.println("Valor inválido, por favor digite uma opção válida.");
            }
        }

        sc.close();
    }
}