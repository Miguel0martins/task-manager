public class Tarefa {
    private String descricao;
    private boolean concluida;

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao =  descricao;
    }

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
}