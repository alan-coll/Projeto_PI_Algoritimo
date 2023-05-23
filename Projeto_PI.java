package Projeto_pi;

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class projeto_PI {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int opcao = 0;
    do {
      limpatela();
      System.out.printf(ANSI_BLUE +
          "\n\n=============MENU DE OPÇÕES============\n\n\n    ======== ☛ 1- JOGAR ☚ ==========\n\n    ======== ☛ 2 - CRÉDITOS ☚=======\n\n    ======== ☛ 0 - SAIR ☚  =========\n\n Digite sua opção: "
          + ANSI_BLUE);
      opcao = ler.nextInt();

      if (opcao == 1) {
        funcaoTemas();
        opcao = ler.nextInt();
      } else if (opcao == 2) {
        funcaoCreditos();
        opcao = ler.nextInt();
      } else if (opcao > 2) {
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

  public static void funcaoCreditos() {
    Scanner ler = new Scanner(System.in);
    System.out.printf(
        "\n\n☺ ☻ Este QUIZ é um oferecimento de  ☺\n\n ⇛ 𝕄 𝕀 𝔾 𝕌 𝔼 𝕃  𝕊 𝔸 ℕ 𝕋 𝕆 𝕊  𝔹 𝔸 ℙ 𝕋 𝕀 𝕊 𝕋 𝔸 ⇚\n\n ⇛ 𝔸 𝕃 𝔸 ℕ  𝕊 𝕀 𝕃 𝕍 𝔸  𝔻 𝕆 𝕊  𝕊 𝔸 ℕ 𝕋 𝕆 𝕊 ⇚\n\n ⇛ 𝔽 𝔼 𝕃 𝕀 ℙ 𝔼  𝕁 𝕌 𝕍 𝔼 ℕ 𝔸 𝕃  𝔻 𝔸  𝕊 𝕀 𝕃 𝕍 𝔸 ⇚\n\n\n1 - Voltar ao Menu\n0 - Sair\n\nDigite sua opção: ");
  }

// CONFIGURAÇÕES DO TEMA ENGENHARIA DE SOFTWARE
  public static void caseEngenhariadeSoftware() {
    Random embaralhamento = new Random();
    int configuracoes = embaralhamento.nextInt(1,5);
    
    if (configuracoes == 1) {
        configEngenharia1();
   }
   
    else if (configuracoes == 2) {
        configEngenharia2();
    }
    
    else if (configuracoes == 3) {
    	configEngenharia3();
    }
    
    else if (configuracoes == 4) {
    	configEngenharia4();
    }
    	
  }
  public static String[] questoes_Engenharia() {
    String[] vetor_Engenharia = { "\n\nENGENHARIA DE SOFTWARE\n\n",   "\n\n Métricas de produto são métricas de previsão empregadas para medir atributos internos de um sistema de software. O tamanho de sistema, medido em linhas de código, ou o número de métodos associados a cada classe de objeto são exemplos de métricas de produto. Em relação às métricas estáticas de produto de software, assinale a afirmativa INCORRETA\n\na) - Índice Fog: é a medida do comprimento médio de palavras e sentenças em documentos. Quanto maior o valor do índice Fog de um documento, mais fácil é a sua compreensão. RESPOSTA CERTA\nb) - Complexidade ciclomática: é a medida da complexidade de controle de um programa. Essa complexidade de controle pode estar relacionada à compreensibilidade do programa.\nc) - Comprimento de código: é a medida do tamanho de um programa. Geralmente, quanto maior o tamanho do código de um componente, mais complexo e sujeito a erros o componente está.\nd) - Profundidade de aninhamento condicional: é a medida da profundidade de aninhamento de declarações if em um programa. Declarações if profundamente aninhadas são difíceis de entender e potencialmente sujeitas a erros.\n\nDigite a resposta certa: ",    "\n\n A Linguagem de Modelagem Unificada (Unified Modeling Language – UML) é uma linguagem utilizada para modelar soluções de software, estruturas de aplicação, comportamento de sistemas e processos de negócio. Pertencem à linguagem UML, os seguintes diagramas, EXCETO:\n\na) - De estados.\nb) - De atividades.\nc) - De caso de uso.\nd) - Entidade relacionamento. RESPOSTA CERTA\n\nDigite a resposta certa: ",    "\n\n Trata-se de uma técnica utilizada para se projetarem casos de testes na qual o programa ou sistema é considerado uma caixa preta e, para testá-lo, são fornecidas entras e avaliadas as saídas para verificar se estão em conformidades com os objetivos especificados. Nesta técnica os detalhes de implementação não são considerados e o software é avaliado segundo o ponto de vista do usuário. A descrição anterior define:\n\na) -  Teste Unitário\nb) - Teste de Integridade\nc) - Teste de Mutação\nd) - Teste Funcional | RESPOSTA CERTA\n\nDigite a resposta certa: ",    "\n\n Assinale a alternativa que apresenta a notação gráfica para modelagem de software que define um conjunto de diagramas para documentar e ajudar no design de sistemas de software, particularmente sistemas orientados a objetos.\n\na) - UML. | RESPOSTA CERTA\nb) - XML.\nc) - HTML.\nd) - GML.\n\nDigite a resposta certa: ",    "\n\n O tipo de teste de software que serve para garantir que todas ou algumas partes de um sistema estão dialogando e funcionando corretamente em conjunto é o teste\n\na) - de regressão.\nb) - de aceitação.\nc) - de integração. | RESPOSTA CERTA\nd) - de validação.\n\nDigite a resposta certa: ",   "\n\n O diagrama da UML que é empregado para fazer modelagem de aspectos dinâmicos do sistema, que é essencialmente um gráfico de fluxo mostrando a concorrência entre esses fluxos, bem como as ramificações de controle, é chamado de\n\na) - diagrama de sequência.\nb) - diagrama de atividades. | RESPOSTA CERTA\nc) - diagrama de comunicação.\nd) - diagrama de máquina de estado.\n\nDigite a resposta certa: ",     "\n\n No contexto do projeto orientado a objetos, é necessário que as classes de projeto colaborem umas com as outras. No entanto, essa colaboração deve ser mantida em um nível mínimo aceitável, pois, se todas as classes de projeto colaboram com todas as outras classes de projeto, o sistema é difícil de implementar, testar e manter com o decorrer do tempo. Assim, num projeto orientado a objetos, essa característica descrita, e que é muito desejável, é denominada\n\na) - alto acoplamento.\nb) - alta coesão.\nc) - baixo acoplamento. | RESPOSTA CERTA\nd) - baixa coesão.\n\nDigite a resposta certa: ",     "\n\n Sobre gerenciamento de software, é importante compreender que ainda existem muitos softwares legados que são críticos para o negócio. As organizações precisam decidir como obter o melhor retorno de seus investimentos, o que envolve fazer uma avaliação realista do legado e decidir sobre a estratégia mais adequada para a continuidade e evolução dos serviços organizacionais. Assinale a alternativa que NÃO apresenta uma opção estratégica:\n\na) - Descartar completamente o produto, caso o sistema não contribua mais de forma efetiva para os processos de negócio.\nb) - Deixar o produto inalterado e continuar com a manutenção regular.\nc) - Reestruturar o produto para melhorar sua manutenibilidade.\nd) - Manter o produto e interromper manutenções regulares. | RESPOSTA CERTA\n\nDigite a resposta certa: ",     "\n\n O sistema TCEConsultas foi desenvolvido mediante uso do Processo Unificado (PU). Sendo assim, o modelo de projeto do TCEConsultas, responsável por descrever as realizações dos casos de uso em um nível mais físico, foi produzido majoritariamente durante as seguintes fases do PU:\n\na) - Concepção e Elaboração.\nb) - Elaboração e Construção; RESPOSTA CERTA\nc) - Construção e Transição.\nd) - Transição e Concepção.\n\nDigite a resposta certa: ",   "\n\n A norma ISO 9126 traz um conjunto de atributos de qualidade organizados em características e subcaraterísticas. A característica “Funcionalidade” diz respeito à capacidade do software de prover funcionalidades que satisfaçam as necessidades explícitas e implícitas dos usuários. Dentre as subcaracterísticas da característica ‘Funcionalidade’, aquela que corresponde à capacidade do software de interagir com um ou mais sistemas especificados é a:\n\na) - confiabilidade.\nb) - interoperabilidade. RESPOSTA CERTA\nc) - maturidade.\nd) - acessibilidade.\n\nDigite a resposta certa: " };
    return vetor_Engenharia;
  }
  
  public static void configEngenharia1() {
	  Scanner ler = new Scanner(System.in);
	    int resposta = 0;
	    int acertos = 0;
      String vetor[] = questoes_Engenharia();
    
	  limpatela();
	    System.out.printf(vetor[0]);
	    do {

	      System.out.printf(ANSI_BLACK +vetor[1]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[2]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[3]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[4]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[5]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[6]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[7]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[8]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[9]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[10]+ ANSI_RESET);
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
  public static void configEngenharia2() {
	  Scanner ler = new Scanner(System.in);
    String vetor[] = questoes_Engenharia();
	    int resposta = 0;
	    int acertos = 0;
	    limpatela();
	    System.out.printf(vetor[0]);
	    

           do {
	      System.out.printf(ANSI_BLACK +vetor[10]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[8]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[6]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[9]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[1]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[3]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[4]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[5]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[2]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[7]+ ANSI_RESET);
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
  public static void configEngenharia3() {
	  Scanner ler = new Scanner(System.in);
    String[] vetor = questoes_Engenharia();
	    int resposta = 0;
	    int acertos = 0;
	    limpatela();
	    System.out.printf(vetor[0]);
	              
          do {
	      System.out.printf(ANSI_BLACK +vetor[6]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[1]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[10]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[7]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[4]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[8]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[2]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[3]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[9]+ ANSI_RESET);
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
	      System.out.printf(ANSI_BLACK +vetor[5]+ ANSI_RESET);
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
  public static void configEngenharia4() {
  Scanner ler = new Scanner(System.in);
  String vetor[] = questoes_Engenharia();
   int resposta = 0;
   int acertos = 0;
   limpatela();
   System.out.printf(vetor[0]);
             
       

      do {
     System.out.printf(ANSI_BLACK +vetor[3]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[9]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[4]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[6]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[10]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[1]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[5]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[2]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[8]+ ANSI_RESET);
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
     System.out.printf(ANSI_BLACK +vetor[7]+ ANSI_RESET);
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
  // FIM DAS CONFIGURAÇÕES E DO TEMA ENGENHARIA DE SOFTWARE

  //TEMA ESPORTES E CONFIGURAÇÕES
  public static void caseEsportes() {
    String vetor[] = questoesEsportes();
    Scanner ler = new Scanner(System.in);
    int resposta = 0;
    int acertos = 0;
    limpatela();
    System.out.printf("\n\nTema ESPORTES \n\n");

    do {
      System.out.printf(ANSI_BLACK +vetor[0]+ ANSI_RESET);
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
      System.out.printf(ANSI_BLACK +vetor[1]+ ANSI_RESET);
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
      System.out.printf(ANSI_BLACK + vetor[2] + ANSI_RESET);
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
      System.out.printf(ANSI_BLACK +vetor[3]+ ANSI_RESET);
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
      System.out.printf(ANSI_BLACK +vetor[4]+ ANSI_RESET);
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
      System.out.printf(ANSI_BLACK +vetor[5]+ ANSI_RESET);
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
      System.out.printf(ANSI_BLACK +vetor[6]+ ANSI_RESET);
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
      System.out.printf(ANSI_BLACK +vetor[7]+ ANSI_RESET);
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
      System.out.printf(ANSI_BLACK +vetor[8]+ ANSI_RESET);
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
      System.out.printf(ANSI_BLACK +vetor[9]+ ANSI_RESET);
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
  public static String[] questoesEsportes() {
    String[] vetor_Esportes = {"QUESTÃO 1°\nAnalise as afirmativas a seguir:\nI. O voleibol é uma modalidade esportiva rica em regras. Nesse esporte, não é permitido, por exemplo, fazer a bola passar sobre a rede, utilizar luvas durante o jogo e nem mesmo formar duplas para uma competição.\nII. A prática do vôlei não exige a realização de movimentos dos membros superiores, pois os movimentos repetitivos praticados pelos atletas desse esporte compreendem apenas os movimentos dos membros inferiores. Marque a alternativa CORRETA:\na)-   As duas afirmativas são verdadeiras\nb) - A afirmativa I é verdadeira, e a II é falsa.\nc) - A afirmativa II é verdadeira, e a I é falsa.\nd) - As duas afirmativas são falsas. RESPOSTA CERTA\n\nDigite a resposta certa: ", "\n\nQUESTÃO 2°\nO tênis de mesa constitui, em sua partida, de sets de:\na) -  7 pontos.\nb) -  9 pontos.\nc) -  11 pontos. RESPOSTA CERTA\nd) -  13 pontos.\n\nDigite a resposta certa: ",   "\n\nQUESTÃO  3°\nA prática do futebol de campo demanda uma série de equipamentos obrigatórios de acordo com o Manual de Regras de Futebol da FIFA 2021/2022. Dentre as opções a seguir, assinale a que apresenta o equipamento que não é obrigatório.\na) - Caneleira.\nb) - Calçado.\nc) - Camiseta sem manga. RESPOSTA CERTA\nd) - Calções.\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 4°\nA Capoeira é considerada por seus praticantes como luta, dança, jogo, arte, música, expressão corporal e cultural, dentre outras. Acerca dos fatos históricos que envolvem a prática de Capoeira, é INCORRETO dizer que foi:\na) - considerada crime previsto no Código Penal brasileiro.\nb) - homologada pelo Ministério da Educação e Cultura como modalidade desportiva.\nc) - incluída pelo Comitê Olímpico Internacional no programa dos Jogos Olímpicos de Verão.  RESPOSTA CERTA\nd) - registrada pelo Instituto do Patrimônio Histórico e Artístico Nacional como patrimônio cultural brasileiro.\n\nDigite a resposta certa: ",    "\n\nQUESTÃO 5°\nO futebol, esporte que é considerado a paixão nacional e, sem dúvidas, o mais popular do mundo, começou a ser praticado:\na) - Na Inglaterra. RESPOSTA CERTA\nb) - Na França.\nc) - Nos Estados Unidos.\nd) - No Brasil.\n\nDigite a resposta certa: ",  "\n\nQUESTÃO 6°\nО quе rерrеѕеntа о ѕímbоlо dоѕ сіnсо аnéіѕ dаѕ Оlіmрíаdаѕ?\na) - Аѕ сіnсо соrеѕ рrіnсіраіѕ ехіѕtеntеѕ.\nb) - Оѕ сіnсоѕ соntіnеntеѕ hаbіtаdоѕ nо mundо. RESPOSTA CERTA\nc) - Оѕ сіnсоѕ рrіnсіраіѕ раíѕеѕ vеnсеdоrеѕ.\nd) - Аѕ сіnсо mаіоrеѕ nаçõеѕ dо mundо.\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 7°\nQual país é o único que participou de todas as Copas do Mundo?\na) - México\nb) - Alemanha\nc) - Espanha\nd) – Brasil RESPOSTA CERTA\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 8°\nAs primeiras olimpíadas aconteceram em que país?\na) - França\nb) - Inglaterra\nc) - Grécia RESPOSTA CERTA\nd) - Estados Unidos da América\n\nDigite a resposta certa: ",    "\n\nQUESTÃO 9°\nQue seleção venceu a Copa do Mundo, em 1998?\na) - Brasil\nb) - França RESPOSTA CERTA\nc) - Alemanha\nd) – Argentina\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 10°\nQual o time mais famoso da cidade italiana de Turín?\na) – Torino\nb) - Milan\nc) -  Lazio\nd) – Juventus RESPOSTA CERTA\n\nDigite a resposta certa: "};
return vetor_Esportes;
  }
  
  
  //FIM DO TEMA ESPORTES

//TEMA HISTORIA E CONFIGURAÇÕES
  public static void caseHistoria() {
    Scanner ler = new Scanner(System.in);
    int resposta = 0;
    int acertos = 0;
    String vetor[] = questoesHistoria();
    limpatela();
    System.out.printf(vetor[0]);
    do {

      System.out.printf(ANSI_BLACK +vetor[1]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[2]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[3]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[4]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[5]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[6]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[7]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[8]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[9]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[10]+ ANSI_RESET);
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
  public static String[] questoesHistoria() {
    String[] vetor_Historia = {"\n\nTema HISTÓRIA.", "\n\nQuestão 1°\nNa Grécia Antiga, as principais cidades-estado foram\na) - Babilônia e Atenas\nb) - Esparta e Roma\nc) - Babilônia e Esparta\nd) - Atenas e Esparta RESPOSTA CERTA\n\nDigite a resposta certa: ",   "\n\nQuestão 2°\nA Segunda Grande Guerra (1939-1945) adquiriu caráter mundial a partir de 7 de dezembro de 1941, quando:\na) - os russos tomaram a iniciativa de anexar os Estados Bálticos.\nb) - os alemães invadiram a França.\nc) - os japoneses atacaram a base norte-americana de Pearl Harbor. RESPOSTA CERTA\nd) - os chineses cederam a maior parte de seu território às tropas do Eixo.\n\nDigite a resposta certa: ",  "\n\nQuestão 3°\nA II Guerra Mundial foi caracterizada pelo desenvolvimento da indústria bélica. Sobre este assunto é correto afirmar que:\na) - A maior invenção deste conflito foi a bomba atômica lançada em cidades japonesas em agosto de 1945. RESPOSTA CERTA\nb) - Os nazistas conseguiram criar armas como o submarino nuclear e o gás Ziklon-B.\nc) - As mesmas estratégias utilizadas na Primeira Guerra foram repetidas na Segunda, como o uso da cavalaria.d) - A aviação de guerra se restringiu à missões de patrulhamento e reconhecimento.\n\nDigite a resposta certa: ",  "\n\nQuestão 4°\nAlguns povos que fizeram parte da civilização Mesopotâmica são:\na) - sumérios e acádios RESPOSTA CERTA\nb) - gregos e romanos\nc) - gregos e egípcios\nd) - sumérios e romanos\n\nDigite a resposta certa: ",    "\n\nQuestão 5°\nO Rio Nilo foi importante para os egípcios, pois:\na) - Suas cheias tornavam a terra fértil.\nb) - Era utilizado pelos egípcios para pesca.\nc) - Garantia a unidade política do Egito, pois era uma via utilizada para interligar os territórios.\nd) - Todas as alternativas anteriores. RESPOSTA CERTA\n\nDigite a resposta certa: ",   "\n\nQuestão 6°\nCom a crise da República e o início do período imperial, quem assumiu o poder em Roma em 27 a.c. foi:\na) - Júlio César\nb) - Marco Antônio\nc) – Brutus\nd) - Otávio Augusto RESPOSTA CERTA\n\nDigite a resposta certa: ",   "\n\nQuestão 7°\nA Guerra do Peloponeso, ocorrida na Grécia entre 431 e 401 a.C., foi:\na) - uma guerra defensiva empreendida pelos gregos contra a invasão dos persas e a ameaça de perda de suas principais praças de comércio do Mar Mediterrâneo;\nb) - uma luta comandada pelas cidades de Esparta e Corinto contra a hegemonia da Confederação de Delos - liderada por Atenas - sobre o território grego;RESPOSTA CERTA\nc) - uma guerra entre gregos e romanos, pelo desejo de implantação de uma cultura hegemônica sobre os povos do Oriente Próximo;\nd) - uma invasão do território grego pelas tropas de Alexandre - O Grande, na época de expansão do Império Macedônico que herdara de seu pai.\n\nDigite a resposta certa: ",   "\n\nQuestão 8°\nO papiro — suporte usado pelos egípcios na sua escrita — era produzido com:\na) - uma planta RESPOSTA CERTA\nb) - pele de animais\nc) – algodão\nd) – barro\n\nDigite a resposta certa: ",   "\n\nQuestão 9°\nQuando, a partir do final do último século a.C., Roma conquistou o Egito, e áreas da Mesopotâmia, encontrou nesses territórios uma forte presença de elementos gregos. Isto foi devido:\n\na) - ao recrutamento de soldados gregos pelos monarcas persas e egípcios;\nb) - à colonização grega, semelhante à realizada na Sicília e Magna Grécia;\nc) - à expansão comercial egípcia no Mediterrâneo Oriental;\nd) - ao helenismo, resultante das conquistas de Alexandre, o Grande. RESPOSTA CERTA\n\nDigite a resposta certa: ",   "\n\nQuestão 10°\n\nMaior conflito da história da América do Sul foi:\na) - Guerra do Pacífico\nb) - Guerra do Chaco\nc) - Guerra da Cisplatina\nd) - Guerra do Paraguai RESPOSTA CERTA\n\nDigite a resposta certa: "};
    return vetor_Historia;
  }
//FIM DO TEMA HISTORIA

//TEMA CONHECIMENTOS GERAIS E CONFIGURAÇÕES
  public static void caseConhecimentosGerais() {

    Scanner ler = new Scanner(System.in);
    int resposta = 0;
    int acertos = 0;
    String vetor[] = questoesConhecimentosGerais();
    limpatela();
    System.out.printf(vetor[0]);
    do {

      System.out.printf(ANSI_BLACK +vetor[1]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[2]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[3]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[4]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[5]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[6]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[7]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[8]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[9]+ ANSI_RESET);
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

      System.out.printf(ANSI_BLACK +vetor[10]+ ANSI_RESET);
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
  public static String[] questoesConhecimentosGerais() {
    String[] vetor_ConhecimentosGerais = {"\n\nTema CONHECIMENTOS GERAIS.",   "\n\nQuestão 1°\nQual a causa do terremoto que atingiu a Turquia e na Síria no dia 6 de fevereiro de 2023 e qual a sua magnitude?\n\na) - movimentos de placas tectônicas e magnitute 7,8 RESPOSTA CERTA\nb) - tempestades fortes combinadas com terremotos submarinos e magnitude 8,7\nc) - erupções vulcânicas e magnitude 7,8\nd) - combinação de fatores climáticos e magnitude 7,8\n\nDigite a resposta certa: ",        "\n\nQuestão 2°\nO que é Crimeia?\n\na) - tipo de conferência realizada entre líderes de organizações russas\nb) - nome dado ao conflito entre a Rússia e a Ucrânia\nc) - península localizada no sul da Ucrânia que em 2014 foi anexada ao território da Rússia RESPOSTA CERTA\nd) - conjunto das repúblicas da União Soviética\n\nDigite a resposta certa: ",  "\n\nQUESTÃO 3°\nQual o lugar mais profundo dos oceanos?\n\na) - Fossa de Bentley\nb) - Fossa de Tonga\nc) - Fossa de Java\nd) - Fossa das Marianas RESPOSTA CERTA\n\nDigite a resposta certa: ",  "\n\nQUESTÃO 4°\nQual a maior operação militar da história, que contou com o deslocamento de 3,8 milhões de soldados?\n\na) - Operação Tempestade no Deserto (Exército dos Estados Unidos na Guerra do Golfo)\nb) - Operação Overlord (Aliados na Segunda Guerra Mundial)\nc) - Operação Barbarossa (Países do Eixo na Segunda Guerra Mundial) RESPOSTA CERTA\nd) - Operação Downfall (Aliados na Segunda Guerra Mundial)\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 5°\nQual o maior planeta do sistema solar?\n\na) – Marte\nb) – Saturno\nc) – Terra\nd) - Júpiter RESPOSTA CERTA\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 6°\nQual o monumento famoso pela sua inclinação?\n\na) - Torre Eiffel\nb) – Esfinge\nc) - Estátua da Liberdade\nd) - Torre de Pisa RESPOSTA CERTA\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 7°\nQual o nome popular do cloreto de sódio?\n\na) – Vinagre\nb) - Sal de cozinha RESPOSTA CERTA\nc) – Papel\nd) – Fermento\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 8°\nQue fruto nasce da oliveira?\n\na) – Amêndoa\nb) – Abacate\nc) -  Azeitona RESPOSTA CERTA\nd) – Açaí\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 9°\nQual destas substâncias faz parte da composição do vidro?\n\na) – Petróleo\nb) – Fibra\nc) – Celulose\nd) – Areia RESPOSTA CERTA\n\nDigite a resposta certa: ",   "\n\nQUESTÃO 10°\nQual a montanha mais alta do Brasil?\n\na) - Pico da Neblina RESPOSTA CERTA\nb) - Pico Paraná\nc) - Monte Roraima\nd) - Pico Maior de Friburgo\n\nDigite a resposta certa: "};
    return vetor_ConhecimentosGerais;
  }
//FIM DO TEMA CONHECIMENTOS GERAIS

  
  public static void funcaoTemas() {
    Scanner ler = new Scanner(System.in);
    Random aleatorio = new Random();
    int temas;
    limpatela();
    System.out.printf(ANSI_YELLOW +
        "\n\nSelecione o tema desejado\n\n1-ALEATORIO   \n2-ENGENHARIA DE SOFTWARE\n3-ESPORTES     \n4-HISTÓRIA         \n5-CONHECIMENTOS GERAIS \n\n0-VOLTAR\n\nDigite sua opção: "
        + ANSI_RESET);
    temas = ler.nextInt();
    if (temas == 1) {
      temasAleatorio();
    } else if (temas == 0) {
      limpatela();
     
    }

    else {
      switch (temas) {

        case 2:
          caseEngenhariadeSoftware();
          funcaoCreditos();
          break;

        case 3:
          caseEsportes();
          funcaoCreditos();
          break;

        case 4:
          caseHistoria();
          funcaoCreditos();
          break;

        case 5:
          caseConhecimentosGerais();
          funcaoCreditos();
          break;
      }
    }

  }

  public static void temasAleatorio() {
    Random aleatorio = new Random();

    int temas = aleatorio.nextInt(2, 6);

    switch (temas) {

      case 2:
        caseEngenhariadeSoftware();
        funcaoCreditos();
        System.out.printf("\n\n1 - Voltar ao Menu\n0 - Sair\nDigite sua opção: ");
        break;

      case 3:
        caseEsportes();
        System.out.printf("\n\n1 - Voltar ao Menu\n0 - Sair\nDigite sua opção: ");
        break;

      case 4:
        caseHistoria();
        System.out.printf("\n\n1 - Voltar ao Menu\n0 - Sair\nDigite sua opção: ");
        break;

      case 5:
        caseConhecimentosGerais();
        System.out.printf("\n\n1 - Voltar ao Menu\n0 - Sair\nDigite sua opção: ");
        break;
    }
  }
}