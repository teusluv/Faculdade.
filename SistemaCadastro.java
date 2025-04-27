import java.util.HashMap;
import java.util.Scanner;

//usei hashmap pelo fato de ser melhor pra organizar o objeto e o seu valor nele.
public class SistemaCadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> itens = new HashMap<>();

        while (true) {
            System.out.println("\nMenu de Cadastro:");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar todos");
            System.out.println("5 - Listar item");
            System.out.println("S - Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine().toUpperCase();

            if (opcao.equals("1")) {
                System.out.print("Digite o nome do item: ");
                String nomeIncluir = scanner.nextLine();
                System.out.print("Digite a descrição do item: ");
                String descricaoIncluir = scanner.nextLine();

                if (!itens.containsKey(nomeIncluir)) {
                    itens.put(nomeIncluir, descricaoIncluir);
                    System.out.println("Item '" + nomeIncluir + "' cadastrado com sucesso!");
                } else {
                    System.out.println("Erro: Item já existe.");
                }
            } else if (opcao.equals("2")) {
                System.out.print("Digite o nome do item a ser alterado: ");
                String nomeAlterar = scanner.nextLine();

                if (itens.containsKey(nomeAlterar)) {
                    System.out.print("Digite a nova descrição do item: ");
                    String descricaoAlterar = scanner.nextLine();
                    itens.put(nomeAlterar, descricaoAlterar);
                    System.out.println("Item '" + nomeAlterar + "' alterado com sucesso!");
                } else {
                    System.out.println("Erro: Item não encontrado.");
                }
            } else if (opcao.equals("3")) {
                System.out.print("Digite o nome do item a ser excluído: ");
                String nomeExcluir = scanner.nextLine();

                if (itens.containsKey(nomeExcluir)) {
                    itens.remove(nomeExcluir);
                    System.out.println("Item '" + nomeExcluir + "' excluído com sucesso!");
                } else {
                    System.out.println("Erro: Item não encontrado.");
                }
            } else if (opcao.equals("4")) {
                if (itens.isEmpty()) {
                    System.out.println("Nenhum item cadastrado.");
                } else {
                    System.out.println("\nLista de todos os itens cadastrados:");
                    for (HashMap.Entry<String, String> entry : itens.entrySet()) {
                        System.out.println("Nome: " + entry.getKey() + ", Descrição: " + entry.getValue());
                    }
                }
            } else if (opcao.equals("5")) {
                System.out.print("Digite o nome do item a ser listado: ");
                String nomeListar = scanner.nextLine();

                if (itens.containsKey(nomeListar)) {
                    System.out.println("Nome: " + nomeListar + ", Descrição: " + itens.get(nomeListar));
                } else {
                    System.out.println("Erro: Item não encontrado.");
                }
            } else if (opcao.equals("S")) {
                System.out.println("Saindo do sistema.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
