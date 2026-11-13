public class Tarefa implements Comparable<Tarefa> {
    private String descricao;
    private boolean concluida;


    public boolean isConcluida() {
        return concluida;
    }

    public Tarefa(String descricao) {this.descricao = descricao;}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {this.descricao =  descricao;}

    public void concluir() {
        concluida = true;
    }


    @Override
    public String toString() {
        if (concluida) {
            return descricao + " [ok] ";

        } else {
            return descricao + " [ ] ";
        }
    }

//    @Override
//    public int compareTo(Tarefa outra ) {
//        return descricao.compareTo(outra.getDescricao());
//    }

    @Override
    public int compareTo (Tarefa outra){
        if (this.isConcluida() && ! outra.isConcluida()){
            return -1;
        } else if (outra.isConcluida() && ! this.isConcluida()) {
            return 1;
        } else{
            return 0;
        }
    }
}