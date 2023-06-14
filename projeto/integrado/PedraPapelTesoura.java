package projeto.integrado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    public static void limparTela() {
        for (int cont = 0; cont < 50; cont++) {
            System.out.println("");
        }
    }

    public static String opcao_Jogador() {

        Scanner teclado = new Scanner(System.in);
        String escolha_jogador = new String();
        System.out.println("Escolha entre Pedra, Papel e Tesoura: ");
        escolha_jogador = teclado.nextLine();

        if (escolha_jogador.equalsIgnoreCase("pedra")) {
            escolha_jogador = "Pedra";

        } else if (escolha_jogador.equalsIgnoreCase("papel")) {
            escolha_jogador = "Papel";

        } else if (escolha_jogador.equalsIgnoreCase("tesoura")) {
            escolha_jogador = "Tesoura";

        } else {
            System.out.println("Opção invalida, escolha corretamente!");
            escolha_jogador = opcao_Jogador();

        }

        return escolha_jogador;

    }

    public static String opcao_Npc() {

        String escolha_npc = new String();
        List<String> lista_escolhas_npc = new ArrayList<>();

        lista_escolhas_npc.add("Pedra");
        lista_escolhas_npc.add("Papel");
        lista_escolhas_npc.add("Tesoura");

        Random aleatoria_escolha_npc = new Random();

        escolha_npc = lista_escolhas_npc.get(aleatoria_escolha_npc.nextInt(lista_escolhas_npc.size()));

        return escolha_npc;

    }

    public static void main(String[] args) {
        String escolha_npc = new String();
        String escolha_jogador = new String();
        String opcao = new String();
        opcao = "";
        int npc_Vitorias = 0, jogador_Vitorias = 0;
        Scanner teclado2 = new Scanner(System.in);
        while (!opcao.equalsIgnoreCase("PARE")) {
            System.out.println("==================================");
            System.out.println("===PEDRA === PAPEL === TESOURA ===");
            System.out.println("==================================");
            escolha_npc = opcao_Npc();
            escolha_jogador = opcao_Jogador();
            System.out.println("==================================");
            if (escolha_jogador.equals("Papel") && escolha_npc.equals("Pedra") || escolha_jogador.equals("Pedra") && escolha_npc.equals("Tesoura") || escolha_jogador.equals("Tesoura") && escolha_npc.equals("Papel")) {
                System.out.println("==================================");
                System.out.println(" Jogador escolheu [" + escolha_jogador + "] e o PC escolheu [" + escolha_npc
                        + "]\n Resultado: Voce Ganhou!");
                jogador_Vitorias += 1;
                System.out.println("Vitorias Jogador = " + jogador_Vitorias + "\n Vitorias PC = " + npc_Vitorias);
                System.out.println("==================================");
            } else if (escolha_jogador.equals(escolha_npc)) {
                System.out.println("==================================");
                System.out.println(" Jogador escolheu [" + escolha_jogador + "] e o PC escolheu [" + escolha_npc
                        + "]\n Resultado: Empate");
                System.out.println("==================================");
            } else {
                System.out.println("==================================");
                System.out.println(" Jogador escolheu [" + escolha_jogador + "] e o PC escolheu [" + escolha_npc
                        + "]\n Resultado: Tu perdeu! A maquina vai dominar o Mundo xD");
                npc_Vitorias
                        += 1;
                System.out.println(
                        " Vitorias Jogador = " + jogador_Vitorias + "\n Vitorias PC = " + npc_Vitorias);
                System.out.println(
                        "==================================");
            }

            System.out.println("Voltar ao Menu Inicial?\n Escreva PARE para voltar. \n Enter, ou qualquer outra tecla - Continuar.");
            opcao = teclado2.nextLine();
            limparTela();

        }
        System.out.println("==================================");
        System.out.println("=========== ENCERRADO ============");
        System.out.println("==================================");
        System.out.println("\n\n");
        Main retornaInicio = new Main();
        retornaInicio.main(args);

    }

}
