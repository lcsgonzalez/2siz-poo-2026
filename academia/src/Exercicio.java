public class Exercicio {
    private String nome;
    private int quantidadeSeries;
    private int numeroRepeticoes;
    private String carga;

    public Exercicio() {
    }

    public Exercicio(String nome, int quantidadeSeries, int numeroRepeticoes, String carga) {
        this.nome = nome;
        this.quantidadeSeries = quantidadeSeries;
        this.numeroRepeticoes = numeroRepeticoes;
        this.carga = carga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return nome + " " +
                 + quantidadeSeries +
                " x " + numeroRepeticoes +
                " com " + carga + "kg";
    }
}
