import java.util.Scanner;

public class Ler5Numeros {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o numero " + i);
            int numero = tecla.nextInt();
            soma += numero;
            System.out.println("A soma dos numeros sao:" + soma);

        }

    }

}
