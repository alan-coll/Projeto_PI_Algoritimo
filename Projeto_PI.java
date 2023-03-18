package Projeto_pi;
import java.util.Scanner;
public class projeto_PI {
	 
		  public static void main(String[] args) {
		    Scanner ler = new Scanner(System.in);

		    int opcao = 0;
		    do {
		    System.out.printf("\n\n=============MENU DE OPÇÕES============\n\n\n    ======== ☛ 1- JOGAR ☚ ==========\n\n    ======== ☛ 2 - Instruções ☚ ====\n\n    ======== ☛ 3 - Creditos ☚ ======\n\n    ======== ☛ 0 - Sair ☚  ===========\n\n digite sua opção: ");
		    opcao = ler.nextInt();
		    
		    if (opcao == 1)  {
		      int temas;

		      limpatela();
		      System.out.printf("\n\nSelecione o tema desejado\n\n ==============   1-ENGENHARIA DE SOFTWARE   ===============\n\n   2-ESPORTES     |       3-TEMA3         |       4-TEMA4\n\n0-VOLTAR\n\nDigite sua opção: ");
		      temas = ler.nextInt();
		      
		      switch (temas) {
		      
		     
		      
		       case 1:
		    	      int resposta = 0;
				      int acertos = 0;
				      limpatela();
				      System.out.printf("\n\nVoce selecionou ENGENHARIA DE SOFTWARE\n\n");
		    	   do { 
		    		   
		               System.out.printf("\n\nQUESTÃO 1° - Métricas de produto são métricas de previsão empregadas para medir atributos internos de um sistema de software. O tamanho de sistema, medido em linhas de código, ou o número de métodos associados a cada classe de objeto são exemplos de métricas de produto. Em relação às métricas estáticas de produto de software, assinale a afirmativa INCORRETA\n\n1 - Índice Fog: é a medida do comprimento médio de palavras e sentenças em documentos. Quanto maior o valor do índice Fog de um documento, mais fácil é a sua compreensão. RESPOSTA CERTA\n2 - Complexidade ciclomática: é a medida da complexidade de controle de um programa. Essa complexidade de controle pode estar relacionada à compreensibilidade do programa.\n3 - Comprimento de código: é a medida do tamanho de um programa. Geralmente, quanto maior o tamanho do código de um componente, mais complexo e sujeito a erros o componente está.\n4 - Profundidade de aninhamento condicional: é a medida da profundidade de aninhamento de declarações if em um programa. Declarações if profundamente aninhadas são difíceis de entender e potencialmente sujeitas a erros.\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 1)  {
		               acertos++;
		               respostacerta();
		               }
		                else if (resposta >4 || resposta == 0)  {
		                limpatela();
		                 System.out.println("Resposta invalida digite novamente.");
		                 } 
		                else { 
			            	 respostaerrada(); 
			            	 }
		               } while (resposta >4 || resposta == 0);
		        
		        do {
		    	   System.out.printf("\n\nQUESTÃO 2° - A Linguagem de Modelagem Unificada (Unified Modeling Language – UML) é uma linguagem utilizada para modelar soluções de software, estruturas de aplicação, comportamento de sistemas e processos de negócio. Pertencem à linguagem UML, os seguintes diagramas, EXCETO:\n\n1 - De estados.\n2 - De atividades.\n3 - De caso de uso.\n4 - Entidade relacionamento. RESPOSTA CERTA\n\nDigite a resposta certa: ");
		           resposta = ler.nextInt();
		           if (resposta == 4)  {
		            acertos++;
		            respostacerta();
		           }
		         else if (resposta >4 || resposta == 0 )  {
		        	 limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		       
		       do {
		           System.out.printf("\n\nQUESTÃO 3° - Trata-se de uma técnica utilizada para se projetarem casos de testes na qual o programa ou sistema é considerado uma caixa preta e, para testá-lo, são fornecidas entras e avaliadas as saídas para verificar se estão em conformidades com os objetivos especificados. Nesta técnica os detalhes de implementação não são considerados e o software é avaliado segundo o ponto de vista do usuário. A descrição anterior define:\n\n1 -  Teste Unitário\n2 - Teste de Integridade\n3 - Teste de Mutação\n4 - Teste Funcional | RESPOSTA CERTA\n\nDigite a resposta certa: ");
		           resposta = ler.nextInt();
		           if (resposta == 4)  {
		           acertos++;
		           respostacerta();
		           }
		            else if (resposta >4 || resposta == 0 )  {
		            limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		       
		       do {	    
		          System.out.printf("\n\nQUESTÃO 4° - Assinale a alternativa que apresenta a notação gráfica para modelagem de software que define um conjunto de diagramas para documentar e ajudar no design de sistemas de software, particularmente sistemas orientados a objetos.\n\n1 - UML. | RESPOSTA CERTA\n2 - XML.\n3 - HTML.\n4 - GML.\n\nDigite a resposta certa: ");
		          resposta = ler.nextInt();
		          if (resposta == 1) {
		           acertos++;
		           respostacerta();
		           }
		            else if (resposta >4 || resposta == 0 )  {   
		            limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		       
		       do {
		        System.out.printf("\n\nQUESTÃO 5° - O tipo de teste de software que serve para garantir que todas ou algumas partes de um sistema estão dialogando e funcionando corretamente em conjunto é o teste\n\n1 - de regressão.\n2 - de aceitação.\n3 - de integração. | RESPOSTA CERTA\n4 - de validação.\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3) {
		           acertos++;
		           respostacerta();     
		           }
		            else if (resposta >4 || resposta == 0 )  {                                   
		            limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		         
		       do { 
		          System.out.printf("\n\nQUESTÃO 6° - O diagrama da UML que é empregado para fazer modelagem de aspectos dinâmicos do sistema, que é essencialmente um gráfico de fluxo mostrando a concorrência entre esses fluxos, bem como as ramificações de controle, é chamado de\n\n1 - diagrama de sequência.\n2 - diagrama de atividades. | RESPOSTA CERTA\n3 - diagrama de comunicação.\n4 - diagrama de máquina de estado.\n\nDigite a resposta certa: ");
		          resposta = ler.nextInt();
		          if (resposta == 2) {
		           acertos++; 
		           respostacerta();
		          }
		           else if (resposta >4 || resposta == 0 )  {                                   
		            limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		       
		       do { 
		           System.out.printf("\n\nQUESTÃO 7° - No contexto do projeto orientado a objetos, é necessário que as classes de projeto colaborem umas com as outras. No entanto, essa colaboração deve ser mantida em um nível mínimo aceitável, pois, se todas as classes de projeto colaboram com todas as outras classes de projeto, o sistema é difícil de implementar, testar e manter com o decorrer do tempo. Assim, num projeto orientado a objetos, essa característica descrita, e que é muito desejável, é denominada\n\n1 - alto acoplamento.\n2 - alta coesão.\n3 - baixo acoplamento. | RESPOSTA CERTA\n4 - baixa coesão.\n\nDigite a resposta certa: ");
		           resposta = ler.nextInt();
		           if (resposta == 3) {
		           acertos++;
		           respostacerta();
		          }
		            else if (resposta >4 || resposta == 0 )  {                                   
		            limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		       
		       do { 
		           System.out.printf("\n\nQUESTÃO 8° - Sobre gerenciamento de software, é importante compreender que ainda existem muitos softwares legados que são críticos para o negócio. As organizações precisam decidir como obter o melhor retorno de seus investimentos, o que envolve fazer uma avaliação realista do legado e decidir sobre a estratégia mais adequada para a continuidade e evolução dos serviços organizacionais. Assinale a alternativa que NÃO apresenta uma opção estratégica:\n\n1 - Descartar completamente o produto, caso o sistema não contribua mais de forma efetiva para os processos de negócio.\n2 - Deixar o produto inalterado e continuar com a manutenção regular.\n3 - Reestruturar o produto para melhorar sua manutenibilidade.\n4 - Manter o produto e interromper manutenções regulares. | RESPOSTA CERTA\n\nDigite a resposta certa: ");
		           resposta = ler.nextInt();
		           if (resposta == 4) {
		           acertos++;
		           respostacerta();
		          }
		           else if (resposta >4 || resposta == 0 )  {                                   
		            limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		       
		       do { 
		           System.out.printf("\n\nQUESTÃO 9° - O sistema TCEConsultas foi desenvolvido mediante uso do Processo Unificado (PU). Sendo assim, o modelo de projeto do TCEConsultas, responsável por descrever as realizações dos casos de uso em um nível mais físico, foi produzido majoritariamente durante as seguintes fases do PU:\n\n1 - Concepção e Elaboração.\n2 - Elaboração e Construção; RESPOSTA CERTA\n3 - Construção e Transição.\n4 - Transição e Concepção.\n\nDigite a resposta certa: ");
		           resposta = ler.nextInt();
		           if (resposta == 2)  {
		           acertos++;
		           respostacerta();
		          }
		            else if (resposta >4 || resposta == 0 )  {                                   
		            limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		       
		       do { 
		       System.out.printf("\n\nQUESTÃO 10° - A norma ISO 9126 traz um conjunto de atributos de qualidade organizados em características e subcaraterísticas. A característica “Funcionalidade” diz respeito à capacidade do software de prover funcionalidades que satisfaçam as necessidades explícitas e implícitas dos usuários. Dentre as subcaracterísticas da característica ‘Funcionalidade’, aquela que corresponde à capacidade do software de interagir com um ou mais sistemas especificados é a:\n\n1 - confiabilidade.\n2 - interoperabilidade. RESPOSTA CERTA\n3 - maturidade.\n4 - acessibilidade.\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 2)  {
		           acertos++;
		           respostacerta();
		          }
		        else if (resposta >4 || resposta == 0 )  {                                   
		            limpatela();
	                 System.out.println("Resposta invalida digite novamente.");
	                 } 
	                else { 
		            	 respostaerrada(); 
		            	 }
	               } while (resposta >4 || resposta == 0);
		       
		        if (acertos == 10)  {
		        	System.out.printf("\n\nUau voce é um legitimo Engenheiro de Software. Voce acertou todas!!!!");
		          }
		        if (acertos >5 && acertos <10)  {
		           System.out.printf("\n\nMuito bem, voce é quase um engenheiro de software. Voce acertou "+ acertos +" de 10");
		          }
		        if (acertos ==5)  {
		           System.out.printf("\n\nVoce acertou "+ acertos + " de 10."+" Voce esta na media mas pode melhorar." );
		          }
		        if (acertos <5)  {
		           System.out.printf("\n\nVoce acertou "+ acertos+ " de 10" + "\nQue pena, voce tem que estudar mais, esta passando vergonha!");
		          }
		        System.out.printf("Fim do quiz.\n\n 1 - Voltar ao menu\n 0 - Sair\n\nDigite sua opção: ");
		        opcao = ler.nextInt();
		        break;
		      
		      case 2:
		        acertos = 0;
		        System.out.printf("\n\nVoce selecionou tema2 \n\nQuestão1\n\n1-resposta\n2-respostacerta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 2)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão2\n\n1-resposta\n2-resposta\n3-respostacerta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão3\n\n1-respostacerta\n2-resposta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1) {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão4\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão5\n\n1-resposta\n2-resposta\n3-respostacerta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão6\n\n1-respostacerta\n2-resposta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão7\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão8\n\n1-resposta\n2-respostacerta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 2)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão9\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão10\n\n1-resposta\n2-respostacerta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 2)  {
		           acertos++;
		          }
		        System.out.printf("\n\nVoce acertou "+ acertos +  " de 10");
		        System.out.printf("Fim do quiz.\n\n 1 - Voltar ao menu\n 0 - Sair\n\nDigite sua opção: ");
		        opcao = ler.nextInt();
		        break;
		      
		      case 3:
		         acertos = 0;
		         System.out.printf("\n\nVoce selecionou tema3 \n\nQuestão1\n\n1-resposta\n2-respostacerta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		         resposta = ler.nextInt();
		         if (resposta == 2)  {
		            acertos++;
		           }
		        System.out.printf("\n\nQuestão2\n\n1-resposta\n2-resposta\n3-respostacerta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão3\n\n1-respostacerta\n2-resposta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão4\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão5\n\n1-respostacerta\n2-resposta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão6\n\n1-resposta\n2-resposta\n3-respostacerta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão7\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão8\n\n1-resposta\n2-respostacerta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 2)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão9\n\n1-respostacerta\n2-resposta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão10\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nVoce acertou "+ acertos+ " de 10. \n\nFim do QUIZ \n\n1-voltar ao menu\n0-Sair\n\nDigite sua opção: ");
		        opcao = ler.nextInt();
		        break;
		      
		      case 4:
		         acertos = 0;
		         System.out.printf("\n\nVoce selecionou tema4 \n\nQuestão1\n\n1-resposta\n2-respostacerta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		         resposta = ler.nextInt();
		         if (resposta == 2)  {
		            acertos++;
		           }
		        System.out.printf("\n\nQuestão2\n\n1-resposta\n2-resposta\n3-respostacerta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão3\n\n1-respostacerta\n2-resposta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão4\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão5\n\n1-respostacerta\n2-resposta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão6\n\n1-resposta\n2-resposta\n3-respostacerta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão7\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão8\n\n1-resposta\n2-respostacerta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 2)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão9\n\n1-respostacerta\n2-resposta\n3-resposta\n4-resposta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1)  {
		           acertos++;
		          }
		        System.out.printf("\n\nQuestão10\n\n1-resposta\n2-resposta\n3-resposta\n4-respostacerta\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
		          }
		        System.out.printf("\n\nVoce acertou "+ acertos+ " de 10. \n\nFim do QUIZ \n\n1-voltar ao menu\n0-Sair\n\nDigite sua opção: ");
		        opcao = ler.nextInt();
		        break;
		      }
		    }
		    else if (opcao == 2)  {
		      System.out.println("voce selecionou Instruções");
		    }
		    else if (opcao == 3)  { 
		    System.out.println("voce selecionou Creditos");
		    }
		    else if (opcao >3)  {
		      System.out.printf("\n\nOpção invalida.....\nDigite novamente.....");
		    }
		  } while (opcao !=0);
		 
		}
		  public static void limpatela() { System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }
		  public static void respostacerta() { System.out.println("\nRESPOSTA CERTA"); }
		  public static void respostaerrada() { System.out.println("\nRESPOSTA ERRADA!!!"); }
}
