package projeto.integrado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FichaPersonagem {

    public static void fichaDePersonagem() {

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        String[] nomes = {"João", "Srº Dorgival", "Luciano", "Belial"};
        String[] descricao = {"Protagonista", "Pai de João", "Melhor amigo do João", "Suspeito"};
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

            if (escolha_ficha_personagem.equalsIgnoreCase("João")) {
                System.out.println("Quantas coisas você gostaria de saber sobre João? Escolha e digite abaixo:\n ");
                System.out.println("============================================================================");
                System.out.println("| 01- Idade      02- Altura        03- Cantores favoritos     04-Hobbies    |");
                System.out.println("|                                                                           |");
                System.out.println("| 05- Profissão      06- Personalidade  07- Cor favorita 08- Comida Favorita|");
                System.out.println("|                                                                           |");
                System.out.println("| 09-Time de Futebol   10-Cursiosidade Aleatória                            |");
                System.out.println("============================================================================");
                quantidade = teclado.nextInt();
                int[] escolhas = new int[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o(s) número(s) correpondente ao o que você deseja saber:");
                    escolhas[i] = teclado.nextInt();
                }

                System.out.println("=========================");
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
                        System.out.println("Curiosidade Aleatória: " + alturas[0]);
                    }

                }
            } else if (escolha_ficha_personagem.equalsIgnoreCase("Dorgival")) {
                System.out.println("Quantas coisas você gostaria de saber sobre o Sr. Dorge? Escolha e digite abaixo:\n ");
                System.out.println("============================================================================");
                System.out.println("| 01- Idade      02- Altura        03- Cantores favoritos     04-Hobbies    |");
                System.out.println("|                                                                           |");
                System.out.println("| 05- Profissão      06- Personalidade  07- Cor favorita 08- Comida Favorita|");
                System.out.println("|                                                                           |");
                System.out.println("| 09-Time de Futebol   10-Cursiosidade Aleatória                            |");
                System.out.println("============================================================================");
                quantidade = teclado.nextInt();
                int[] escolhas = new int[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o(s) número(s) correpondente ao o que você deseja saber:");
                    escolhas[i] = teclado.nextInt();
                }

                System.out.println("=========================");
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
                        System.out.println("Curiosidade Aleatória: " + alturas[1]);
                    }

                }

            } else if (escolha_ficha_personagem.equalsIgnoreCase("Luciano")) {
                System.out.println("Quantas coisas você gostaria de saber sobre João? Escolha e digite abaixo:\n ");
                System.out.println("============================================================================");
                System.out.println("| 01- Idade      02- Altura        03- Cantores favoritos     04-Hobbies    |");
                System.out.println("|                                                                           |");
                System.out.println("| 05- Profissão      06- Personalidade  07- Cor favorita 08- Comida Favorita|");
                System.out.println("|                                                                           |");
                System.out.println("| 09-Time de Futebol   10-Cursiosidade Aleatória                            |");
                System.out.println("============================================================================");
                quantidade = teclado.nextInt();
                int[] escolhas = new int[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o(s) número(s) correpondente ao o que você deseja saber:");
                    escolhas[i] = teclado.nextInt();
                }

                System.out.println("=========================");
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
                        System.out.println("Curiosidade Aleatória: " + alturas[2]);
                    }

                }
            } else if (escolha_ficha_personagem.equalsIgnoreCase("Belial")) {
                System.out.println("Quantas coisas você gostaria de saber sobre nosso Suspeito? Escolha e digite abaixo:\n ");
                System.out.println("============================================================================");
                System.out.println("| 01- Idade      02- Altura        03- Cantores favoritos     04-Hobbies    |");
                System.out.println("|                                                                           |");
                System.out.println("| 05- Profissão      06- Personalidade  07- Cor favorita 08- Comida Favorita|");
                System.out.println("|                                                                           |");
                System.out.println("| 09-Time de Futebol   10-Cursiosidade Aleatória                            |");
                System.out.println("============================================================================");
                quantidade = teclado.nextInt();
                int[] escolhas = new int[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o(s) número(s) correpondente ao o que você deseja saber:");
                    escolhas[i] = teclado.nextInt();
                }

                System.out.println("=========================");
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
                        System.out.println("Curiosidade Aleatória: " + alturas[3]);
                    }

                }
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

        curiosidades.add("Sr Dorgival foi batizado de Dorgival, porque sua mãe sentia falta de seu amado cão Dorgival");
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
