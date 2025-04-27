import java.util.Scanner;
import java.util.ArrayList;

class Pessoa {
    protected String nome;
    protected String matricula;
    protected String cpf;
    protected String rg;
    protected String endereco;

    public Pessoa(String nome, String matricula, String cpf, String rg, String endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

}

class Aluno extends Pessoa {
    private int turmaId;

    public Aluno(String nome, String matricula, String cpf, String rg, String endereco, int turmaId) {
        super(nome, matricula, cpf, rg, endereco);
        this.turmaId = turmaId;

    }

    public int getTurmaID() {
        return turmaId;
    }

    public String toString() {
        return "Aluno: " + nome + "/ turma: " + turmaId;
    }
}

class Professor extends Pessoa {
    public Professor(String nome, String matricula, String cpf, String rg, String endereco) {
        super(nome, matricula, cpf, rg, endereco);
    }

    public String toString() {
        return "Professor: " + nome + "/ matricula: " + matricula;

    }

}

public class SistemaAula {
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static ArrayList<Professor> professores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. cadastrar aluno");
            System.out.println("2. cadastrar professor");
            System.out.println("3. sair");
            System.out.println("escoloha uma opçao");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 1) {
                System.out.println("Nome do aluno: ");
                String nome = scanner.nextLine();
                System.out.println("Matricula: ");
                String matricula = scanner.nextLine();
                System.out.println("Qual é o cpf: ");
                String cpf = scanner.nextLine();
                System.out.println("Qual é o RG:");
                String rg = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("ID da turma: ");
                int turmaId = scanner.nextInt();
                scanner.nextLine();

                Aluno aluno = new Aluno(nome, matricula, cpf, rg, endereco, turmaId);
                alunos.add(aluno);

                imprimirAlunos();
            } else if (opcao == 2) {
                System.out.print("Nome do professor: ");
                String nome = scanner.nextLine();
                System.out.print("Matrícula: ");
                String matricula = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("RG: ");
                String rg = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();

                Professor professor = new Professor(nome, matricula, cpf, rg, endereco);
                professores.add(professor);

                imprimirProfessores();
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    public static void imprimirAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static void imprimirProfessores() {
        System.out.println("\n--- Lista de Professores ---");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }
}
