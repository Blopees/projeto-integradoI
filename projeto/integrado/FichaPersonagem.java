package projeto.integrado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FichaPersonagem {

    public static void fichaDePersonagem() {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String[] nomes = {"João", "Srº Tobias", "Luciano", "Belial"};
        String[] descricao = {"Protagonista", "Pai de João", "Melhor amigo do João", "Vilão"};
        int[] idades = {19, 45, 19, 25};
        double[] alturas = {1.65, 1.70, 1.60, 1.90};
        String escolha_ficha_personagem = new String();
        String opcao = new String();
        opcao = "";

        while (!opcao.equalsIgnoreCase("PARE")) {

            System.out.println("Escolha entre:\nJoão\nTobias\nLuciano\nBelial");
            escolha_ficha_personagem = teclado.nextLine();

            if (escolha_ficha_personagem.equalsIgnoreCase("joao") || escolha_ficha_personagem.equalsIgnoreCase("joão")) {
                escolha_ficha_personagem = "João";

            } else if (escolha_ficha_personagem.equalsIgnoreCase("Tobias")) {
                escolha_ficha_personagem = "Tobias";

            } else if (escolha_ficha_personagem.equalsIgnoreCase("Luciano")) {
                escolha_ficha_personagem = "Luciano";

            } else if (escolha_ficha_personagem.equalsIgnoreCase("belial")) {
                escolha_ficha_personagem = "Belial";

            } else {
                System.out.println("================================");
                System.out.println("Opção invalida, escolha corretamente!");
                System.out.println("================================");

            }

            if (escolha_ficha_personagem.equalsIgnoreCase("João")) {
                System.out.println("================================");
                System.out.println("Nome: " + nomes[0] + "\n"
                        + "Idade: " + idades[0] + "\n"
                        + "Altura: " + alturas[0] + "\n"
                        + "Descrição: " + descricao[0] + "\n");
                System.out.println("================================");
            } else if (escolha_ficha_personagem.equalsIgnoreCase("Tobias")) {
                System.out.println("================================");
                System.out.println("Nome: " + nomes[1] + "\n"
                        + "Idade: " + idades[1] + "\n"
                        + "Altura: " + alturas[1] + "\n"
                        + "Descrição: " + descricao[1] + "\n");
                System.out.println("================================");
            } else if (escolha_ficha_personagem.equalsIgnoreCase("Luciano")) {
                System.out.println("================================");
                System.out.println("Nome: " + nomes[2] + "\n"
                        + "Idade: " + idades[2] + "\n"
                        + "Altura: " + alturas[2] + "\n"
                        + "Descrição: " + descricao[2] + "\n");
                System.out.println("================================");
            } else if (escolha_ficha_personagem.equalsIgnoreCase("Belial")) {
                System.out.println("================================");
                System.out.println("Nome: " + nomes[3] + "\n"
                        + "Idade: " + idades[3] + "\n"
                        + "Altura: " + alturas[3] + "\n"
                        + "Descrição: " + descricao[3] + "\n");
                System.out.println("================================");
            } else {
                System.out.println("================================");
                System.out.println("Ficha de personagem não encontrada!");
                System.out.println("================================");

            }

            System.out.println("Continuar?\n Escreva PARE para encerrar. \n Enter, ou qualquer outra tecla - Continuar.");
            opcao = teclado2.nextLine();

        }

    }

    public static void curiosidadesAleatorias() {

        Scanner teclado = new Scanner(System.in);

        String escolha_curiosidade_aleatoria = new String();

        List<String> curiosidades = new ArrayList<>();

        curiosidades.add("Sr Tobias foi batizado de Tobias, porque sua mãe sentia falta de seu amado cão Tobias");
        curiosidades.add("João nunca mais tocou em uma arma");
        curiosidades.add("Luciano é apaixonado pelo João");
        curiosidades.add("João e Luciano passaram com horas na faculdade");

        Random aleatoria_escolha_curiosidades = new Random();

        escolha_curiosidade_aleatoria = curiosidades.get(aleatoria_escolha_curiosidades.nextInt(curiosidades.size()));

        System.out.println(escolha_curiosidade_aleatoria);

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String opcao = new String();
        opcao = "";
        int escolhaFuncao = 0;

        while (!opcao.equalsIgnoreCase("PARE")) {

            System.out.println("Escolha entre:\n 1 - Ficha de Personagem \n 2 - Curiosidades Aleatorias");
            escolhaFuncao = teclado.nextInt();

            if (escolhaFuncao == 1) {
                fichaDePersonagem();
            }
            if (escolhaFuncao == 2) {
                curiosidadesAleatorias();
            }

            System.out.println("Continuar?\n Escreva PARE para encerrar. \n Enter, ou qualquer outra tecla - Continuar.");
            opcao = teclado2.nextLine();

        }

        System.out.println("==================================");
        System.out.println("=========== ENCERRADO ============");
        System.out.println("==================================");
        System.out.println("\n\n");
        Main retornaInicio = new Main();
        retornaInicio.main(args);

    }

}
