
import java.util.Scanner;

public class SistemaCadrstro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][][] notas = new double[5][3][5];

        for (int aluno = 0; aluno < 5; aluno++) {
            System.out.println("Aluno " + (aluno + 1) + ":");
            for (int disciplina = 0; disciplina < 3; disciplina++) {
                System.out.println("  Disciplina " + (disciplina + 1) + ":");
                for (int avaliacao = 0; avaliacao < 5; avaliacao++) {
                    System.out.print("    Nota da avaliação " + (avaliacao + 1) + ": ");
                    notas[aluno][disciplina][avaliacao] = scanner.nextDouble();
                }
            }
        }
    }
}