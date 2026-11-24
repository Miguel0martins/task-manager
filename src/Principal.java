import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal  {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int opcao = 0;

       String menu = "---task-manager teste---" +
               "\n Digite 1 para adicionar" +
               "\n Digite 2 para concluir" +
               "\n Digite 3 para listar" +
               "\n Digite 4 para sair" +
               "\n Digite abaixo ⬇\uFE0F";

       Tarefa t1 = new Tarefa("Alura");
       t1.concluir();

       Tarefa t2 = new Tarefa("Rezar");
//       t2.concluir();

       Tarefa t3 = new Tarefa("Beber agua");
       t3.concluir();

        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
       listaDeTarefas.add(t1);
       listaDeTarefas.add(t2);
       listaDeTarefas.add(t3);

       Collections.sort(listaDeTarefas);
       for (Tarefa tarefa : listaDeTarefas) {
//           System.out.println(tarefa);
       }

       while (opcao != 4) {
           System.out.println(menu);
           opcao = Integer.parseInt(sc.nextLine());

           if (opcao == 1) {
               System.out.println("Digite o nome da tarefa:");
               listaDeTarefas.add(new Tarefa(sc.nextLine()));
               System.out.println("Tarefa adicionada!");
           } else if (opcao == 2) {
               for (int i = 0; i < listaDeTarefas.size(); i++) {
                   System.out.println((i + 1) + " - " + listaDeTarefas.get(i));
               }
               System.out.println("Qual tarefa deseja concluir?");
               int indice = Integer.parseInt(sc.nextLine()) - 1;
               if (indice >= 0 && indice < listaDeTarefas.size()) {
                   listaDeTarefas.get(indice).concluir();
                   System.out.println("Tarefa concluída!");
               } else {
                   System.out.println("Número inválido");
               }
           } else if (opcao == 3) {
               if (listaDeTarefas.isEmpty()) {
                   System.out.println("Nenhuma tarefa cadastrada.");
               }
               listaDeTarefas.forEach(System.out::println);
           } else if (opcao == 4) {
               System.out.println("Saindo...");
           } else {
               System.out.println("Opção inválida");
           }
       }
       sc.close();

//       listaDeTarefas.forEach(System.out::println);
    }
}

