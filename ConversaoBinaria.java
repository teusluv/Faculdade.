import java.util.Scanner;

public class ConversaoBinaria {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número natural: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, digite um número natural (não-negativo).");
        } else {

            String binario = converterParaBinario(numero);
            System.out.println("O número " + numero + " em binário é: " + binario);
        }

        scanner.close();
    }

    public static String converterParaBinario(int numero) {
        StringBuilder binario = new StringBuilder();
        if (numero == 0) {
            return "0";
        }

        System.out.println("Passo a passo da conversão de " + numero + " para binário:");
        while (numero > 0) {
            int resto = numero % 2;  
            int quociente = numero / 2;
            System.out.println("Número: " + numero + " -> Resto: " + resto + ", Quociente: " + quociente);
            binario.insert(0, resto);
            numero = quociente;
        }
        return binario.toString();
    }
}


