import java.util.ArrayList;

public class Treino {
    private int codigoIdentificacao;
    private String nomeTreino;
    private Objetivo objetivo;
    private ArrayList<Exercicio> exercicios;

    public Treino() {
    }

    public Treino(int codigoIdentificacao, String nomeTreino, Objetivo objetivo, ArrayList<Exercicio> exercicios) {
        this.codigoIdentificacao = codigoIdentificacao;
        this.nomeTreino = nomeTreino;
        this.objetivo = objetivo;
        this.exercicios = exercicios;
    }

    public Treino(int codigoIdentificacao, String nomeTreino, Objetivo objetivo) {
        this.codigoIdentificacao = codigoIdentificacao;
        this.nomeTreino = nomeTreino;
        this.objetivo = objetivo;
    }

    public int getCodigoIdentificacao() {
        return codigoIdentificacao;
    }

    public void setCodigoIdentificacao(int codigoIdentificacao) {
        this.codigoIdentificacao = codigoIdentificacao;
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    @Override
    public String toString() {
        return "Treino{" +
                "codigoIdentificacao=" + codigoIdentificacao +
                ", nomeTreino='" + nomeTreino + '\'' +
                ", objetivo=" + objetivo +
                ", exercicios=" + exercicios +
                '}';
    }
}
