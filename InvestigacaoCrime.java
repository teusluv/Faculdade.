
import javax.swing.JOptionPane;

public class InvestigacaoCrime {
    public static void main(String[] args) {
        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        int contadorRespostasPositivas = 0;

        for (String pergunta : perguntas) {
            String resposta = JOptionPane.showInputDialog(null, pergunta + " (Sim/Não)");
            if (resposta != null && resposta.equalsIgnoreCase("Sim")) {
                contadorRespostasPositivas++;
            }
        }

        String classificacao;

        if (contadorRespostasPositivas == 5) {
            classificacao = "Assassino";
        } else if (contadorRespostasPositivas >= 3) {
            classificacao = "Cúmplice";
        } else if (contadorRespostasPositivas == 2) {
            classificacao = "Suspeita";
        } else {
            classificacao = "Inocente";
        }

        JOptionPane.showMessageDialog(null, "Classificação: " + classificacao);
    }
}