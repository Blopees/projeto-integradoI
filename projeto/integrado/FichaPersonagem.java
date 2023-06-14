package projeto.integrado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FichaPersonagem {

    public static void limparTela() {
        for (int cont = 0; cont < 50; cont++) {
            System.out.println("");
        }
    }

    public static void fichaDePersonagem() {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner tecladoInt = new Scanner(System.in);
        String[] nomes = {"João", "Srº Dorgival", "Luciano", "Belial"};
        String[] descricao = {"Protagonista", "Pai de João", "Melhor amigo do João", "Vilão"};
        String[] hobbies = {"Desenhar e ler", "Jogar futebol", "Tocar violão", "Jardinagem"};
        String[] cantores = {"Luiz Gonzaga, Jão e Rita Lee", "Barões da Pisadinha e Bruno e Marrone", "João Gomes e Marilia Mendonça", "não tem"};
        String[] profissao = {"Barman e futuro estudante de ciências sociais", "Vendedor de leite, carne e gerente de bar", "Auxiliar de padaria", "Açougueiro"};
        String[] personali = {"Pacifica e introvertida", "Delicada, expressiva e introvertida", "Genuinamente alegre, ácida e extrovertida", "Sádica"};
        String[] cores = {"Roxo", "Azul", "Preto", "não tem"};
        String[] comida = {"CuzCuz", "Bife e Buchada", "Feijão com farinha", "Carne mal passada"};
        String[] time = {"Palmeiras", "Corinthians", "Corinthians", "Sporte - Club do Recife"};
        int[] idades = {18, 57, 19, 25};
        double[] alturas = {1.70, 1.82, 1.75, 1.91};
        String escolha_ficha_personagem = new String();
        String opcao = new String();
        int quantidade;

        opcao = "";

        while (!opcao.equalsIgnoreCase("PARE")) {

            System.out.println("Escolha entre qual personagem você deseja conhecer melhor:\nJoão\nDorgival\nLuciano\nBelial\n");
            escolha_ficha_personagem = teclado.nextLine();

            if (escolha_ficha_personagem.equalsIgnoreCase("joao") || escolha_ficha_personagem.equalsIgnoreCase("joão")) {
                escolha_ficha_personagem = "João";

            } else if (escolha_ficha_personagem.equalsIgnoreCase("Dorgival")) {
                escolha_ficha_personagem = "Dorgival";

            } else if (escolha_ficha_personagem.equalsIgnoreCase("Luciano")) {
                escolha_ficha_personagem = "Luciano";

            } else if (escolha_ficha_personagem.equalsIgnoreCase("belial")) {
                escolha_ficha_personagem = "Belial";

            } else {
                System.out.println("================================");
                System.out.println("Opção invalida, escolha corretamente!");
                System.out.println("================================");

            }

            if (escolha_ficha_personagem.equalsIgnoreCase("João") || escolha_ficha_personagem.equalsIgnoreCase("Dorgival") || escolha_ficha_personagem.equalsIgnoreCase("Luciano") || escolha_ficha_personagem.equalsIgnoreCase("Belial")) {
                System.out.printf("Quantas coisas você gostaria de saber sobre %s escolha e digite abaixo:\n", escolha_ficha_personagem);
                System.out.println("============================================================================");
                System.out.println("| 01- Idade      02- Altura        03- Cantores favoritos     04-Hobbies    |");
                System.out.println("|                                                                           |");
                System.out.println("| 05- Profissão      06- Personalidade  07- Cor favorita 08- Comida Favorita|");
                System.out.println("|                                                                           |");
                System.out.println("| 09-Time de Futebol   10-Descrição                           |");
                System.out.println("============================================================================");
                quantidade = tecladoInt.nextInt();
                int[] escolhas = new int[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o(s) número(s) correpondente ao o que você deseja saber:");
                    escolhas[i] = tecladoInt.nextInt();
                }
                limparTela();
                System.out.println("=========================");
                if (escolha_ficha_personagem.equalsIgnoreCase("João")) {
                    for (int i = 0; i < escolhas.length; i++) {
                        if (escolhas[i] == 1) {
                            System.out.println("Idade: " + idades[0]);
                        }
                        if (escolhas[i] == 2) {
                            System.out.println("Altura: " + alturas[0]);
                        }
                        if (escolhas[i] == 3) {
                            System.out.println("Cantores favoritos: " + cantores[0]);
                        }
                        if (escolhas[i] == 4) {
                            System.out.println("Hobbies: " + hobbies[0]);
                        }
                        if (escolhas[i] == 5) {
                            System.out.println("Profissão: " + profissao[0]);
                        }
                        if (escolhas[i] == 6) {
                            System.out.println("Personalidade: " + personali[0]);
                        }
                        if (escolhas[i] == 7) {
                            System.out.println("Cor Favorita: " + cores[0]);
                        }
                        if (escolhas[i] == 8) {
                            System.out.println("Comida favorita: " + comida[0]);
                        }
                        if (escolhas[i] == 9) {
                            System.out.println("Time do coração: " + time[0]);
                        }
                        if (escolhas[i] == 10) {
                            System.out.println("Descrição: " + descricao[0]);
                        }

                    }

                } else if (escolha_ficha_personagem.equalsIgnoreCase("Dorgival")) {
                    for (int i = 0; i < escolhas.length; i++) {
                        if (escolhas[i] == 1) {
                            System.out.println("Idade: " + idades[1]);
                        }
                        if (escolhas[i] == 2) {
                            System.out.println("Altura: " + alturas[1]);
                        }
                        if (escolhas[i] == 3) {
                            System.out.println("Cantores favoritos: " + cantores[1]);
                        }
                        if (escolhas[i] == 4) {
                            System.out.println("Hobbies: " + hobbies[1]);
                        }
                        if (escolhas[i] == 5) {
                            System.out.println("Profissão: " + profissao[1]);
                        }
                        if (escolhas[i] == 6) {
                            System.out.println("Personalidade: " + personali[1]);
                        }
                        if (escolhas[i] == 7) {
                            System.out.println("Cor Favorita: " + cores[1]);
                        }
                        if (escolhas[i] == 8) {
                            System.out.println("Comida favorita: " + comida[1]);
                        }
                        if (escolhas[i] == 9) {
                            System.out.println("Time do coração: " + time[1]);
                        }
                        if (escolhas[i] == 10) {
                            System.out.println("Descrição: " + descricao[1]);
                        }

                    }

                } else if (escolha_ficha_personagem.equalsIgnoreCase("Luciano")) {
                    for (int i = 0; i < escolhas.length; i++) {
                        if (escolhas[i] == 1) {
                            System.out.println("Idade: " + idades[2]);
                        }
                        if (escolhas[i] == 2) {
                            System.out.println("Altura: " + alturas[2]);
                        }
                        if (escolhas[i] == 3) {
                            System.out.println("Cantores favoritos: " + cantores[2]);
                        }
                        if (escolhas[i] == 4) {
                            System.out.println("Hobbies: " + hobbies[2]);
                        }
                        if (escolhas[i] == 5) {
                            System.out.println("Profissão: " + profissao[2]);
                        }
                        if (escolhas[i] == 6) {
                            System.out.println("Personalidade: " + personali[2]);
                        }
                        if (escolhas[i] == 7) {
                            System.out.println("Cor Favorita: " + cores[2]);
                        }
                        if (escolhas[i] == 8) {
                            System.out.println("Comida favorita: " + comida[2]);
                        }
                        if (escolhas[i] == 9) {
                            System.out.println("Time do coração: " + time[2]);
                        }
                        if (escolhas[i] == 10) {
                            System.out.println("Descrição: " + descricao[2]);
                        }

                    }

                } else if (escolha_ficha_personagem.equalsIgnoreCase("Belial")) {
                    for (int i = 0; i < escolhas.length; i++) {
                        if (escolhas[i] == 1) {
                            System.out.println("Idade: " + idades[3]);
                        }
                        if (escolhas[i] == 2) {
                            System.out.println("Altura: " + alturas[3]);
                        }
                        if (escolhas[i] == 3) {
                            System.out.println("Cantores favoritos: " + cantores[3]);
                        }
                        if (escolhas[i] == 4) {
                            System.out.println("Hobbies: " + hobbies[3]);
                        }
                        if (escolhas[i] == 5) {
                            System.out.println("Profissão: " + profissao[3]);
                        }
                        if (escolhas[i] == 6) {
                            System.out.println("Personalidade: " + personali[3]);
                        }
                        if (escolhas[i] == 7) {
                            System.out.println("Cor Favorita: " + cores[3]);
                        }
                        if (escolhas[i] == 8) {
                            System.out.println("Comida favorita: " + comida[3]);
                        }
                        if (escolhas[i] == 9) {
                            System.out.println("Time do coração: " + time[3]);
                        }
                        if (escolhas[i] == 10) {
                            System.out.println("Descrição: " + descricao[3]);
                        }

                    }

                }

            }

            System.out.println("\n Sair do SubMenu Ficha de Personagem?\n Escreva PARE para sair. \n Enter, ou qualquer outra tecla - Continuar.");
            opcao = teclado2.nextLine();
            limparTela();
        }

        System.out.println("Ficha de Personagem Encerrado!");

    }

    public static void curiosidadesAleatorias() {

        Scanner teclado2 = new Scanner(System.in);
        String opcao = new String();
        opcao = "";

        String escolha_curiosidade_aleatoria = new String();

        List<String> curiosidades = new ArrayList<>();

        curiosidades.add("Senhor Dorgival foi batizado de Dorgival, porque sua mãe sentia falta de seu amado cão Dorgival");
        curiosidades.add("João nunca mais tocou em uma arma");
        curiosidades.add("Luciano é apaixonado pelo João");
        curiosidades.add("João e Luciano passaram com honras na faculdade");
        curiosidades.add("João tem uma tia chamada Luiza");
        curiosidades.add("João e Luciano começaram a ouvir Cazuza");
        curiosidades.add("Luciano começou aulas de auto defesa");
        curiosidades.add("João e Luciano jogam muito Pedra,Papel e Tesoura");
        curiosidades.add("Senhor Dorgival, João e Luciano estão assistindo muito The Big Bang Theory");
        curiosidades.add("Senhor Dorgival, João e Luciano estão praticando Pedra,Papel,Tesoura, Lagarto e Spock");
        curiosidades.add("Belial é um dos males inferiores na Lore do jogo Diablo, onde é definido como o Senhor da Mentira");
        curiosidades.add("No bar do senhor Dorgival existem três clientes fiéis mas inconvenientes");

        Random aleatoria_escolha_curiosidades = new Random();

        while (!opcao.equalsIgnoreCase("PARE")) {
            escolha_curiosidade_aleatoria = curiosidades.get(aleatoria_escolha_curiosidades.nextInt(curiosidades.size()));
            System.out.println(escolha_curiosidade_aleatoria);
            System.out.println("\n Sair do SubMenu Curiosidades Aleatorias?\n Escreva PARE para sair. \n Enter, ou qualquer outra tecla - Continuar.");
            opcao = teclado2.nextLine();
            limparTela();
        }

        System.out.println("Curiosidades Aleatorias Encerrado!");

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

            System.out.println("\n Voltar para Menu Principal ou escolher Ficha de Personagem  ou Curiosidades Aleatorias?\n Escreva PARE para voltar ao Menu Principal. \n Enter, ou qualquer outra tecla - escolher entre ficha de Personagem ou Curiosidades Aleatorias");
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
