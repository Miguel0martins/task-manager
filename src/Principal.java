import java.util.ArrayList;
import java.util.Collections;

public class Principal  {
   public static void main(String[] args) {

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
           System.out.println(tarefa);
       }
//       listaDeTarefas.forEach(System.out::println);
    }
}

