
package com.mycompany.mavenproject1;

/**
 *
 * @author teus
 */
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite a quantidade de dolar que você quer converter em reais.");
        double dolar = tecla.nextDouble();
        System.out.println(dolar * 5.88);
        double reais = tecla.nextDouble();
        reais = tecla.nextDouble();
        System.out.printf("em reais o valor é", reais);
    }
}
