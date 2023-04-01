package Projeto_pi;

import java.util.Scanner;
import java.io.*;

public class projeto_PI {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int opcao = 0;
    do {
      limpatela();
      System.out.printf(ANSI_BLUE +
          "\n\n=============MENU DE OPÇÕES============\n\n\n    ======== ☛ 1- JOGAR ☚ ==========\n\n    ======== ☛ 2 - CRÉDITOS ☚\n\n    ======== ☛ 0 - SAIR ☚  ===========\n\n Digite sua opção: "
          + ANSI_BLUE);
      opcao = ler.nextInt();

      if (opcao == 1)  {
        funcaoTemas();
        opcao = ler.nextInt();
      } 
      else if (opcao == 2)  {
        funcaoCreditos();
        opcao = ler.nextInt();
      } 
      else if (opcao > 2) {
        System.out.printf(ANSI_RED + "\n\nOpção invalida.....\nDigite novamente....." + ANSI_RESET);
      }
    } while (opcao != 0);

  }

  public static void limpatela() {
    System.out.println(
        "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }

  public static final String ANSI_RESET = "\u001B[0m";
  // declarando as cores
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "	\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_BLUE = "\u001B[34m";

  public static void respostacerta() {
    System.out.println(ANSI_GREEN + "\nRESPOSTA CERTA" + ANSI_RESET);
  }

  public static void respostaerrada() {
    System.out.println(ANSI_RED + "\nRESPOSTA ERRADA!!!" + ANSI_RESET);
  }

  public static void respostainvalida() {
    System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
  }

  public static void funcaoCreditos()  {
    Scanner ler = new Scanner(System.in);
        System.out.printf("\n\n☺ ☻ Este QUIZ é um oferecimento de  ☺\n\n ⇛ 𝕄 𝕀 𝔾 𝕌 𝔼 𝕃  𝕊 𝔸 ℕ 𝕋 𝕆 𝕊  𝔹 𝔸 ℙ 𝕋 𝕀 𝕊 𝕋 𝔸 ⇚\n\n ⇛ 𝔸 𝕃 𝔸 ℕ  𝕊 𝕀 𝕃 𝕍 𝔸  𝔻 𝕆 𝕊  𝕊 𝔸 ℕ 𝕋 𝕆 𝕊 ⇚\n\n ⇛ 𝔽 𝔼 𝕃 𝕀 ℙ 𝔼  𝕁 𝕌 𝕍 𝔼 ℕ 𝔸 𝕃  𝔻 𝔸  𝕊 𝕀 𝕃 𝕍 𝔸 ⇚\n\n");
  }

  public static void caseEngenhariadeSoftware() {
    Scanner ler = new Scanner(System.in);
    int resposta = 0;
    int acertos = 0;
    limpatela();
    System.out.printf("\n\nVoce selecionou ENGENHARIA DE SOFTWARE\n\n");
    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 1° - Métricas de produto são métricas de previsão empregadas para medir atributos internos de um sistema de software. O tamanho de sistema, medido em linhas de código, ou o número de métodos associados a cada classe de objeto são exemplos de métricas de produto. Em relação às métricas estáticas de produto de software, assinale a afirmativa INCORRETA\n\na) - Índice Fog: é a medida do comprimento médio de palavras e sentenças em documentos. Quanto maior o valor do índice Fog de um documento, mais fácil é a sua compreensão. RESPOSTA CERTA\nb) - Complexidade ciclomática: é a medida da complexidade de controle de um programa. Essa complexidade de controle pode estar relacionada à compreensibilidade do programa.\nc) - Comprimento de código: é a medida do tamanho de um programa. Geralmente, quanto maior o tamanho do código de um componente, mais complexo e sujeito a erros o componente está.\nd) - Profundidade de aninhamento condicional: é a medida da profundidade de aninhamento de declarações if em um programa. Declarações if profundamente aninhadas são difíceis de entender e potencialmente sujeitas a erros.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'a') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 2° - A Linguagem de Modelagem Unificada (Unified Modeling Language – UML) é uma linguagem utilizada para modelar soluções de software, estruturas de aplicação, comportamento de sistemas e processos de negócio. Pertencem à linguagem UML, os seguintes diagramas, EXCETO:\n\na) - De estados.\nb) - De atividades.\nc) - De caso de uso.\nd) - Entidade relacionamento. RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'd') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 3° - Trata-se de uma técnica utilizada para se projetarem casos de testes na qual o programa ou sistema é considerado uma caixa preta e, para testá-lo, são fornecidas entras e avaliadas as saídas para verificar se estão em conformidades com os objetivos especificados. Nesta técnica os detalhes de implementação não são considerados e o software é avaliado segundo o ponto de vista do usuário. A descrição anterior define:\n\na) -  Teste Unitário\nb) - Teste de Integridade\nc) - Teste de Mutação\nd) - Teste Funcional | RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'd') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 4° - Assinale a alternativa que apresenta a notação gráfica para modelagem de software que define um conjunto de diagramas para documentar e ajudar no design de sistemas de software, particularmente sistemas orientados a objetos.\n\na) - UML. | RESPOSTA CERTA\nb) - XML.\nc) - HTML.\nd) - GML.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'a') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 5° - O tipo de teste de software que serve para garantir que todas ou algumas partes de um sistema estão dialogando e funcionando corretamente em conjunto é o teste\n\na) - de regressão.\nb) - de aceitação.\nc) - de integração. | RESPOSTA CERTA\nd) - de validação.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'c') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println("Resposta invalida digite novamente.");
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 6° - O diagrama da UML que é empregado para fazer modelagem de aspectos dinâmicos do sistema, que é essencialmente um gráfico de fluxo mostrando a concorrência entre esses fluxos, bem como as ramificações de controle, é chamado de\n\na) - diagrama de sequência.\nb) - diagrama de atividades. | RESPOSTA CERTA\nc) - diagrama de comunicação.\nd) - diagrama de máquina de estado.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'b') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println("Resposta invalida digite novamente.");
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 7° - No contexto do projeto orientado a objetos, é necessário que as classes de projeto colaborem umas com as outras. No entanto, essa colaboração deve ser mantida em um nível mínimo aceitável, pois, se todas as classes de projeto colaboram com todas as outras classes de projeto, o sistema é difícil de implementar, testar e manter com o decorrer do tempo. Assim, num projeto orientado a objetos, essa característica descrita, e que é muito desejável, é denominada\n\na) - alto acoplamento.\nb) - alta coesão.\nc) - baixo acoplamento. | RESPOSTA CERTA\nd) - baixa coesão.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'c') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 8° - Sobre gerenciamento de software, é importante compreender que ainda existem muitos softwares legados que são críticos para o negócio. As organizações precisam decidir como obter o melhor retorno de seus investimentos, o que envolve fazer uma avaliação realista do legado e decidir sobre a estratégia mais adequada para a continuidade e evolução dos serviços organizacionais. Assinale a alternativa que NÃO apresenta uma opção estratégica:\n\na) - Descartar completamente o produto, caso o sistema não contribua mais de forma efetiva para os processos de negócio.\nb) - Deixar o produto inalterado e continuar com a manutenção regular.\nc) - Reestruturar o produto para melhorar sua manutenibilidade.\nd) - Manter o produto e interromper manutenções regulares. | RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'd') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 9° - O sistema TCEConsultas foi desenvolvido mediante uso do Processo Unificado (PU). Sendo assim, o modelo de projeto do TCEConsultas, responsável por descrever as realizações dos casos de uso em um nível mais físico, foi produzido majoritariamente durante as seguintes fases do PU:\n\na) - Concepção e Elaboração.\nb) - Elaboração e Construção; RESPOSTA CERTA\nc) - Construção e Transição.\nd) - Transição e Concepção.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'b') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 10° - A norma ISO 9126 traz um conjunto de atributos de qualidade organizados em características e subcaraterísticas. A característica “Funcionalidade” diz respeito à capacidade do software de prover funcionalidades que satisfaçam as necessidades explícitas e implícitas dos usuários. Dentre as subcaracterísticas da característica ‘Funcionalidade’, aquela que corresponde à capacidade do software de interagir com um ou mais sistemas especificados é a:\n\na) - confiabilidade.\nb) - interoperabilidade. RESPOSTA CERTA\nc) - maturidade.\nd) - acessibilidade.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'b') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    if (acertos == 10) {
      System.out.printf(
          ANSI_GREEN + "\n\nUau voce é um legitimo Engenheiro de Software. Voce acertou todas!!!!" + ANSI_RESET);
    }
    if (acertos > 5 && acertos < 10) {
      System.out.printf(ANSI_BLUE + "\n\nMuito bem, voce é quase um engenheiro de software. Voce acertou " + acertos
          + " de 10" + ANSI_RESET);
    }
    if (acertos == 5) {
      System.out.printf(ANSI_YELLOW + "\n\nVoce acertou " + acertos + " de 10."
          + " Voce esta na media mas pode melhorar." + ANSI_RESET);
    }
    if (acertos < 5) {
      System.out.printf(
          ANSI_RED + "\n\nVoce acertou " + acertos + " de 10"
              + "\nQue pena, voce tem que estudar mais, esta passando vergonha!" + ANSI_RESET);
    }
  }

  public static void caseEsportes() {
    Scanner ler = new Scanner(System.in);
    int resposta = 0;
    int acertos = 0;
    limpatela();
    System.out.printf("\n\nVoce selecionou ESPORTES \n\n");

    do {
      System.out.printf(ANSI_BLACK +
          "QUESTÃO 1°\nAnalise as afirmativas a seguir:\nI. O voleibol é uma modalidade esportiva rica em regras. Nesse esporte, não é permitido, por exemplo, fazer a bola passar sobre a rede, utilizar luvas durante o jogo e nem mesmo formar duplas para uma competição.\nII. A prática do vôlei não exige a realização de movimentos dos membros superiores, pois os movimentos repetitivos praticados pelos atletas desse esporte compreendem apenas os movimentos dos membros inferiores. Marque a alternativa CORRETA:\na)-   As duas afirmativas são verdadeiras\nb) - A afirmativa I é verdadeira, e a II é falsa.\nc) - A afirmativa II é verdadeira, e a I é falsa.\nd) - As duas afirmativas são falsas. RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'd') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 2°\nO tênis de mesa constitui, em sua partida, de sets de:\na) -  7 pontos.\nb) -  9 pontos.\nc) -  11 pontos. RESPOSTA CERTA\nd) -  13 pontos.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'c') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK
          + "\n\nQUESTÃO  3°\nA prática do futebol de campo demanda uma série de equipamentos obrigatórios de acordo com o Manual de Regras de Futebol da FIFA 2021/2022. Dentre as opções a seguir, assinale a que apresenta o equipamento que não é obrigatório.\na) - Caneleira.\nb) - Calçado.\nc) - Camiseta sem manga. RESPOSTA CERTA\nd) - Calções.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'c') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 4°\nA Capoeira é considerada por seus praticantes como luta, dança, jogo, arte, música, expressão corporal e cultural, dentre outras. Acerca dos fatos históricos que envolvem a prática de Capoeira, é INCORRETO dizer que foi:\na) - considerada crime previsto no Código Penal brasileiro.\nb) - homologada pelo Ministério da Educação e Cultura como modalidade desportiva.\nc) - incluída pelo Comitê Olímpico Internacional no programa dos Jogos Olímpicos de Verão.  RESPOSTA CERTA\nd) - registrada pelo Instituto do Patrimônio Histórico e Artístico Nacional como patrimônio cultural brasileiro.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'c') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 5°\nO futebol, esporte que é considerado a paixão nacional e, sem dúvidas, o mais popular do mundo, começou a ser praticado:\na) - Na Inglaterra. RESPOSTA CERTA\nb) - Na França.\nc) - Nos Estados Unidos.\nd) - No Brasil.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'a') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 6°\nО quе rерrеѕеntа о ѕímbоlо dоѕ сіnсо аnéіѕ dаѕ Оlіmрíаdаѕ?\na) - Аѕ сіnсо соrеѕ рrіnсіраіѕ ехіѕtеntеѕ.\nb) - Оѕ сіnсоѕ соntіnеntеѕ hаbіtаdоѕ nо mundо. RESPOSTA CERTA\nc) - Оѕ сіnсоѕ рrіnсіраіѕ раíѕеѕ vеnсеdоrеѕ.\nd) - Аѕ сіnсо mаіоrеѕ nаçõеѕ dо mundо.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'b') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 7°\nQual país é o único que participou de todas as Copas do Mundo?\na) - México\nb) - Alemanha\nc) - Espanha\nd) – Brasil RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'd') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 8°\nAs primeiras olimpíadas aconteceram em que país?\na) - França\nb) - Inglaterra\nc) - Grécia RESPOSTA CERTA\nd) - Estados Unidos da América\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'c') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta >'d');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 9°\nQue seleção venceu a Copa do Mundo, em 1998?\na) - Brasil\nb) - França RESPOSTA CERTA\nc) - Alemanha\nd) – Argentina\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'b') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta >'d') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    do {
      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 10°\nQual o time mais famoso da cidade italiana de Turín?\na) – Torino\nb) - Milan\nc) -  Lazio\nd) – Juventus RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.next().toLowerCase().charAt(0);
      if (resposta == 'd') {
        acertos++;
        respostacerta();
      } else if (resposta < 'a' || resposta > 'd') {
        limpatela();
        respostainvalida();
      } else {
        respostaerrada();
      }
    } while (resposta < 'a' || resposta > 'd');

    if (acertos == 10) {
      System.out.printf(ANSI_GREEN + "\n\nUau voce sabe tudo sobre esportes. Voce acertou todas!!!!" + ANSI_RESET);
    }
    if (acertos > 5 && acertos < 10) {
      System.out.printf(ANSI_GREEN + "\n\nMuito bem, voce é um especialista em esportes!!. Voce acertou " + acertos
          + " de 10" + ANSI_RESET);
    }
    if (acertos == 5) {
      System.out.printf(ANSI_YELLOW + "\n\nVoce acertou " + acertos + " de 10."
          + " Voce esta na media mas pode melhorar." + ANSI_RESET);
    }
    if (acertos < 5) {
      System.out.printf(ANSI_RED + "\n\nVoce acertou " + acertos + " de 10"
          + "\nQue pena, voce tem que praticar mais esportes, esta passando vergonha!" + ANSI_RESET);
    }
  }

  public static void caseHistoria() {
    Scanner ler = new Scanner(System.in);
    int resposta = 0;
    int acertos = 0;
    limpatela();
    System.out.printf("\n\nVoce selecionou o tema HISTÓRIA.");
    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 1°\nNa Grécia Antiga, as principais cidades-estado foram\n1 - Babilônia e Atenas\n2 - Esparta e Roma\n3 - Babilônia e Esparta\n4 - Atenas e Esparta RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 2°\nA Segunda Grande Guerra (1939-1945) adquiriu caráter mundial a partir de 7 de dezembro de 1941, quando:\n1 - os russos tomaram a iniciativa de anexar os Estados Bálticos.\n2 - os alemães invadiram a França.\n3 - os japoneses atacaram a base norte-americana de Pearl Harbor. RESPOSTA CERTA\n4 - os chineses cederam a maior parte de seu território às tropas do Eixo.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 3) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 3°\nA II Guerra Mundial foi caracterizada pelo desenvolvimento da indústria bélica. Sobre este assunto é correto afirmar que:\n1 - A maior invenção deste conflito foi a bomba atômica lançada em cidades japonesas em agosto de 1945. RESPOSTA CERTA\n2 - Os nazistas conseguiram criar armas como o submarino nuclear e o gás Ziklon-B.\n3 - As mesmas estratégias utilizadas na Primeira Guerra foram repetidas na Segunda, como o uso da cavalaria.4 - A aviação de guerra se restringiu à missões de patrulhamento e reconhecimento.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 1) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 4°\nAlguns povos que fizeram parte da civilização Mesopotâmica são:\n1 - sumérios e acádios RESPOSTA CERTA\n2 - gregos e romanos\n3 - gregos e egípcios\n4 - sumérios e romanos\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 1) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 5°\nO Rio Nilo foi importante para os egípcios, pois:\n1 - Suas cheias tornavam a terra fértil.\n2 - Era utilizado pelos egípcios para pesca.\n3 - Garantia a unidade política do Egito, pois era uma via utilizada para interligar os territórios.\n4 - Todas as alternativas anteriores. RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 6°\nCom a crise da República e o início do período imperial, quem assumiu o poder em Roma em 27 a.c. foi:\n1 - Júlio César\n2 - Marco Antônio\n3 – Brutus\n4 - Otávio Augusto RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 7°\nA Guerra do Peloponeso, ocorrida na Grécia entre 431 e 401 a.C., foi:\n1 - uma guerra defensiva empreendida pelos gregos contra a invasão dos persas e a ameaça de perda de suas principais praças de comércio do Mar Mediterrâneo;\n2 - uma luta comandada pelas cidades de Esparta e Corinto contra a hegemonia da Confederação de Delos - liderada por Atenas - sobre o território grego;RESPOSTA CERTA\n3 - uma guerra entre gregos e romanos, pelo desejo de implantação de uma cultura hegemônica sobre os povos do Oriente Próximo;\n4 - uma invasão do território grego pelas tropas de Alexandre - O Grande, na época de expansão do Império Macedônico que herdara de seu pai.\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 2) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 8°\nO papiro — suporte usado pelos egípcios na sua escrita — era produzido com:\n1 - uma planta RESPOSTA CERTA\n2 - pele de animais\n3 – algodão\n4 – barro\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 1) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 9°\nQuando, a partir do final do último século a.C., Roma conquistou o Egito, e áreas da Mesopotâmia, encontrou nesses territórios uma forte presença de elementos gregos. Isto foi devido:\n\n1 - ao recrutamento de soldados gregos pelos monarcas persas e egípcios;\n2 - à colonização grega, semelhante à realizada na Sicília e Magna Grécia;\n3 - à expansão comercial egípcia no Mediterrâneo Oriental;\n4 - ao helenismo, resultante das conquistas de Alexandre, o Grande. RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 10°\n\nMaior conflito da história da América do Sul foi:1 - Guerra do Pacífico\n2 - Guerra do Chaco\n3 - Guerra da Cisplatina\n4 - Guerra do Paraguai RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    if (acertos == 10) {
      System.out.printf(ANSI_GREEN + "\n\nUau voce sabe tudo sobre História. Voce acertou todas!!!!" + ANSI_RESET);
    }
    if (acertos > 5 && acertos < 10) {
      System.out.printf(
          ANSI_BLUE + "\n\nMuito bem, voce é um expert em História!!. Voce acertou " + acertos + " de 10" + ANSI_RESET);
    }
    if (acertos == 5) {
      System.out.printf(ANSI_YELLOW + "\n\nVoce acertou " + acertos + " de 10."
          + " Voce esta na media mas pode melhorar." + ANSI_RESET);
    }
    if (acertos < 5) {
      System.out.printf(ANSI_RED + "\n\nVoce acertou " + acertos + " de 10"
          + "\nQue pena, voce tem que estudar mais História, esta passando vergonha!" + ANSI_RESET);
    }
  }

  public static void caseConhecimentosGerais() {
    Scanner ler = new Scanner(System.in);
    int resposta = 0;
    int acertos = 0;
    limpatela();
    System.out.printf("\n\nVoce selecionou o tema CONHECIMENTOS GERAIS.");
    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 1°\nQual a causa do terremoto que atingiu a Turquia e na Síria no dia 6 de fevereiro de 2023 e qual a sua magnitude?\n\n1 - movimentos de placas tectônicas e magnitute 7,8 RESPOSTA CERTA\n2 - tempestades fortes combinadas com terremotos submarinos e magnitude 8,7\n3 - erupções vulcânicas e magnitude 7,8\n4 - combinação de fatores climáticos e magnitude 7,8\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 1) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQuestão 2°\nO que é Crimeia?\n\n1 - tipo de conferência realizada entre líderes de organizações russas\n2 - nome dado ao conflito entre a Rússia e a Ucrânia\n3 - península localizada no sul da Ucrânia que em 2014 foi anexada ao território da Rússia RESPOSTA CERTA\n4 - conjunto das repúblicas da União Soviética\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 3) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 3°\nQual o lugar mais profundo dos oceanos?\n\n1 - Fossa de Bentley\n2 - Fossa de Tonga\n3 - Fossa de Java\n4 - Fossa das Marianas RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 4°\nQual a maior operação militar da história, que contou com o deslocamento de 3,8 milhões de soldados?\n\n1 - Operação Tempestade no Deserto (Exército dos Estados Unidos na Guerra do Golfo)\n2 - Operação Overlord (Aliados na Segunda Guerra Mundial)\n3 - Operação Barbarossa (Países do Eixo na Segunda Guerra Mundial) RESPOSTA CERTA\n4 - Operação Downfall (Aliados na Segunda Guerra Mundial)\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 3) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 5°\nQual o maior planeta do sistema solar?\n\n1 – Marte\n2 – Saturno\n3 – Terra\n4 - Júpiter RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 6°\nQual o monumento famoso pela sua inclinação?\n\n1 - Torre Eiffel\n2 – Esfinge\n3 - Estátua da Liberdade\n4 - Torre de Pisa RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 7°\nQual o nome popular do cloreto de sódio?\n\n1 – Vinagre\n2 - Sal de cozinha RESPOSTA CERTA\n3 – Papel\n4 – Fermento\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 2) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 8°\nQue fruto nasce da oliveira?\n\n1 – Amêndoa\n2 – Abacate\n3 -  Azeitona RESPOSTA CERTA\n4 – Açaí\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 3) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 9°\nQual destas substâncias faz parte da composição do vidro?\n\n1 – Petróleo\n2 – Fibra\n3 – Celulose\n4 – Areia RESPOSTA CERTA\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 4) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    do {

      System.out.printf(ANSI_BLACK +
          "\n\nQUESTÃO 10°\nQual a montanha mais alta do Brasil?\n\n1 - Pico da Neblina RESPOSTA CERTA\n2 - Pico Paraná\n3 - Monte Roraima\n4 - Pico Maior de Friburgo\n\nDigite a resposta certa: "
          + ANSI_RESET);
      resposta = ler.nextInt();
      if (resposta == 1) {
        acertos++;
        respostacerta();
      } else if (resposta > 4 || resposta == 0) {
        limpatela();
        System.out.println(ANSI_RED + "Resposta invalida digite novamente." + ANSI_RESET);
      } else {
        respostaerrada();
      }
    } while (resposta > 4 || resposta == 0);

    if (acertos == 10) {
      System.out.printf(ANSI_GREEN + "\n\nUau voce sabe tudo. Voce acertou todas!!!!" + ANSI_RESET);
    }
    if (acertos > 5 && acertos < 10) {
      System.out
          .printf(ANSI_BLUE + "\n\nMuito bem, voce é um expert em Conhecimentos Gerais!!. Voce acertou " + acertos
              + " de 10" + ANSI_RESET);
    }
    if (acertos == 5) {
      System.out.printf(ANSI_YELLOW + "\n\nVoce acertou " + acertos + " de 10."
          + " Voce esta na media mas pode melhorar." + ANSI_RESET);
    }
    if (acertos < 5) {
      System.out.printf(ANSI_RED +
          "\n\nVoce acertou " + acertos + " de 10" + "\nQue pena, voce tem que estudar mais, esta passando vergonha!"
          + ANSI_RESET);
    }
  }

  public static void funcaoTemas() {
    Scanner ler = new Scanner(System.in);
    int temas;
    limpatela();
    System.out.printf(ANSI_YELLOW +
        "\n\nSelecione o tema desejado\n\n ==============   1-ENGENHARIA DE SOFTWARE   ===============\n\n   2-ESPORTES     |       3-HISTÓRIA         |       4-CONHECIMENTOS GERAIS \n\n0-VOLTAR\n\nDigite sua opção: "
        + ANSI_RESET);
    temas = ler.nextInt();

    switch (temas) {

      case 1:
        caseEngenhariadeSoftware();
        funcaoCreditos();
        System.out.printf("\n\n1 - Voltar ao Menu\n0 - Sair\nDigite sua opção: ");
        break;

      case 2:
        caseEsportes();
        System.out.printf("\n\n1 - Voltar ao Menu\n0 - Sair\nDigite sua opção: ");
        break;

      case 3:
        caseHistoria();
        System.out.printf("\n\n1 - Voltar ao Menu\n0 - Sair\nDigite sua opção: ");
        break;

      case 4:
        caseConhecimentosGerais();
        System.out.printf("\n\n1 - Voltar ao Menu\n0 - Sair\nDigite sua opção: ");
        break;
    }

  }
}
