import java.math.BigDecimal;
import java.util.ArrayList;

public class Plano {
    private String nome;
    private BigDecimal valorMensal;
    private int duracaoEmMeses;

    public Plano() {
    }

    public Plano(String nome, BigDecimal valorMensal, int duracaoEmMeses) {
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.duracaoEmMeses = duracaoEmMeses;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(BigDecimal valorMensal) {
        this.valorMensal = valorMensal;
    }

    public int getDuracaoEmMeses() {
        return duracaoEmMeses;
    }

    public void setDuracaoEmMeses(int duracaoEmMeses) {
        this.duracaoEmMeses = duracaoEmMeses;
    }

    @Override
    public String toString() {
        return "Plano{" +
                "nome='" + nome + '\'' +
                ", valorMensal=" + valorMensal +
                ", duracaoEmMeses=" + duracaoEmMeses +
                '}';
    }
}
