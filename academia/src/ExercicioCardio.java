import java.time.LocalTime;

public class ExercicioCardio extends Exercicio{
    private double velocidade;
    private LocalTime tempo;
    private String observacoes;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public ExercicioCardio(String nome, double velocidade, LocalTime tempo, String observacoes) {
        super(nome);
        this.velocidade = velocidade;
        this.tempo = tempo;
        this.observacoes = observacoes;
    }

    @Override
    public void executar() {
        System.out.println(
                getNome() + " - velocidade: " +
                         getVelocidade() + " por " +
                        getTempo() + " hora/minutos. " +
                        "Obs: " + getObservacoes()
        );
    }
}
