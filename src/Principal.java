import java.util.ArrayList;

public class Principal  {
   public static void main(String[] args) {

       Tarefa t1 = new Tarefa("Alura");
       t1.concluir();

       Tarefa t2 = new Tarefa("faxina");

       Tarefa t3 = new Tarefa("treino");





        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
       listaDeTarefas.add(t1);
       listaDeTarefas.add(t2);
       listaDeTarefas.add(t3);


       for (int i = 0; i < listaDeTarefas.size(); i++) {
           System.out.println(listaDeTarefas.get(i));
       }



    }
}

