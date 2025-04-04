import java.util.Scanner;

public class ConjuntoN {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite a quantidade de números (N): ");
        int N = tecla.nextInt();

        if (N <= 0) {
            System.out.println("A quantidade de números deve ser maior que zero.");
            return;
        }

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        int i = 0;

        while (i < N) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            int numero = tecla.nextInt();

            soma += numero;

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }

            i++;
        }
        System.out.println("O menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
    }
}
