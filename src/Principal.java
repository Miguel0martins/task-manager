import java.util.ArrayList;

public class Principal  {
   public static void main(String[] args) {

       Tarefa t1 = new Tarefa();
       t1.setDescricao("alura");
       t1.concluir();

       Tarefa t2 = new Tarefa();
       t2.setDescricao("faxina");

       Tarefa t3 = new Tarefa();
       t3.setDescricao("treino");




        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
       listaDeTarefas.add(t1);
       listaDeTarefas.add(t2);
       listaDeTarefas.add(t3);


       for (int i = 0; i < listaDeTarefas.size(); i++) {
           System.out.println(listaDeTarefas.get(i));
       }



    }
}

