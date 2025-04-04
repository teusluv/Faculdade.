import java.util.Scanner;

public class CalcularAMedia {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o numero de elementos (N): ");
        int N = tecla.nextInt();
        int soma = 0;
        int contador = 0;

        while (contador > N) {
            System.out.println("Digite o numero " + (contador + 1));
            int numero = tecla.nextInt();
            soma += numero;
            contador++;

        }
        double media = (double) soma / N;
        System.out.println("A media dos numeros é: " + media);

    }
}
