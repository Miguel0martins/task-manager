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
           opcao = sc.nextInt();

           if (opcao == 1) {
               listaDeTarefas.add();
               System.out.println("adicionando");

           }

           else if (opcao == 2) {
               System.out.println("concluir");
           }

           else if (opcao == 3) {
               System.out.println(listaDeTarefas);
               System.out.println("listando");}

          else if (opcao == 4) {
               System.out.println("saindo");
               break;
           }

           else{System.out.println(" opcao invalida");}

       }


//       listaDeTarefas.forEach(System.out::println);
    }
}

