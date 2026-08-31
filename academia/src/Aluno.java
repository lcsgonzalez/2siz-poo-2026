public class Aluno {
    private String nome;
    private String cpf;
    private int numeroMatricula;

    public Aluno(String nome, String cpf, int numeroMatricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroMatricula = numeroMatricula;
    }

    public Aluno() {
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }
}

