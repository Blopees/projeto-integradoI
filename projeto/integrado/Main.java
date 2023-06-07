package projeto.integrado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("=======================================================");
        System.out.println("============== Projeto Integrador I ===================");
        System.out.println("=======================================================");
        System.out.println("\n");
        System.out.println("======= Escolha entre os jogos ===========");
        System.out.println("======== [1] RPG CARCARA =================");
        System.out.println("======== [2] FICHA DE PERSONAGENS ========");
        System.out.println("======== [3] PEDRA PAPEL TESOURA =========");
        System.out.println("======== [10] ENCERRAR ===================");
        System.out.println("==========================================");
        opcao = teclado.nextInt();
        if (opcao == 1) {
            CarcaraRPG jogo1 = new CarcaraRPG();
            jogo1.main(args);
        } else if (opcao == 2) {
            FichaPersonagem jogo2 = new FichaPersonagem();
            jogo2.main(args);
        } else if (opcao == 3) {
            PedraPapelTesoura jogo3 = new PedraPapelTesoura();
            jogo3.main(args);
        } else if (opcao == 10) {
            System.out.println("==================================");
            System.out.println("=========== ENCERRADO ============");
            System.out.println("==================================");
            System.out.println("\n\n");
        } else {
            System.out.println("Opção invalida, escolha corretamente!");
            Main.main(args);
        }
        teclado.close();

    }

}
