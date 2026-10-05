public class ExercicioMusculacao extends Exercicio{
    private int quantidadeSeries;
    private int numeroRepeticoes;
    private double carga;

    public int getQuantidadeSeries() {
        return quantidadeSeries;
    }

    public void setQuantidadeSeries(int quantidadeSeries) {
        this.quantidadeSeries = quantidadeSeries;
    }

    public int getNumeroRepeticoes() {
        return numeroRepeticoes;
    }

    public void setNumeroRepeticoes(int numeroRepeticoes) {
        this.numeroRepeticoes = numeroRepeticoes;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public ExercicioMusculacao(String nome, int quantidadeSeries, int numeroRepeticoes, double carga) {
        super(nome);
        this.quantidadeSeries = quantidadeSeries;
        this.numeroRepeticoes = numeroRepeticoes;
        this.carga = carga;
    }

    @Override
    public void executar() {
        System.out.println(
                getNome() + ": " +
                    getQuantidadeSeries() + " X " +
                    getNumeroRepeticoes() + " repetições com " +
                    getCarga() + " kg"
        );
    }
}
