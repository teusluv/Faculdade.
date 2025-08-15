import java.util.Scanner;

public class ConversaoBinaria {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário um número natural
        System.out.print("Digite um número natural: ");
        int numero = scanner.nextInt();

        // Verificando se o número é natural (não-negativo)
        if (numero < 0) {
            System.out.println("Por favor, digite um número natural (não-negativo).");
        } else {
            // Chamando a função para converter o número em binário
            String binario = converterParaBinario(numero);
            System.out.println("O número " + numero + " em binário é: " + binario);
        }

        // Fechando o scanner
        scanner.close();
    }

    // Função para converter um número decimal para binário
    public static String converterParaBinario(int numero) {
        // Usando um StringBuilder para construir a string binária
        StringBuilder binario = new StringBuilder();
        
        // Se o número for zero, retornamos diretamente "0"
        if (numero == 0) {
            return "0";
        }

        System.out.println("Passo a passo da conversão de " + numero + " para binário:");

        // Enquanto o número for maior que zero
        while (numero > 0) {
            // Divisão inteira por 2
            int resto = numero % 2;  
            int quociente = numero / 2;

            // Exibindo como foi o cálculo (resto e quociente)
            System.out.println("Número: " + numero + " -> Resto: " + resto + ", Quociente: " + quociente);

            // Adicionamos o resto à string binária (inserindo à esquerda)
            binario.insert(0, resto);

            // Atualizamos o número, que agora é o quociente
            numero = quociente;
        }

        // Retornamos o número binário como uma string
        return binario.toString();
    }
}

