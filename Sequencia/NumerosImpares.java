import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o numero de de elementos(N)");
        int N = tecla.nextInt();
        int contadorImpar = 0;
        int i = 0;
        while (i < N) {
            System.out.println("Digite o numero " + (i + 1) + ":");
            int numero = tecla.nextInt();
            if (numero % 2 != 0) {
                contadorImpar++;
            }
            i++;
        }
        System.out.println("A quantidade de números impares é: " + contadorImpar);
    }

}
