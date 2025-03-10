import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite sua idade.");
        int idade = tecla.nextInt();
        if (idade >= 18) {
            System.out.println("voce tem mais de 18 anos.");
        } else {
            System.out.println("voce tem menos de 18 anos.");
        }
        double idade_horas = idade * 8760;
        System.out.println("voce tem em horas: " + idade_horas);

    }
}
