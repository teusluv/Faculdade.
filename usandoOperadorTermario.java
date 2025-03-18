//usando operador ternário

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite sua idade.");
        int idade = tecla.nextInt();
        double idade_dias = idade * 365 * 24;
        String resultado = (idade >= 18) ? "Voce é maior de idade" : "Voce é menor de idade";
        System.out.println(resultado);
        System.out.println("voce tem aproximadamente: " + idade_dias);

    }
}
