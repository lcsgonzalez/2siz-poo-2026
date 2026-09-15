import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void menuCrud(String entidade) {
        while (true) {
            System.out.println("""
                    1. Cadastrar
                    2. Alterar
                    3. Visualizar
                    4. Excluir
                    """);
            String operacao = scanner.nextLine();

            switch (entidade + operacao) {
//               case "11" -> cadastrarAluno();
//               case "12" -> atualizarExercicio();
//               case "13" -> visualizarAluno();
//               case "14" -> excluirAluno();
//               case "21" -> cadastrarPlano();
//               case "22" -> atualizarPlano();
//               case "23" -> visualizarPlano();
//               case "24" -> excluirPlano();
//               case "31" -> cadastrarTreino();
//               case "32" -> atualizarTreino();
//               case "33" -> visualizarTreino();
//               case "34" -> excluirTreino();
                case "41" -> cadastrarExercicio();
//               case "42" -> atualizarExercicio();
//               case "43" -> visualizarExercicio();
//               case "44" -> excluirExercicio();
                default -> System.out.println("Opção inválida");
            }
        }
    }

    public static void cadastrarExercicio() {
        String nome;
        int quantidadeSeries;
        int numeroRepeticoes;
        String carga;

        while (true) {
            System.out.println("Digite o nome do exercício: ");
            nome = scanner.nextLine();
            if (nome.isBlank() || nome.isEmpty()) {
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Digite a quantidade de séries");
            String series = scanner.nextLine();
            if (series.matches("[0-9]+")) {
                quantidadeSeries = Integer.parseInt(series);
                break;
            } else {
                System.out.println("A quantidade de séries deve ser um número!");
            }
        }
        while (true) {
            System.out.println("Digite o número de repetições");
            String repeticoes = scanner.nextLine();
            if (repeticoes.matches("[0-9]+")) {
                numeroRepeticoes = Integer.parseInt(repeticoes);
                break;
            } else {
                System.out.println("O número de repetições deve ser um número!");
            }
        }
        while (true) {
            System.out.println("Digite a carga");
            carga = scanner.nextLine();
            if (carga.matches(".*\\d.*")) {
                break;
            } else {
                System.out.println("A carga deve conter um número!");
            }

            System.out.println("Exercício cadastrado com sucesso!");
        }
    }

    public static void main(String[] args) {
//        Aluno aluno = new Aluno("Lucas","1234578901",1234);
////        aluno.setNome("Lucas");
////        aluno.setCpf("12345678901");
////        aluno.setNumeroMatricula(1234);
//
//        Plano plano = new Plano("Gold", BigDecimal.valueOf(69.90),12);
//        aluno.setPlano(plano);
//
//        System.out.println(aluno.getPlano());
//
//        Aluno aluno2 = new Aluno();
//        System.out.println(aluno2);
        String opcao = "";

        while (!opcao.matches("[1-4]")) {
            System.out.println("""
                    ==== Bem vindo ao FiapFit ====
                    
                    1. Aluno
                    2. Plano
                    3. Treino
                    4. Exercícios              
                    
                    Digite o número da opção desejada:""");

            opcao = scanner.nextLine();

            if (opcao.matches("[1-4]")) {
                menuCrud(opcao);
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
