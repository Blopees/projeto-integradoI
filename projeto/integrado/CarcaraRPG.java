package projeto.integrado;

import java.util.Scanner;

public class CarcaraRPG {

    public static void limparTela() {
        for (int cont = 0; cont < 50; cont++) {
            System.out.println("");
        }
    }

    public static int decisaoAmanhancer(Scanner ler, int decisao) {
        if (decisao == 1) {

            System.out.println("\nSigo em direção a cozinha me perguntando se me sonho "
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
            limparTela();

        }

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
            limparTela();
        }

        return decisao;
    }

    public static int decisaoCafedaManha(Scanner ler, int decisao) {

        if (decisao == 1) {
            System.out.println("\nLuciano olha para mim fazendo uma expressão exagerada de espanto, em seguida concorda com a cabeça e diz "
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
        limparTela();
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

        }

        System.out.println("1- * Seguir em direção ao bar para iniciar o trabalho *");
        decisao = ler.nextInt();

        return decisao;

    }

    public static int iraoBar(Scanner ler, int decisao) {

        if (decisao == 1) {
            System.out.println("\nObservo ele abrir a porteira, pegar sua bicicleta vermelha "
                    + "\ne sumir ao horizonte ,em seguida vou em direção ao bar, já que, embora "
                    + "\neu esteja repleto de atividades da faculdade para fazer, ainda tenho "
                    + "\nque auxiliar meu pai na organização, manutenção e limpeza do seu comércio ."
                    + "\nA minha frente observo o caus deixado pelos fregueses na noite anterior. Há garrafas "
                    + "\nde pitú espalhadas por todo o chão, mesas caídas, um cheiro insuportável vindo do banheiro "
                    + "e peças de dominó jogas pelos quatro cantos do espaço. Assim inicio a organização pelo(a)");
            System.out.println("1- * limpeza do banheiro  *"
                    + "\n2- * coleta das garrafas de pitú  *"
                    + "\n3- * organização das mesas  *"
                    + "\n4- * coleta das inúmeras peças de dominó  *");
            decisao = ler.nextInt();
        }
        limparTela();
        if (decisao == 1) {
            System.out.println("\nSigo em direção ao banheiro, e observo por alguns segundos a "
                    + "\nimagem repugnante das duas únicas cabines que temos. Tudo está coberto "
                    + "\nde vestígios de vômito, restos de bebidas desconhecidas e até mesmo "
                    + "\nalgumas gotas de sangue. "
                    + "\nEm seguida, parto para o trabalho o mais rápido que posso e limpo ambos "
                    + "\nos banheiros. Ao final sigo em direção ás mesas finalizando a organização "
                    + "\ndo bar.Tudo estava pronto para que o trabalho duro começasse.");
        } else if (decisao == 2) {
            System.out.println("\nSigo em direção ao local onde há mais garrafas acumuladas, as coleto "
                    + "\ne coloco todas em nossa caçamba de coleta. "
                    + "\nEm seguida, parto para fazer as próximas tarefas, limpando o banheiro, coletando "
                    + "os dominós e organizando as mesas."
                    + "\nTudo estava pronto para que o trabalho duro começasse. ");
        } else if (decisao == 3) {
            System.out.println("\nSigo em direção as mesas próximas aos quadros a minha frente, levando uma por "
                    + "\numa e as limpo com uma flanela que sempre deixamos em baixo do balcão."
                    + "\nEm seguida, parto para fazer as próximas tarefas, limpando o banheiro, coletando os dominós "
                    + "e coletando as garrafas de pitú. "
                    + "\nTudo estava pronto para que o trabalho duro começasse.");

        } else if (decisao == 4) {
            System.out.println("\nOlho para baixo e coleto as peças de plástico, de madeira e marfim, colocando cada "
                    + "\nqual em suas respectivas caixas."
                    + "\nEm seguida ,parto para fazer as próximas tarefas, limpando o banheiro, coletando as garrafas "
                    + "de pitú e organizando as mesas. "
                    + "\nTudo estava pronto para que o trabalho duro começasse.");
        }

        System.out.println("\n1 - *abrir os portões do bar *");
        decisao = ler.nextInt();
        limparTela();
        return decisao;

    }

    public static int lidarcomClientes(Scanner ler, int decisao) {

        if (decisao == 1) {
            System.out.println("\nApós alguns minutos tentando abrir os portões, finalizando a "
                    + "\norganização e varrendo a calçada o dia de fato tinha se iniciado e ,em "
                    + "\npouquíssimo tempo, após me alocar no balcão avisto os mesmos clientes de "
                    + "\nsempre, pessoas que sempre bebiam das 09:00 da manhã até as 14:00 da tarde, "
                    + "\no velho Tonho Luiz, a Dona Terezinha e o Sr. Sandoval Moita que se aproximavam "
                    + "\ndançando e cantando algum single da banda Calcinha Preta."
                    + " \nEssas pessoas, embora fossem um lucro garantido, eram o motivo do meu cansaço matinal, "
                    + "\njá que causavam  confusão com os outros clientes e principalmente com meu pai, que já não "
                    + "\naguentava mais ouvir a voz de três idosos bêbados todos os dias pela manhã ... ");

            System.out.println("\n1- 'Vocês se orgulham de serem esses cachaceiros vergonhosos?'"
                    + "\n2- * pegar as bebidas que eles sempre escolhem e entregar de antemão *"
                    + "\n3- * esperar eles falarem algo *");
            decisao = ler.nextInt();

        }

        if (decisao == 1) {

            System.out.println("\nTonhão ,parecendo já estar bêbado ,diz cambaleando:"
                    + "“ \nSibito Sibito, teria como você ,por gentileza calar a sua boca? em "
                    + "\nplena nove da manhã você reclamando e resmungando garoto, poxa!! temos "
                    + "\nsede e você tem a cachaça, desce logo três copos , uma garrafa de 600 ml "
                    + "de pitú e um limãozinho para a gente !!"
                    + "\nTerezinha e Sandoval riam ,acenavam com a cabeça e continuaram cantando singles "
                    + "de alguma outra banda de forró."
                    + "\nEm seguida levo as bebidas para eles sem dizer nada e ignoro aquela cena deprimente "
                    + "\nde três cidadãos desnorteados se afundando em copos americanos de bebidas alcoólicas. "
                    + "\nDali em diante ,embora lento ,o dia se desenrolou de uma forma um pouco mais divertida "
                    + "\nque o normal. Por conta do aniversário de meu pai inúmeras pessoas vinheram  de todos "
                    + "\nos municípios vizinhos, desde amigos de infância dos meus pai até parentes distantes."
                    + "\nO tempo passou e o bar seguiu como sempre até o anoitecer, onde   boa parte dos convidados "
                    + "\njá haviam chegado e se acomodado para o aniversário de meu pai. "
                    + "\nO clima era sereno, as risadas ecoavam por todo o bar, o som alto podia ser ouvido a quadras "
                    + "\ndali e meu pai se mantinha na churrasqueira preparando espetinhos para todos.");

        }

        if (decisao == 2) {
            System.out.println("\nVou até a geladeira , pego uma garrafa de pitú 600 ml, corto um limão e separo três "
                    + "\ncopos americanos e espero os três escolherem uma mesa e me chamarem."
                    + "\nApós isso espero alguns longos minutos até finalmente Tereza me chamar pedindo o de sempre:"
                    + "\n'Querido, traga logo três copinhos para eu e meus compadres!! Você já sabe o que queremos.'"
                    + "\nEm seguida levo as bebidas para eles sem dizer nada."
                    + "\nDali em diante ,embora lento ,o dia se desenrolou de uma forma um pouco mais divertida que o normal. "
                    + "\nPor conta do aniversário de meu pai inúmeras pessoas vinheram  de todos os municípios vizinhos, desde "
                    + "\namigos de infância dos meus pai até parentes distantes."
                    + "\nO tempo passou e o bar seguiu como sempre até o anoitecer, onde   boa parte dos convidados já haviam "
                    + "\nchegado e se acomodado para o aniversário de meu pai. O clima era sereno, as risadas ecoavam por todo o bar, "
                    + "\no som alto podia ser ouvido a quadras dali e meu pai se mantinha na churrasqueira preparando espetinhos para todos.");
        }

        if (decisao == 3) {
            System.out.println("\nTodos entram tropeçando nas escadas quase em sincronia."
                    + "\nTerezinha, que assim como os outros já estar bêbada, tira Tonhão para "
                    + "\ndançar uma música animada que apenas os dois parecem ouvir, enquanto "
                    + "\nSandoval vem até o balcão e pede as bebidas de sempre."
                    + "\nVou até a geladeira , pego uma garrafa de pitú 600 ml, corto um limão e "
                    + "\nseparo três copos americanos. Em seguida levo as bebidas para eles sem dizer nada."
                    + "\nDali em diante ,embora lento ,o dia se desenrolou de uma forma um pouco mais divertida "
                    + "\nque o normal. Por conta do aniversário de meu pai inúmeras pessoas vinheram  de todos "
                    + "\nos municípios vizinhos, desde amigos de infância dos meus pai até parentes distantes."
                    + "\nO tempo passou e o bar seguiu como sempre até o anoitecer, onde   boa parte dos convidados "
                    + "\njá haviam chegado e se acomodado para o aniversário de meu pai. O clima era sereno, as risadas "
                    + "\necoavam por todo o bar, o som alto podia ser ouvido a quadras dali e meu pai se mantinha na "
                    + "\nchurrasqueira preparando espetinhos para todos.");
        }

        System.out.println("\n1 - *ir falar com meu pai *");
        decisao = ler.nextInt();
        limparTela();
        return decisao;
    }

    public static int interagirPai(Scanner ler, int decisao) {
        if (decisao == 1) {
            System.out.println("\nApós cumprimentar alguns parentes e conhecidos sigo em direção ao meu pai e pergunto:");
            System.out.println("\n1- 'Painho quer ajuda?'"
                    + "\n2- 'Por que essas festas que fazemos sempre são tão barulhentas painho?'");
            decisao = ler.nextInt();
        }

        if (decisao == 1) {
            System.out.println("\nMeu pai, que parece já está exausto do seu dia de trabalho "
                    + "\ne de ficar tão próximo a churrasqueira vira-se e diz, me abraçando fortemente:"
                    + "\n'Oh meu filho, não se preocupe, painho se vira aqui! Hoje é dia de aproveitar, beber,"
                    + "\ndançar e cair no chão de tanto tomar cachaça. Não precisa se preocupar que daqui até "
                    + "\nmeia noite eu paro de fazer esse tanto de coisa. "
                    + "\nAgora, já que você provavelmente terminou suas obrigações vá buscar a buchada de bode "
                    + "\ne o sarapatel na casa de sua tia Luzia que daqui mais ou menos uma hora vamos bater meus parabéns.'");

        }

        if (decisao == 2) {
            System.out.println("\nObservando meu pai, percebo que seus olhos estão terrivelmente cansados, suas "
                    + "\nroupas estão completamente encardidas por conta do trabalho e sua boca está descomunalmente ressecada. "
                    + "\nEle diz: Oh meu filho, sei que é cansativo, painho também não gosta muito dessas festas, mas sua mãe adora, "
                    + "\ne como não consigo dizer ‘não’ para ela, ‘cê sabe  então sempre acabo aceitando."
                    + "\nAgora, já que você provavelmente terminou suas obrigações vá buscar a buchada de bode "
                    + "\ne o sarapatel na casa de sua tia Luzia que daqui mais ou menos uma hora vamos bater parabéns.");

        }

        System.out.println("\n1 - * ir para casa da tia Luzia * ");
        decisao = ler.nextInt();

        if (decisao == 1) {
            System.out.println("\nEsboço um sorriso amarelo para meu pai, ligo a lanterna de meu celular  "
                    + "\ne me direciono para a estrada de terra que há em frente ao nosso bar. Respiro fundo e "
                    + "\nvou em frente com medo da escuridão da noite e da solidão que me domina ao me distanciar "
                    + "\nde casa.Logo a frente, mesmo estando a mais de seis minutos de distância da minha casa ainda"
                    + "\nescuto as músicas que tocam na festa de meu pai, fator que mesmo me deixando incrédulo ainda "
                    + "\nme faz lembrar da época do fundamental, onde eu e Luciano ainda estudávamos juntos e nos "
                    + "\ndivertíamos correndo pela madrugada em busca de tanajuras enquanto festas inesquecíveis aconteciam "
                    + "\nna minha casa.Enfim, chego à porteira da casa de minha tia Luzia, que de imediato, ao me ver na entrada"
                    + "\n,trás a forma com a buchada, que parecia estar completa e devidamente recheada. Ao me entregar a mais "
                    + "\nfarta refeição que minha família teria aquela noite, minha tia diz para eu ir logo para minha casa que "
                    + "\nem breve ela iria para a festa de meu pai e levaria o sarapatel.");
            System.out.println("\n1- * Voltar para casa * ");
            decisao = ler.nextInt();

            if (decisao == 1) {
                System.out.println("\nO clima mantinha-se calmo, sereno e pacifico. Porém voltar por aquele caminho "
                        + "\nsozinho me gerava uma imensa ansiedade, não só pela solidão mas principalmente por causa "
                        + "\nde um certo homem que morava próximo a minha casa e de minha tia. Belial, conhecido como  "
                        + "\nGalego, Italiano ou como o próprio tinhoso .Porém creio que isso não seja um tema "
                        + "\nrelevante a ser mencionado, por hora..."
                        + "\n"
                        + "\nLigo a lanterna de meu celular para iluminar melhor a estrada e em minutos estou em minha casa ...");
                System.out.println("\n1- * pré aquecer a buchada * ");
                decisao = ler.nextInt();

                System.out.println("\nColoco a buchada para pré-aquecer e em seguida ajudo minha mãe a servir cachorros "
                        + "\nquentes para as crianças, churrasco para os adultos e doces para os mais velhos."
                        + "\nEnquanto ando por entre o espaço do bar e de nossa casa olho para o celular inúmeras vezes "
                        + "\ncom a esperança de receber uma mensagem do Luciano dizendo que viria aproveitar comigo e minha "
                        + "\nfamília, porém as mensagens permanecem não visualizadas."
                        + "\nMesmo assim prossigo auxiliando a todos no lugar e por volta das 22:00 percebo que boa parte "
                        + "\ndos meus tios, primos e conhecidos já estão bêbados e reclamando incessantemente do governo atual "
                        + "\ndo país enquanto minhas tias e conhecidas permanecem jogando sinuca ao mesmo tempo que reclamam "
                        + "\nde seus maridos."
                        + "\nOlho todo aquele ambiente e me pego sorrindo enquanto penso em como todos estão verdadeiramente"
                        + "\nfelizes entre si, incluindo eu que mesmo tendo passado por uma fase pesada com a minha depressão "
                        + "\npós morte da minha vó estava contente (principalmente graças a Luciano)."
                        + "\n Em súbito, tenho meus pensamentos e observações interrompidas, um homem de mais ou menos 1,90 de "
                        + "\naltura, roupas de couro, cheiro forte de mato, mais ou menos 45 anos de idade e chapéu de vaqueiro "
                        + "\nentra pela porta principal do bar de meu pai enquanto cumprimenta a todos com alegria, aquele era Belial, "
                        + "\no cidadão que me gera calafrios desde quando era criança...");
                System.out.println("\n1-* Aproximar-se de Belial para saber o que ele estava conversando com seus conhecidos *"
                        + "\n2-* Conferir se precisam de ajuda na cozinha * ");
                decisao = ler.nextInt();
            }

        }
        limparTela();
        return decisao;
    }

    public static int introducaoVilao(Scanner ler, int decisao) {

        if (decisao == 1) {
            System.out.println("\nDecido então fuxicar o que aquele selvagem estava fazendo na festa do meu pai"
                    + "\ne me aproximo disfarçadamente, quando inesperadamente Belial me chama com uma alegria forçada."
                    + "\nMinha ansiedade me toma rapidamente porém vou até ele e falo, tentando sobressair o volume da música do ambiente :"
                    + "\n“Boa noite Galego, tudo bem? Gostaria de alguma coisa para comer?”."
                    + "\nBelial que me observava fixamente desde o primeiro momento que me viu diz olhando nos meus olhos:"
                    + "\n“Boa noite Sibito!! Eu ‘tô bem de mais rapaz, e você parece estar genuinamente"
                    + "\nmelhor do que anos atrás em? Saiu da fase adolescente deprimido, foi?”"
                    + "\nEsboço uma falsa alegria e digo que felizmente estou sim bem melhor do que"
                    + "\ntempos atrás, segundos depois Belial, que já estava muito próximo de mim toca em"
                    + "\nmeu ombro direito enquanto me leva para a parte da frente do bar ."
                    + "\nTento recuar porém sinto meu braço sendo apertado pelas suas grandes mãos e, em"
                    + "\nchoque, deixo com que ele me direcione de uma vez para o lado de fora."
                    + "\nJá chegando lá Belial diz: “Você realmente está diferente João, está mais fortinho, mais corado, menos"
                    + "\ndesanimado. Eu vi como você sorria para todos enquanto cumprimentava os"
                    + "\nconvidados recém chegados, menos para mim... ” Um silencio se estabelece e tenho a sensação de estar em uma sala vazia e escura."
                    + "\nEu definitivamente não sabia o que Belial queria comigo e porque tentava criar um"
                    + "\nambiente pacifico comigo mesmo sabendo que sempre o odiei."
                    + "\nO silencio é rompido, ele vai em minha direção, me entrega uma carta minúscula ,"
                    + "\nele vira-se e o ouço falar de costas para mim:"
                    + "\n“Nunca entendi seu desgosto por mim Sibito, sempre fui tão educado com a sua"
                    + "\npessoa, sempre reconheci seus esforços para ajudar todos do município."
                    + "\nSinceramente não me importo se tu tem medo de mim, só queria te falar para"
                    + "\nlembrar dessa noite e se preparar para os próximos dias. Não sinta medo, vai ficar tudo bem. Só tome cuidado, viu?");

            System.out.println("\n1- *sair daquela situação");
            decisao = ler.nextInt();
            if (decisao == 1) {
                System.out.println("    \nCom muito esforço saí dali, com meu coração batendo de uma forma desenfreada. Tento com esforço processar"
                        + "\no que acabará de ouvir, porém o medo daquele homem já havia consumido minha mente ."
                        + "\nSigo em passos largos até a cozinha para beber um copo d’água, tento respirar fundo e coloco em prática métodos"
                        + "\nde controle de ansiedade que outrora Luciano me ensinou.Em minutos consigo me recompor e ouço entre ruídos meu pai me "
                        + "\nchamando para o parabéns, então sinalizo um  ‘Ok/joinha’ afirmando entre linhas que iria em segundos.  "
                        + "\nA festa foi muito boa, batemos parabéns e pelo resto da noite não vi mais Belial, o que me fez aproveitar melhor o dia "
                        + "\ndo meu pai e os meus últimos momentos de alegria sincera antes de me introduzir no inferno que seriam os próximos meses.");

            }

        }

        if (decisao == 2) {
            System.out.println("\nDecido então sair dali e para ver se minha precisava de ajuda com os"
                    + "\npreparativos para os parabéns, quando inesperadamente Belial me chama com uma alegria forçada."
                    + "Minha ansiedade me toma rapidamente porém vou até ele e falo, tentando sobressair o volume da música do ambiente :"
                    + "“Boa noite Galego, tudo bem? Gostaria de alguma coisa para comer?”."
                    + "Belial que me observava fixamente desde o primeiro momento que me viu diz  olhando nos meus olhos:"
                    + "“Boa noite Sibito!! Eu ‘tô bem de mais rapaz, e você parece estar genuinamente"
                    + "melhor do que anos atrás em? Saiu da fase adolescente deprimido, foi?”"
                    + "Esboço uma falsa alegria e digo que felizmente estou sim bem melhor do que"
                    + "tempos atrás, segundos depois Belial, que já estava muito próximo de mim toca em"
                    + "meu ombro direito enquanto me leva para a parte da frente do bar ."
                    + "Tento recuar porém sinto meu braço sendo apertado pelas suas grandes mãos e, em"
                    + "choque, deixo com que ele me direcione de uma vez para o lado de fora."
                    + "Já chegando lá Belial diz:\r\n"
                    + "“Você realmente está diferente João, está mais fortinho, mais corado, menos"
                    + "desanimado. Eu vi como você sorria para todos enquanto cumprimentava os"
                    + "convidados recém chegados, menos para mim... ”"
                    + "Um silencio se estabelece e tenho a sensação de estar em uma sala vazia e escura."
                    + "Eu definitivamente não sabia o que Belial queria comigo e porque tentava criar um"
                    + "ambiente pacifico comigo mesmo sabendo que sempre o odiei."
                    + "O silencio é rompido, ele vai em minha direção, me entrega uma carta minúscula ,"
                    + "ele vira-se e o ouço falar de costas para mim:"
                    + "“Nunca entendi seu desgosto por mim Sibito, sempre fui tão educado com a sua"
                    + "pessoa, sempre reconheci seus esforços para ajudar todos do município."
                    + "Sinceramente não me importo se tu tem medo de mim, só queria te falar para"
                    + "lembrar dessa noite e se preparar para os próximos dias. Não sinta medo, vai ficar"
                    + "tudo bem. Só tome cuidado, viu?”");
            System.out.println("\n1- *sair daquela situação");
            decisao = ler.nextInt();
            if (decisao == 1) {
                System.out.println("    \nCom muito esforço saí dali, com meu coração batendo de uma forma desenfreada. Tento com esforço processar"
                        + "\no que acabará de ouvir, porém o medo daquele homem já havia consumido minha mente ."
                        + "\nSigo em passos largos até a cozinha para beber um copo d’água, tento respirar fundo e coloco em prática métodos"
                        + "\nde controle de ansiedade que outrora Luciano me ensinou.Em minutos consigo me recompor e ouço entre ruídos meu pai me "
                        + "\nchamando para o parabéns, então sinalizo um  ‘Ok/joinha’ afirmando entre linhas que iria em segundos.  "
                        + "\nA festa foi muito boa, batemos parabéns e pelo resto da noite não vi mais Belial, o que me fez aproveitar melhor o dia "
                        + "\ndo meu pai e os meus últimos momentos de alegria sincera antes de me introduzir no inferno que seriam os próximos meses.");
            }

        }

        System.out.println("\n1 - *  Iniciar Carcará – Mês 1 *");
        decisao = ler.nextInt();
        limparTela();
        return decisao;

    }

    public static int mesUm(Scanner ler, int decisao) {
        if (decisao == 1) {
            System.out.println("\nAcordo na manhã seguinte da festa"
                    + "com meu pai me chamando desesperadamente ...");
            System.out.println("\n1- ' Bom dia pai, calma !! já acordei... '"
                    + "\n2- 'Em pleno final de semana me acordando essas horas painho?'");
            decisao = ler.nextInt();

            if (decisao == 1 || decisao == 2) {
                System.out.println("\nMeu pai, que evidentemente estava atordoado com algo diz quase gritando:"
                        + "\n“João pelo amor de Deus, sabe Everton? Filho de Zé de Carneiro? Que mora na estrada perto do posto?"
                        + "\nELE tá morto João! O corpo dele foi encontrado na praça em frente ao mercado de Luciano hoje de manhã."
                        + "\nEu não acredito que ele está morto, preciso vê isso com meus próprios olhos, eu não posso ter perdido um amigo tão antigo”."
                        + "\nConfuso levanto-me da cama e digo sem pensar muito bem:");
                System.out.println("\n1- 'Vamos para o posto painho, vou pegar a sua moto...'");
                decisao = ler.nextInt();

                if (decisao == 1) {
                    System.out.println("\nTroco de roupa, pego meu celular e rapidamente direciono meu pai à garagem que temos próximo ao curral das vacas."
                            + "\nSubimos, acelero o mais rápido possível e em minutos chegamos no Posto Alto da Serra, onde podia-se ver  mais de cem pessoas amontoadas"
                            + "\npara ver o corpo, enquanto inúmeras outras mantinham-se distantes conversando entre si."
                            + "\nMeu pai, que veio o caminho todo em prantos desce da garupa da moto sem eu sequer ter parado e corre em direção a multidão, empurrando"
                            + "\nqualquer um que estivesse na sua frente.");
                    System.out.println("\n1- * guardar a moto e perguntar para alguém se há  detalhes do que aconteceu com Everton *");
                    decisao = ler.nextInt();

                    if (decisao == 1) {
                        System.out.println("\nDesço da moto e a guardo em frente ao mercado de Luciano, onde eu geralmente a deixava. Então corro até um grupo de idosos que conversavam com um policial e digo:"
                                + "\n'Bom dia, alguém sabe o que aconteceu com Everton? Se há testemunhas? Pelo que parece meu pai era muito amigo do falecido!'..."
                                + "\nDesconfiado de que eu fosse apenas um fofoqueiro um dos idosos diz com um certo receio: Apenas uma pessoa parece ter visto ao vivo o que aconteceu,"
                                + "\nera um velho senhor que deu as descrições de um homem estranho deixando o corpo estirado na praça de madrugada. Até agora não vimos essa testemunha"
                                + "\nde novo mas..."
                                + "\nSomos interrompidos por um grito, era meu pai .Corro e imediatamente chego próximo a ele...");
                        System.out.println("\n1- * observar * ");
                        decisao = ler.nextInt();

                        if (decisao == 1) {
                            System.out.println("\nMeu pai, que já parecia ser uma pessoa completamente diferente de antes agora estava de joelhos, com o rosto totalmente vermelho e "
                                    + "\npupila contraída. A nossa frente víamos o que seria os restos de Everton. Sua cabeça estava cortada, os olhos haviam sido arrancados, seu cabelo havia"
                                    + "\nsido rapado e os dentes estavam totalmente dilacerados.Seus braços pareciam ter sido cortados com algum tipo de cerra porém mantinham-se no corpo, seu"
                                    + "\ntroco estava oco e dentro não via-se nada além de suas costelas que outrora foram abertas ferozmente, provavelmente com algum objeto cortante de tamanho"
                                    + "\nconsideravelmente grande. Suas pernas, que também mantinham-se no corpo estavam sem a pele, podia-se ver apenas a carne exposta junto ás moscas."
                                    + "\nAo lado via-se também o que parecia ser suas partes intimas próximas a um rastro de sangue que seguia-se até o corpo."
                                    + "\nObservo tudo aquilo completamente estático e em um súbito ouço meu pai começar a gritar desesperadamente e a chorar. Assim como foi na morte na minha vó "
                                    + "\n,porém agora a dor vinha carregada de desespero e confusão mental."
                                    + "\nApós alguns minutos, todos que antes falavam do corpo agora mantinham-se em silencio enquanto observavam meu ai chorando."
                                    + "\nOlho para os lados tentando encontrar alguém que nos ajude a entender um pouco sobre o que estava acontecendo quando e repentinamente vejo chegando a nossa "
                                    + "\nfrente o prefeito, não do nosso município, mas do município vizinho. Aquele era José Alexandre...");
                            System.out.println("\n1- * Ver se Alexandre irá fazer algo* ");
                            decisao = ler.nextInt();

                            if (decisao == 1) {
                                System.out.println("\nJosé, que claramente estava enojado com a situação diz: 'A todos aqui presentes podem ir embora"
                                        + "\n,fique apenas o que conhecem a vitima. Iremos levar o corpo para analise policial.'"
                                        + "\nEm seguida Alexandre, que evita a todo custo olhar par o corpo nos acalma entregando "
                                        + "\numa garrafa de agua que estava em sua mochila. Minutos depois somos levados por uma"
                                        + "\nambulância e enquanto tento acalmar meu pai envio mensagens para Luciano, que não me"
                                        + "\nresponde desde a manhã passa.");
                                System.out.println("\n1-*prosseguir*");
                                decisao = ler.nextInt();
                                //aqui
                                if (decisao == 1) {
                                    System.out.println("\nVamos até o hospital e o corpo é levado para alguma sala desconhecida,"
                                            + "\nprovavelmente para se analisado. Nesse processo ajudo meu pai a se acalmar, falo para "
                                            + "\nAlexandre que meu pai era um amigo de Everton e que precisávamos ir embora, para tentar processar a situação."
                                            + "\nJosé, que desde o inicio nos acompanhou disse que poderíamos ir embora e que assim que possível iria nos procurar "
                                            + "\npara nos atualizar sobre a situação, então passei nosso endereço e voltamos para o Posto em um uber pago pelo"
                                            + "\npróprio José... tudo a partir daquele dia seria um Caos");
                                    System.out.println("\n1-*Concluir o primeiro mês*");
                                    decisao = ler.nextInt();

                                }

                            }

                        }
                    }
                }
            }
        }
        limparTela();
        return decisao;

    }

    public static int mesTres(Scanner ler, int decisao) {

        if (decisao == 1) {
            System.out.println("\nDias depois, enquanto olhava para o teto após o enterro de Everton percebo que o cenário não tinha melhorado ou iria melhorar. "
                    + "\nTanto pela dor do luto do meu pai, quanto pela angústia de todos que eram próximos do falecido."
                    + "\nAlém disso Luciano também não aparecia na minha casa pelas manhãs desde o dia do aniversário de meu pai assim como não respondia nenhuma das minhas "
                    + "\nmensagens, o que já estava me deixando ansioso e extremamente preocupado."
                    + "\nRepentinamente, em minha cama ouço alguém me chamando na porta da minha casa..."
                    + "\nEra os pais de Luciano, que diziam não o ver a dias, e que ele não atendia as ligações de forma alguma."
                    + "\nEntrei em estado de choque e imediatamente corri para para a delegacia de Paranatama."
                    + "\nA partir dai minha vida se tornou um poço sem fundo, meu melhor amigo estava desaparecido, meu pai estava em um estado preocupante de depressão e eu "
                    + "\nestava ficando cada vez mais em pânico a cada dia que passava..."
                    + "\nMesmo assim me esforcei para tentar ajudar as autoridades a acharem meu amigo. Porém nesse mês eu estava começando a desconfiar de quem poderia ser o responsável"
                    + "\npela desistabilação de Paranatama."
                    + "\nBelial."
                    + "\nDigo isso não pelo medo que sentia dele, mas pela forma que ele mudou desde o dia que toda essa bagunça se iniciou."
                    + "\nBelial começou  a frequentar constantemente nosso bar e sempre comentava sobre o caso Everton e como ele sentia a dor domeu pai."
                    + "\nAquele homem me causava uma ansiedade descomunal e perceber que tudo aquilo o deixava confortável e nem um pouco preocupado me fazia desconfiar cada"
                    + "\nvez mais dele."
                    + "\nSei que isso tudo parece exagero mas o lugar onde eu nasci sempre foi muito pacifico e a unica pessoa que causava medo e bagunça ali era Belial, que"
                    + "\ndesde criança era conhecido por causar discórdia entre as pessoas da região..."
                    + "\nNesse mesmo mês eu permanecia trabalhando no bar, tudo estava diferente, as pessoas ,mesmo aqueles que bebiam e se divertiam todos os dias ,não eram mais as mesmas"
                    + "\ne um municipio antes festeiro agora era triste e desesperançoso."
                    + "\nDiante desse cenário, acordo em uma manhã do final do mês com meu pai dizendo que mais uma pessoa foi encontrada morta, dessa vez era Antonio um dos nosso clientes"
                    + "\nmais fiéis e sua filha de 8 anos de idade."
                    + "\nOs corpos foram encontrados na estrada de um municipio próximo ao nosso, ambos estavam sem globos oculares, as pontas dos dedos cerradas e ambosas tinham"
                    + "\nmarcas de cordas no pescoço."
                    + "\nEssa noticia foi um choque para todos, Tonhão era parte da alegria de todos do municipio, mas mesmo assim Belial, que no dia do anunciamento da morte dos dois citados anteriormente,"
                    + "\nmantinha-se com sua sadacidade."
                    + "\nBelial tinha maldade em seu olhar, e a cada dia que passava ve-lo diante de mim no bar estava me fazendo cada vez mais mal."
                    + "\nO mês dois acabou com a minha decisão de buscar provas que Belial é o culpado...");
            System.out.println("\n1-*Carcará mês três*");
            decisao = ler.nextInt();
            limparTela();
            if (decisao == 1) {
                System.out.println("\nChegando no mês três..."
                        + "\nAcordo em uma manhã repensando e tentando lembrar do dia em que Luciano foi visto pela última vez"
                        + "\nPensava incesantemente* se ele havia comentado que gostaria de passar um tempo sozinho ou se ao menos estava triste..."
                        + "\nPorém no final das contas nada vinha em minha mente, eu definitivamente precisava ir atrás do miserável que raptou meu amigo..."
                        + "\nentão levanto-me da cama e vou de novo a delegacia para ver o andamento da investigação, porém quando chego lá vejo  uma cena "
                        + "\ncuriosa. O nosso prefeito estava conversando em um canto reservado com Belial, e Laerci, nosso prefeito, parecia desesperado, quase caído em lágrimas..."
                        + "\nDecido então voltar para casa para conversar com meu pai sobre minhas desconfianças, que por sua vez não só conta que também tem medo do que Belial pode estar fazendo"
                        + "\ncomo também desconfia que ele pode estar aliado ao nosso prefeito, que era uma pessoas próxima a primeira vitima do assassino."
                        + "\nMeu pai ainda estava mal pela morte de Everton, é como se ele realmente tivesse sido dilasserado por dentro... "
                        + "\n..."
                        + "\nNaquela mesma semana vou de noite para a casa de Belial bsucar provas, sei que ele trabalha das 09:00 às 20:00 então"
                        + "\npor volta das 19:00 sigo direto para um quartinho de trás da casa dele, lá observo atentamente se há alguma entrada para um porão"
                        + "\nou se haviam vestigios de que ali houve mortes..."
                        + "\nOlho com atenção cada detalhe, porém quando percebo um som vindo da parte de baixo dos meus pés sinto uma mão pesada tocando meu ombro esquerdo"
                        + "\nera Belial, que sorria tanquilamente vendo meu rosto assustado..."
                        + "\npor sorte meu pai apareceu e me salvou daquela situação assustadora. Voltamos para casa com ele brigando comigo o caminho todo, porém eu já tinha em maõs "
                        + "\na certeza de que Belial escondia alguém em sua casa..."
                        + "\nEu TINHA que fazer algo, então nos próximos dias guardei por conta própria provas que ele era o real assassino. E,além disso pedi ajuda para uma autoridade"
                        + "\nconfiável, Alexandre o prefeito do municipio próximo ao nosso, que definitivamente iria me ajudar a prender Belial."
                        + "\nAos poucos eu desenvolvi a certeza que as autoridades da região não estavam fazendo nada para acalmar a população, então eu realmente precisava de Alexandre."
                        + "\nAo final do mês eu havia montado um quadro com tudo que tinha em mãos, desde audios do Belial conversando sobre as noticias sobre os assassinatos"
                        + "\naté fotos que tirei das roupas dele e do seu quartinho."
                        + "\nNo fim das contas, a cada dia o medo me consumia mais e mais, Belial que antes era só uma sobra agora era uma estátua que me perseguia todas as manhãs quando eu abria o bar."
                        + "\nAgora era definitivo,eu estava obscecado e caindo em estado de tristeza profunda quando algo completamente traumático aconteceu..."
                        + "\nAo final do mês, um corpo dilacerado foi deixado bem na porta da minha casa, fato que chocou de uma forma indescritivel não só a mim como aos meus pais... "
                        + "\nEu estava desistabilizado, a raiva me possuiu e eu sabia exatamente o que fazer...");

            }
        }

        System.out.println("\n1-*Carcará mês quatro*");
        decisao = ler.nextInt();
        limparTela();
        return decisao;
    }

    public static int mesQuatro(Scanner ler, int decisao, String nome) {

        if (decisao == 1) {
            System.out.println("\nSento em minha cama com o ódio consumindo minha mente quase que por completo e "
                    + "\nem seguida encaro com desprezo meu reflexo no espelho. Era indiscutível que  desde o desaparecimento"
                    + "\nde Luciano meus cuidados e vaidades tinham escorrido por entre meus dedos, mas o que eu via ali diante"
                    + "\nde mim era surreal, minha pele estava tomada pela oleosidade, minha camiseta tinha inúmeros rasgos por"
                    + "\nconta das minhas últimas saídas, minhas unhas se mantinham ridiculamente curtas por conta de minha ansiedade"
                    + "\ne meu rosto permanecia com cortes feitos pelo dia anterior, além de carregar um cansaço descomunal."
                    + "\nEu já não era Sibito,eu já não era João, aquela imagem diante de mim era o ódio pelo ódio..."
                    + "\nApós desistir de toda essa situação que estava vivendo todos esses meses, decido...");

            System.out.println("\n1- * Salvar Luciano *");
            decisao = ler.nextInt();

            if (decisao == 1) {
                System.out.println("\nApós mais de dez minutos me encarando decido que eu mesmo"
                        + "\niria acabar com aquela agonia que vinha passando em todos esses meses."
                        + "\nMe levanto, coloco a blusa que Luciano havia esquecido em minha casa meses"
                        + "\nantes de seu desaparecimento e então vou até o armazém do meu pai então pego o(a)...");
                System.out.println("\n1- * revólver taurus 83 do meu pai *"
                        + "\n2- * a M16 do meu pai  *");
                decisao = ler.nextInt();
                limparTela();
                if (decisao == 1) {
                    System.out.println("\nColoco o revólver na minha cintura, meu celular em minha mochila"
                            + "\ne sigo pela estrada na parte de trás da minha casa. Dali percebo por um breve momento"
                            + "\nque meu coração, que já estava tomado pelo ódio e desespero está acelerado, assim com minhas "
                            + "\nmãos e pernas que já estavam tremulas. Porém, mesmo com aquela ansiedade pesada vou a diante com meu plano."
                            + "\nCorro pelo caminho e em minutos chego na casa de Belial, que parece estar sem ninguém."
                            + "\nMe escondo atrás de uma caixa d’água velha que fica próxima ao quartinho dos fundos enquanto tento "
                            + "\nouvir se há alguém na casa ou alguma vela ligada por entre as janelas. Após concluir que realmente"
                            + "\nnão há ninguém ali ando lentamente até a portinhola do quartinho que está do meu lado direito, respiro"
                            + "\nfundo e abro á abro com cuidado, ação que causa um barulho agudo e desconfortável. Então, com receio, ligo a "
                            + "\nlanterna do celular, observo aquelas ferramentas jogadas, vassouras velhas, panos de chão rasgados e "
                            + "\ncom dificuldade tento encontrar a abertura no chão que vi da última vez. Então, após muito procurar "
                            + "\nfinalmente acho o pequeno pedaço de madeira que tampa um pequeno trecho do chão em cimento, me abaixo"
                            + "\ne o retiro com cuidado."
                            + "\nAssim, direciono a lanterna do meu celular de uma forma que eu possa ver o que está em baixo de mim,"
                            + "\numa escada que leva para um lugar escuro  com um cheiro descomunal de urinas, fezes e ferrugem."
                            + "\nDesço lentamente e observo o ambiente que parece ser enorme, repleto de objetos cortantes, sacolas"
                            + "\nplásticas, barris, tonéis d’água e vasilhas com restos de elementos não definidos."
                            + "\nChego em fim no lugar onde provavelmente haveria provas que Belial é o culpado dos assassinatos da região."
                            + "\nO chão era de terra, as paredes eram feitas de tijolos de argila e dentre os diversos objetos a diante notei"
                            + "\num molho de chaves em cima de uma mesinha de plástico branca...");
                    System.out.println("\n1 - *  Coletar o molho de chaves e procurar alguma porta... *"
                            + "\n2 - *  Ignorar o molho de chaves e voltar para casa *");
                    decisao = ler.nextInt();
                    limparTela();
                    if (decisao == 1) {
                        System.out.println("\nPego o molho de chaves, direciono as luzes do meu celular para o corredor que está à minha frente e percebo"
                                + "\nque o caminho até o final do mesmo corredor  parece seguir um rastro fundo que parece já ter criado longo buraco raso na terra. "
                                + "\nSigo em passos lentos e observo que diante de mim há uma quantidade significativa de um liquido escuro que parecia estar seco nesse caminho."
                                + "\nAo final do corredor concluo então que aquilo definitivamente era sangue, o que me gera um medo descomunal, porém o que mais me impressiona"
                                + "\né o que vejo ao final de minha caminhada."
                                + "\nUma grade que parecia ter um metro e cinquenta de altura. Dentro podia-se ver um grande borrão preto contorcido em um formato de “C” "
                                + "\nque tremia-se desesperadamente."
                                + "\nDireciono meu celular para a direção ao borrão e ao processar o que está diante de mim meu corpo estremece, minhas mãos quase deixam cair "
                                + "\no molho de chaves e minha boca abre-se de forma involuntária ao que vejo . "
                                + "\nEra Luciano, forrado em seu próprio sangue que escorria de seus braços enquanto ele parecia se automutilar."
                                + "\nImediatamente caio de joelhos digo, tentando manter um tom baixo: “Luciano!! meu santo padin’ Ciço .... é você mesmo? O que ‘cê tá fazendo?”"
                                + "\nLuciano, percebendo quem estava diante de seus olhos diz entrando aos prantos: 'Sibito... sou eu sim ,mas tu não pode ficar aqui rapaz,"
                                + "\nBelial vai te matar, vai sim’ bora daqui, não quero ver mais ninguém morrer, por favor.”...");
                        System.out.println("1 - *  Tirar fotos daquele lugar, gravar um vídeo, encaminhar para José Alexandre e abrir a sela que está Luciano *");
                        decisao = ler.nextInt();
                        limparTela();
                        if (decisao == 1) {

                            System.out.println("\nAssim que Luciano para de falar não penso duas vezes antes de começar a tirar fotos daquele lugar, mais especificamente dos"
                                    + "\nrastros de sangue, das vasilhas com restos de carnes não identificáveis e até mesmo da sela de Luciano. "
                                    + "\nApós isso uso o molho de chaves para tentar abrir a sela, mesmo estando completamente tremulo, porém Luciano diz:"
                                    + "\n'Sibito pare agora!! Nenhuma dessas chaves é a certa, porque a correta está com Galego, ele sempre anda com ela'."
                                    + "\nSinto um frio tomar meu corpo, não por essa informação, mas pelo estrondoso som que escuto atrás de mim."
                                    + "\nDefinitivamente era Belial que descia as escadas com rapidez");
                            System.out.println("\n1 – 'Tá me olhando assim porque ?Você sabe que nada vai me impedir de levar Luciano embora comigo!!'");
                            decisao = ler.nextInt();
                            limparTela();
                            System.out.println("\nApós dizer isso Belial desmancha seu sorriso torto  e pressiona os lábios um contra o outro. "
                                    + "\nEm seguida me observa de cima para baixo tentando se parecer menos afobado. Em segundos vejo-o dando pequenos"
                                    + "\npassos e noto que ele iniciará, mesmo naquela situação, um daqueles discursos clássicos sobre como tudo não é"
                                    + "\ntão simples como imaginamos ou algo parecido."
                                    + "\nPorém o contrário acontece, Belial diz quase que em um tom inaudível :"
                                    + "\n“Você chegou bem longe não foi João? Sei essa trajetória não foi tão longa, já que bastava  se esforçar só um "
                                    + "\npouquinho para saber que quem anda matando o povo de Paranatama é o próprio Tinhoso, ou seja Belial Sebastião Costa Neto.”"
                                    + "\nO silêncio se estabelece e me mantenho parado enquanto Belial prossegue..."
                                    + "\n“O povo daqui me deixa muito feliz, mas hoje a noite  o que mais me causa prazer é a ideia  de que você"
                                    + "\nnão vai mais ficar no meu caminho Sibito.Tu quer que eu comece por onde? Pela cabeça... pela virilha , pelo pescoço?"
                                    + "\nOu melhor!! posso deixar você e Lulu terem um momento a sós para relembrar os velhos tempos de casal e mais tarde eu"
                                    + "\napareço para esquartejar, desfiar e fritar ambos na minha cozinha”"
                                    + "\nEm desespero tento pegar minha arma mas sou interrompido por um ataque de Belial, que em um súbito repentino me"
                                    + "\nderruba no chão e me dá um forte soco no rosto ...");
                            System.out.println("1- iniciar a batalha final... ");
                            decisao = ler.nextInt();
                            limparTela();
                        }

                    }

                }

                if (decisao == 2) {
                    System.out.println("\n " + nome + ", sua escolha desencadeou um dos fins possiveis para Carcará. A partir daqui você verá um dos fins possiveis,graças a sua escolha..."
                            + "\nAo escolher a M16 João e encontrado por Laecir no caminho da casa do Belial");
                    System.exit(0);
                }
            }

        }
        return decisao;
    }

    public static int batalha(Scanner ler, int decisao, String nome) {
        int vida = 120; //Vida do protagonista
        int vidaNova = 0; //Variavel para armazenar perca de vida
        int vidaBelial = 140; //Vida do vilão

        if (decisao == 1) {
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

                                if (vidaNova == 0 || vidaNova <= 0) {
                                    System.out.println("Após inúmeros golpes Belial cai sobre meu corpo e finalmente posso"
                                            + "\nretirar Luciano daquele cativeiro... O inferno tinha acabado");
                                    System.exit(0);
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

                                if (vidaNova == 0 || vidaNova <= 0) {
                                    System.out.println("Após inúmeros golpes Belial cai sobre meu corpo e finalmente posso"
                                            + "\nretirar Luciano daquele cativeiro... O inferno tinha cabado");
                                    System.exit(0);
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

                        if (decisao == 1) {
                            System.out.println("\nAo atirar na perna de Belial ele cai em cima de mim e de longe escuto sons de carros chegando"
                                    + "Definitivamente era Alexandre, o fim finalmente chegou ...");
                            System.exit(0);

                        }
                        if (decisao == 2) {
                            System.out.println("\nAo atirar na virilha de Belial ele cai em cima de mim e de longe escuto sons de carros chegando"
                                    + "\nDefinitivamente era Alexandre, o fim finalmente estava chegando porém eu sequer conseguia me mover,estava em completo choque,eu estava eaxusto ...");
                            System.exit(0);

                        }

                    }
                }

                if (vidaNova == 0) {
                    System.out.println("-------------- // // -----------------");
                    System.out.println(nome + " ,sua vida chegou a 0 . Isso significa que a partir daqui a "
                            + "\nhistória será contada sem que você possa decidir mais nada."
                            + "\nQuando você toma essa decisão Belial decidade que iria manter você preso com Luciano"
                            + "\npor algumas horas  e por fim decide desovar seu corpo na barragem de São Vicente..."
                            + "\nBelial é preso uma semana depois de todos esses acontecidos");
                    System.exit(0);
                }

            }
            //decisao inicial de se defender
            if (decisao == 2) {
                System.out.println("\nColoco meu braço direito em frente ao meu rosto tentando me defender\nquando, em um estralo de dedos para"
                        + "\nrealidade sinto nas pontas dos meus dedos algo pontudo,um \ngrande caco de vidro");
                System.out.println("\n1- *Tentar usar o caco de vidro* "
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

                            if (vidaNova == 0 || vidaNova <= 0) {
                                System.out.println("Após inúmeros golpes Belial cai sobre meu corpo e finalmente posso"
                                        + "\nretirar Luciano daquele cativeiro...");
                                System.exit(0);
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

                            if (vidaNova == 0 || vidaNova <= 0) {
                                System.out.println("Após inúmeros golpes Belial cai sobre meu corpo e finalmente posso"
                                        + "\nretirar Luciano daquele cativeiro...");
                                System.exit(0);
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

                    if (decisao == 1) {
                        System.out.println("\nAo atirar na perna de Belial ele cai em cima de mim e de longe escuto sons de carros chegando"
                                + "\nDefinitivamente era Alexandre, o fim finalmente chegou ...");
                        System.exit(0);
                    }
                    if (decisao == 2) {
                        System.out.println("\nAo atirar na virilha de Belial ele cai em cima de mim e de longe escuto sons de carros chegando"
                                + "\nDefinitivamente era Alexandre, o fim finalmente estava chegando porém eu sequer conseguia me mover,estava em completo choque,eu estava eaxusto ...");
                        System.exit(0);

                    }

                }

            }

        }
        limparTela();
        return decisao;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int decisao;
        int decisaoAmanhancer = 0, seguirBar = 0, decisaoCafedaManha = 0, decisaoLidarClientes = 0, interagirPai = 0, entradaVilao = 0;
        int mesUm = 0, mesTres = 0, mesQuatro = 0, batalha = 0;
        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
        }

        System.out.println(" =============================== ");

        System.out.println("Olá camarada, antes de começarmos gostaria de saber seu nome, digite a baixo:  ");
        nome = ler.nextLine();

        try {
            Thread.sleep(100);
        } catch (Exception erro) {
        }

        System.out.println("\nOlá " + nome + " agradecemos imensamente  pelo seu interesse em nosso RPG.Vamos lá?...");

        System.out.println("1 - SIM"
                + "\n2 - NÃO");
        decisao = ler.nextInt();

        if (decisao == 1) {
            try {
                Thread.sleep(100);
            } catch (Exception erro) {
            }

            System.out.println(" =============================== ");

            System.out.println("Legal " + nome + "!!" + " antes de começar gostariamos de lhe avisar que"
                    + "\nem alguns momentos do game você terá apenas uma opção de escolha. Agora, digite 1 para começar a explorar nosso universo.");
            decisao = ler.nextInt();
            limparTela();
            try {
                Thread.sleep(100);
            } catch (Exception erro) {
            }

            //Carcará
            if (decisao == 1) {

                System.out.println(nome + " ,seja bem vindo(a/e) à Carcará...");
                try {
                    Thread.sleep(100);
                } catch (Exception erro) {
                }

                System.out.println(" =============================== ");

                try {
                    Thread.sleep(100);
                } catch (Exception erro) {
                }

                System.out.println("\nA minha frente vejo dois indivíduos com expressões distintas me observando fixamente, "
                        + "\na principio consigo reconhecer um dos rostos, era  Luciano, seus cabelos que sempre foram levemente "
                        + "\ncacheados e delicados agora estão despenteados e cobertos de sangue, seus olhos carregam um peso descomunal , "
                        + "\nsuas roupas estão quase completamente rasgadas e seu sorriso tão marcante parecia ter sido erradicado. Ao seu lado "
                        + "\npercebo um homem alto ,sem rosto e de presença odiosa, quase consumada pela vontade de destruir a existência de qualquer "
                        + "\num que estivesse à sua frente, ou seja ,eu. Por um momento estou quase associando quem é tal cidadão, porém ao fundo escuto "
                        + "\na voz de meu pai ,junto a repetidos toques. Acordo com ele cutucando meu ombro dizendo que tinha alguém me esperando na cozinha "
                        + "\ne que o trabalho hoje ia começar mais cedo no bar .Digo que em minutos vou para o balcão e em seguida..."
                        + "\n1- *Ir para cozinha*"
                        + "\n2- *Verifico as notificações no celular*");
                System.out.println(" --------- ------------  ");
                decisao = ler.nextInt();

                try {
                    Thread.sleep(1000);
                } catch (Exception erro) {
                }

                //decisao Amanhancer                 
                decisaoAmanhancer = decisaoAmanhancer(ler, decisao);

                //sequencia Decisao Cafe da Manhã
                decisaoCafedaManha = decisaoCafedaManha(ler, decisaoAmanhancer);

            }

            //decisao ir Ao Bar
            seguirBar = iraoBar(ler, decisaoCafedaManha);

            // decisao lidarcomClientes
            decisaoLidarClientes = lidarcomClientes(ler, seguirBar);

            // interacaoComPai
            interagirPai = interagirPai(ler, decisaoLidarClientes);

            //entradaVilao
            entradaVilao = introducaoVilao(ler, interagirPai);

            //mes1
            mesUm = mesUm(ler, entradaVilao);

            //mes3
            mesTres = mesTres(ler, mesUm);
            //mes4

            mesQuatro = mesQuatro(ler, mesTres, nome);

            //batalha
            batalha = batalha(ler, mesQuatro, nome);

            //fim
        }

        if (decisao == 2) {
            System.out.println(" ------------------------- -------------------- ");
            System.out.println(" Ok " + nome + " entendemos que provalvemente"
                    + " \n não há mais interesse em nosso game, até mais. ");

            Main retornaInicio = new Main();
            retornaInicio.main(args);
        }

    }

}
