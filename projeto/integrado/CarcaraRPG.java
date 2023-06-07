package projeto.integrado;

import java.util.Scanner;

public class CarcaraRPG {

    public static void batalha(String nome) {

        Scanner ler = new Scanner(System.in);

        int vida = 120; //Vida do protagonista
        int vidaNova = 0; //Variavel para armazenar perca de vida
        int vidaBelial = 140; //Vida do vilão
        int decisao = 0;

        //Batalha
        System.out.println("Naquele momento senti o corpo pesado de Belial em cima de mim e decidi...\n"
                + "1- Tentar socar a cara de Belial "
                + "\n2- Defender-se cobrindo o rosto ");
        decisao = ler.nextInt();

        while (decisao == 1) {
            vida -= 20;
            vidaNova = vida;
            System.out.println("-------------------------------");  //Aqui, caso você tente golpear inumeras vezes, você morre. Porém se escolher se defender você pode sair dessa terrivel situação.

            System.out.println("Tento lutar porém Belial me devolve outro soco");
            System.out.println("Sua vida atual: " + vidaNova);

            System.out.println("\n1- Retribuir com outro soco. "
                    + "\n2- Defender-se do próximo soco de Belial.");
            decisao = ler.nextInt();

            if (decisao == 2) {
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");

                System.out.println("Decido me defender e coloco meu braço direito em frente ao meu rosto."
                        + "\nEm seguida, Belial ,que parecia sentir prazer com toda aquela situação diz gritando que não adiantava tentar se defender."
                        + "\nMesmo desnorteado tento pensar em uma forma de me livrar dele quando ouço Luciano falando incansávelmente sobre"
                        + "\num 'vidro'.Percebo então um caco de vidro do meu lado esquerdo.\n"
                        + "\n1 - * Pegar o caco de vidro e golpear Belial *  "
                        + "\n2 - * Pegar a arma *");
                decisao = ler.nextInt();

                if (decisao == 1) {
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("Decido em segundos que iria acertar Belial com aquele pedaço de vidro no(a)"
                            + "\n1 - * olho *"
                            + "\n2 - * pescoço * ");
                    decisao = ler.nextInt();

                    if (decisao == 1) {
                        System.out.println("-------------------------------");
                        System.out.println("Em subto acerto o olho direito de Belial. Que desfaz o maldito sorriso que mantinha"
                                + "\ndesde o segundo que me viu."
                                + "\n1 - * Dar outro golpe*");
                        decisao = ler.nextInt();

                        while (decisao == 1) {
                            vidaBelial -= 40;
                            vidaNova = vidaBelial;
                            System.out.println("-------------------------------");
                            System.out.println("Golpeio o olho de Belial e o vejo seu sangue caindo ..."
                                    + "\n1 - * Dar outro golpe *");
                            System.out.println("Vida de Belial: " + vidaNova);
                            decisao = ler.nextInt();

                            if (vidaNova == 0 || vidaNova < 0) {
                                System.out.println("Após inúmeros golpes Belial cai sobre meu corpo e finalmente posso"
                                        + "\nretirar Luciano daquele cativeiro...");
                                break;
                            }
                        }

                    }

                    if (decisao == 2) {
                        System.out.println("-------------------------------");
                        System.out.println("-------------------------------");
                        System.out.println("Em subto acerto o pescoço de Belial.Que desfaz o sorriso que mantinha"
                                + "\ndesde que me viu."
                                + "\n1 - * Dar outro golpe *");
                        decisao = ler.nextInt();

                        while (decisao == 1) {
                            vidaBelial -= 40;
                            vidaNova = vidaBelial;
                            System.out.println("Golpeio o pescoço de Belial e o vejo seu sangue caindo ..."
                                    + "\n1 - * Dar outro golpe *");
                            System.out.println("Vida de Belial: " + vidaNova);
                            decisao = ler.nextInt();

                            if (vidaNova == 0 || vidaNova < 0) {
                                System.out.println("Após inúmeros golpes Belial cai sobre meu corpo e finalmente posso"
                                        + "\nretirar Luciano daquele cativeiro...");
                                break;
                            }
                        }
                    }

                }

                if (decisao == 2) {
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("Decido tentar pegar a arma e por sorte consigo mirar e ... "
                            + "\n1 - * Atirar na perna de Belial *"
                            + "\n2 - * Atirar na  virilha de Belial *");
                    decisao = ler.nextInt();

                }
            }

            if (vidaNova == 0) {
                System.out.println("-------------- // // -----------------");
                System.out.println(nome + " ,sua vida chegou a 0 . Isso significa que a partir daqui a "
                        + "\nhistória será contada sem que você possa decidir mais nada");
                break;
            }

        }

        if (decisao == 2) {
            System.out.println("Coloco meu braço direito em frente ao meu rosto tentando me defender\nquando, em um estralo de dedos para realidade sinto nas pontas dos meus dedos algo pontudo,um \ngrande caco de vidro");
            System.out.println("1- * Tentar usar o caco de vidro* "
                    + "\n2- *Tentar pegar a arma novamente*");
            decisao = ler.nextInt();

            if (decisao == 1) {
                System.out.println("-------------------------------");
                System.out.println("-------------------------------");
                System.out.println("Decido em segundos que iria acertar Belial com aquele pedaço de vidro no(a)"
                        + "\n1 - * olho *"
                        + "\n2 - * pescoço * ");
                decisao = ler.nextInt();

                if (decisao == 1) {
                    System.out.println("-------------------------------");
                    System.out.println("Em subto acerto o olho direito de Belial. Que desfaz o maldito sorriso que mantinha"
                            + "\ndesde o segundo que me viu."
                            + "\n1 - * Dar outro golpe*");
                    decisao = ler.nextInt();

                    while (decisao == 1) {
                        vidaBelial -= 40;
                        vidaNova = vidaBelial;
                        System.out.println("-------------------------------");
                        System.out.println("Golpeio o olho de Belial e o vejo seu sangue caindo ..."
                                + "\n1 - * Dar outro golpe *");
                        System.out.println("Vida de Belial: " + vidaNova);
                        decisao = ler.nextInt();

                        if (vidaNova == 0 || vidaNova < 0) {
                            System.out.println("Após inúmeros golpes Belial cai sobre meu corpo e finalmente posso"
                                    + "\nretirar Luciano daquele cativeiro...");
                            break;
                        }
                    }

                }

                if (decisao == 2) {
                    System.out.println("-------------------------------");
                    System.out.println("-------------------------------");
                    System.out.println("Em subto acerto o pescoço de Belial.Que desfaz o sorriso que mantinha"
                            + "\ndesde que me viu."
                            + "\n1 - * Dar outro golpe *");
                    decisao = ler.nextInt();

                    while (decisao == 1) {
                        vidaBelial -= 40;
                        vidaNova = vidaBelial;
                        System.out.println("Golpeio o pescoço de Belial e o vejo seu sangue caindo ..."
                                + "\n1 - * Dar outro golpe *");
                        System.out.println("Vida de Belial: " + vidaNova);
                        decisao = ler.nextInt();

                        if (vidaNova == 0 || vidaNova < 0) {
                            System.out.println("Após inúmeros golpes Belial cai sobre meu corpo e finalmente posso"
                                    + "\nretirar Luciano daquele cativeiro...");
                            break;
                        }
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int decisao;

        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
        }

        System.out.println("---------- --------------- --------------------");

        System.out.println("Olá camarada, antes de começarmos\n"
                + "gostaria de saber seu nome, digite a baixo:  ");
        nome = ler.nextLine();

        try {
            Thread.sleep(100);
        } catch (Exception erro) {
        }

        System.out.println("\nOlá " + nome + " agradecemos imensamente");

        System.out.println(" ------------------------- -------------------- ");

        System.out.println("\n Legal " + nome + "!!" + ". Bem, o que você verá a seguir é"
                + "\n a história de João, um garoto nascido e criado no municipio de Paranatama-PE"
                + "\n que repentinamente vê sua vida revirar-se de cabeça para baixo "
                + "\n quando seu amigo de infância é dado como desaparecido.");
        try {
            Thread.sleep(100);
        } catch (Exception erro) {
        }

        System.out.println("  \nJoão Sibito sempre foi um rapaz isolado, sem muitos amigos."
                + "\nPorém, no ano de 2017, em um dos primeiros dias de aula na turma"
                + "\ndo oitavo ano da escola Dom Vital , Sibito ,que chorava no banheiro por"
                + "\nmotivos pessoais,conhece o cara que mudaria sua vida. Esse era Luciano, que após"
                + "\ndistrair João da choradeira ensinou-lhe um jogo chamado 'pedra, papel tesoura'... ");

        try {
            Thread.sleep(100);
        } catch (Exception erro) {
        }

        //Carcará
        System.out.println(nome + " Seja bem vindo à Carcará...");
        try {
            Thread.sleep(100);
        } catch (Exception erro) {
        }

        System.out.println(" --------- ------------ ----------------- ---------- -------------------- ");

        try {
            Thread.sleep(100);
        } catch (Exception erro) {
        }

        System.out.println("\n A minha frente vejo dois indivíduos com expressões distintas me observando fixamente, "
                + "\n a principio consigo reconhecer um dos rostos, era  Luciano, seus cabelos que sempre foram levemente "
                + "\n cacheados e delicados agora estão despenteados e cobertos de sangue, seus olhos carregam um peso descomunal , "
                + "\n suas roupas estão quase completamente rasgadas e seu sorriso tão marcante parecia ter sido erradicado. Ao seu lado "
                + "\n percebo um homem alto ,sem rosto e de presença odiosa, quase consumada pela vontade de destruir a existência de qualquer "
                + "\n um que estivesse à sua frente, ou seja ,eu. Por um momento estou quase associando quem é tal cidadão, porém ao fundo escuto "
                + "\n a voz de meu pai ,junto a repetidos toques. Acordo com ele cutucando meu ombro dizendo que tinha alguém me esperando na cozinha "
                + "\n e que o trabalho hoje ia começar mais cedo no bar .Digo que em minutos vou para o balcão e em seguida..."
                + "\n"
                + "\n1- *Ir para cozinha*"
                + "\n2- *Verifico as notificações no celular*");
        System.out.println(" --------- ------------  ");
        decisao = ler.nextInt();

        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
        }

        //1- *Ir para cozinha*"
        if (decisao == 1) {

            System.out.println(" \nSigo em direção a cozinha me perguntando se me sonho "
                    + "\npoderia ter algum significado e se eu deveria falar para alguém o "
                    + "\nque vi , porém ,tive meus pensamentos interrompidos pelo sorriso de "
                    + "\nLuciano que, sentado na mesa de minha cozinha dizia algo sobre o 'incomparável "
                    + "\nsabor da tapioca da tia', sigo a diante e falo:");

            try {
                Thread.sleep(1000);
            } catch (Exception erro) {
            }

            System.out.println("\n1- 'A vida agora é um morango para você estar entrando na minha casa e comendo da  minha comida de forma tão simples?'"
                    + "\n2- 'Isso é porque você não provou o cuscuz com leite que ela prepara em comemorações especiais.'");
            decisao = ler.nextInt();

            //decisao1
            if (decisao == 1) {
                System.out.println("Luciano olha para mim fazendo uma expressão exagerada de espanto, em seguida concorda com a cabeça e diz "
                        + "\n'você sabe que sempre foi assim, já que aqui é minha segunda casa' enquanto se levanta comendo uma tapioca que, "
                        + "\naparentemente era de coco ralado. Sigo seus passos enquanto ele se direciona para o curral, onde ele iria pegar ,"
                        + "\ncomo sempre, duas garrafas de leite . \n"
                        + "\nQuase toda manhã ,desde que nos conhecemos em 2018 no fundamental || , tínhamos essa mesma rotina, eu acordava,"
                        + "\ntomava café e recebia o valor das garrafas de leite compradas por Luciano. \n"
                        + "\nSempre fui um garoto retraído ,mas com ele eu sempre me sentia minimamente livre da minha vergonha."
                        + "\nApós conversamos durante um tempo e atualizar um ao outro sobre a faculdade e o trabalho nos despedimos e digo: "
                        + "\nLuciano, sei que é bobagem mas toma cuidado hoje quando tu for voltar do trabalho, tive um sonho onde você parecia ter sido sequestrado, tenho medo que algo possa vir a conhecer. Ah e se der aparece aqui mais tarde para a festa de painho!!");

                try {
                    Thread.sleep(1000);
                } catch (Exception erro) {
                }

                System.out.println("1- * Seguir em direção ao bar para iniciar o trabalho *");
                decisao = ler.nextInt();
            }

            if (decisao == 2) {
                System.out.println("Luciano olha para mim e diz 'na verdade já provei inúmeras vezes, principalmente quando "
                        + "\n‘cê tava no seu cursinho ou quando é aniversário de algum parente seu' ,enquanto se levanta, dou um soquinho em seu ombro esquerdo e sigo seus passos enquanto ele se direciona para o curral, onde iria pegar ,como sempre, duas garrafas de leite ."
                        + "\nQuase toda manhã ,desde que nos conhecemos em 2018, tínhamos essa mesma rotina, eu acordava, tomava café e recebia o valor das garrafas de leite compradas por Luciano. "
                        + "\nSempre fui um garoto retraído ,mas com ele eu sempre me sentia minimamente livre da minha vergonha. "
                        + "\nApós conversamos durante um tempo e atualizar um ao outro sobre a faculdade e o trabalho nos despedimos e digo: Luciano, sei que é bobagem mas toma cuidado hoje quando tu for voltar do trabalho, tive um sonho onde você parecia ter sido sequestrado, tenho medo que algo possa vir a conhecer. Ah e se der aparece aqui mais tarde para a festa de painho."
                        + "\nLuciano sorri para mim e diz que ao final de seu expediente na padaria iria vir.\n"
                );
                try {
                    Thread.sleep(1000);
                } catch (Exception erro) {
                }

                System.out.println("1- * Seguir em direção ao bar para iniciar o trabalho *");
                decisao = ler.nextInt();

                if (decisao == 1) {
                    System.out.println("\nObservo ele abrir a porteira, pegar sua bicicleta vermelha e sumir ao horizonte ,"
                            + "\nem seguida vou em direção ao bar, já que, embora eu esteja repleto de atividades da faculdade para fazer, "
                            + "\nainda tenho que auxiliar meu pai na organização, manutenção e limpeza do seu comércio . \n"
                            + "\nA minha frente observo o caus deixado pelos fregueses na noite anterior. Há garrafas de pitú espalhadas "
                            + "\npor todo o chão, mesas caídas, um cheiro insuportável vindo do banheiro e peças de dominó jogas pelos quatro "
                            + "\ncantos do espaço. Assim inicio a organização pelo (a): ");

                    System.out.println("\n1- * limpeza do banheiro  *"
                            + "\n2- * coleta das garrafas de pitú *"
                            + "\n3 - * organização das mesas *"
                            + "\n4- * coleta das inúmeras peças de dominó *  ");
                    decisao = ler.nextInt();

                    if (decisao == 1) {

                    }
                    if (decisao == 2) {

                    }
                    if (decisao == 3) {

                    }
                    if (decisao == 4) {

                    }

                }
            }

            //Batalha
            batalha(nome);

        }

        //2- *Verifico as notificações no celular*"
        if (decisao == 2) {

            System.out.println(" Abro minhas mensagens e não há nada de relevante, "
                    + "\nalém de noticias de fontes duvidosas, uma notificação de um vídeo do João Carvalho e "
                    + "\numa mensagem de Luciano com dois emojis, uma porta e dois olhinhos. \r\n"
                    + "\nDesligo meu celular e sigo em direção a cozinha me perguntando se me sonho poderia ter "
                    + "\nalgum significado e se eu deveria falar para alguém o que vi , porém ,tive meus pensamentos "
                    + "\ninterrompidos pelo sorriso de Luciano que, sentado na mesa de minha cozinha dizia algo sobre o 'incomparável sabor da tapioca da tia', sigo a diante e falo: ");
            try {
                Thread.sleep(1000);
            } catch (Exception erro) {
            }

            System.out.println("\n1- 'A vida agora é um morango para você estar entrando na minha casa e comendo da  minha comida de forma tão simples?'"
                    + "\n2- 'Isso é porque você não provou o cuscuz com leite que ela prepara em comemorações especiais.'");
            decisao = ler.nextInt();

            if (decisao == 1) {
                System.out.println("Luciano olha para mim fazendo uma expressão exagerada de espanto, em seguida concorda com a cabeça e diz "
                        + "\n'você sabe que sempre foi assim, já que aqui é minha segunda casa' enquanto se levanta comendo uma tapioca que, "
                        + "\naparentemente era de coco ralado. Sigo seus passos enquanto ele se direciona para o curral, onde ele iria pegar ,"
                        + "\ncomo sempre, duas garrafas de leite . \n"
                        + "\nQuase toda manhã ,desde que nos conhecemos em 2018 no fundamental || , tínhamos essa mesma rotina, eu acordava,"
                        + "\ntomava café e recebia o valor das garrafas de leite compradas por Luciano. \n"
                        + "\nSempre fui um garoto retraído ,mas com ele eu sempre me sentia minimamente livre da minha vergonha."
                        + "\nApós conversamos durante um tempo e atualizar um ao outro sobre a faculdade e o trabalho nos despedimos e digo: "
                        + "\nLuciano, sei que é bobagem mas toma cuidado hoje quando tu for voltar do trabalho, tive um sonho onde você parecia ter sido sequestrado, tenho medo que algo possa vir a conhecer. Ah e se der aparece aqui mais tarde para a festa de painho!!");

                try {
                    Thread.sleep(1000);
                } catch (Exception erro) {
                }

            }

            if (decisao == 2) {
                System.out.println("Luciano olha para mim e diz 'na verdade já provei inúmeras vezes, principalmente quando "
                        + "\n‘cê tava no seu cursinho ou quando é aniversário de algum parente seu' ,enquanto se levanta, dou um soquinho em seu ombro esquerdo e sigo seus passos enquanto ele se direciona para o curral, onde iria pegar ,como sempre, duas garrafas de leite ."
                        + "\nQuase toda manhã ,desde que nos conhecemos em 2018, tínhamos essa mesma rotina, eu acordava, tomava café e recebia o valor das garrafas de leite compradas por Luciano. "
                        + "\nSempre fui um garoto retraído ,mas com ele eu sempre me sentia minimamente livre da minha vergonha. "
                        + "\nApós conversamos durante um tempo e atualizar um ao outro sobre a faculdade e o trabalho nos despedimos e digo: Luciano, sei que é bobagem mas toma cuidado hoje quando tu for voltar do trabalho, tive um sonho onde você parecia ter sido sequestrado, tenho medo que algo possa vir a conhecer. Ah e se der aparece aqui mais tarde para a festa de painho."
                        + "\nLuciano sorri para mim e diz que ao final de seu expediente na padaria iria vir.\n"
                );
                try {
                    Thread.sleep(1000);
                } catch (Exception erro) {
                }

                System.out.println("1- * Seguir em direção ao bar para iniciar o trabalho *");
                decisao = ler.nextInt();

                if (decisao == 1) {
                    System.out.println("\nObservo ele abrir a porteira, pegar sua bicicleta vermelha e sumir ao horizonte ,"
                            + "\nem seguida vou em direção ao bar, já que, embora eu esteja repleto de atividades da faculdade para fazer, "
                            + "\nainda tenho que auxiliar meu pai na organização, manutenção e limpeza do seu comércio . \n"
                            + "\nA minha frente observo o caus deixado pelos fregueses na noite anterior. Há garrafas de pitú espalhadas "
                            + "\npor todo o chão, mesas caídas, um cheiro insuportável vindo do banheiro e peças de dominó jogas pelos quatro "
                            + "\ncantos do espaço. Assim inicio a organização pelo (a): ");

                    System.out.println("\n1- * limpeza do banheiro  *"
                            + "\n2- * coleta das garrafas de pitú *"
                            + "\n3 - * organização das mesas *"
                            + "\n4- * coleta das inúmeras peças de dominó *  ");
                    decisao = ler.nextInt();

                    if (decisao == 1) {

                    }
                    if (decisao == 2) {

                    }
                    if (decisao == 3) {

                    }
                    if (decisao == 4) {

                    }
                }

            }

        }

        //Batalha
        batalha(nome);

        System.out.println("==================================");
        System.out.println("=========== ENCERRADO ============");
        System.out.println("==================================");
        System.out.println("\n\n");
        Main retornaInicio = new Main();
        retornaInicio.main(args);

    }

}
