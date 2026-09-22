import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Exercicio> listaExercicios = new ArrayList<>();

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
                case "43" -> visualizarExercicio();
                case "44" -> excluirExercicio();
                default -> System.out.println("Opção inválida");
            }
        }
    }

    public static String lerValidarEntradas(String prompt, String regex, String mensagemErro) {
        while (true) {
            System.out.println(prompt);
            String valor = scanner.nextLine();
            if (valor.matches(regex)) return valor;
            System.out.println(mensagemErro);
        }
    }

    public static void cadastrarExercicio() {
        String nome = lerValidarEntradas(
                "Digite o nome do exercício: ",
                "[\\p{L}\\p{N}]+",
                "O nome do exercício só pode conter letras e números");
        int quantidadeSeries = Integer.parseInt(lerValidarEntradas(
                "Digite a quantidade de séries: ",
                "\\d+",
                "Você deve informar um número inteiro"));
        int numeroRepeticoes = Integer.parseInt(lerValidarEntradas(
                "Digite a quantidade de repetições: ",
                "\\d+",
                "Você deve informar um número inteiro"));
        String carga = lerValidarEntradas(
                "Digite a carga: ",
                ".*\\d.*",
                "A carga deve conter um número");

        Exercicio exercicio = new Exercicio(nome, quantidadeSeries, numeroRepeticoes, carga);
        listaExercicios.add(exercicio);
        System.out.println("Exercício cadastrado com sucesso!");
    }

    public static void visualizarExercicio() {
        if (listaExercicios.isEmpty()) {
            System.out.println("Não há exercícios cadastrados!");
            return;
        }
        for (Exercicio exercicio : listaExercicios) {
            System.out.println(exercicio);
        }
    }

    public static void indexarExercicio() {
        if (listaExercicios.isEmpty()) {
            System.out.println("Não há exercícios cadastrados!");
            return;
        }
        for (int i=0;i<listaExercicios.size();i++) {
            System.out.println(i+1 + ". " + listaExercicios.get(i));
        }
    }

    public static void excluirExercicio(){
        indexarExercicio();
        int indiceExcluir = Integer.parseInt(lerValidarEntradas(
                "Digite o número do exercício que deseja excluir: ",
                "[1,"+String.valueOf(listaExercicios.size())+"]",
                "Número inválido!"
        ));
        indiceExcluir--;

        String confirma = lerValidarEntradas(
                "Deseja realmente excluir "+listaExercicios.get(indiceExcluir)+"? (S/N)",
                "[SNsn]",
                "Por favor digite somente S para sim ou N para não"
        );

        if(confirma.toLowerCase().equals("s")) {
            listaExercicios.remove(indiceExcluir);
            System.out.println("Exercício removido com sucesso!");
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
