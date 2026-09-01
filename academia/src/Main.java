import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas","1234578901",1234);
//        aluno.setNome("Lucas");
//        aluno.setCpf("12345678901");
//        aluno.setNumeroMatricula(1234);

        Plano plano = new Plano("Gold", BigDecimal.valueOf(69.90),12);
        aluno.setPlano(plano);

        System.out.println(aluno.getPlano());

        Aluno aluno2 = new Aluno();
        System.out.println(aluno2);
    }
}
