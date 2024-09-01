public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Prioridade: " + prioridade);
    }

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Desafios!", "Exercício POO", "99-99-9999", 1);
        tarefa.setTitulo("Atividades Java");
        System.out.println("Novo Título: " + tarefa.getTitulo());
        tarefa.exibirDetalhes();
    }
}
