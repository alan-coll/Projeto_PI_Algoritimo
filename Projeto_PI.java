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
		      funcaoTemas();
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
		  public static void limpatela() { 
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }
		  public static void respostacerta() { 
        System.out.println("\nRESPOSTA CERTA"); }
		  public static void respostaerrada() { 
        System.out.println("\nRESPOSTA ERRADA!!!"); }
      public static void respostainvalida() {
        System.out.println("Resposta invalida digite novamente.");}
      public static void caseEngenhariadeSoftware() {
        Scanner ler = new Scanner(System.in);
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
}
      public static void caseEsportes()  {
        Scanner ler = new Scanner(System.in);
            int resposta = 0;  
		        int acertos = 0;
              limpatela();
		        System.out.printf("\n\nVoce selecionou ESPORTES \n\n");
            
              do { 
		               System.out.printf("QUESTÃO 1°\nAnalise as afirmativas a seguir:\nI. O voleibol é uma modalidade esportiva rica em regras. Nesse esporte, não é permitido, por exemplo, fazer a bola passar sobre a rede, utilizar luvas durante o jogo e nem mesmo formar duplas para uma competição.\nII. A prática do vôlei não exige a realização de movimentos dos membros superiores, pois os movimentos repetitivos praticados pelos atletas desse esporte compreendem apenas os movimentos dos membros inferiores. Marque a alternativa CORRETA:\n1-   As duas afirmativas são verdadeiras\n2 - A afirmativa I é verdadeira, e a II é falsa.\n3 - A afirmativa II é verdadeira, e a I é falsa.\n4 - As duas afirmativas são falsas. RESPOSTA CERTA\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 4)  {
		               acertos++;
		               respostacerta();
		               }
		                else if (resposta >4 || resposta == 0)  {
		                 limpatela();
		                 respostainvalida();
		                 } 
		                else { 
			            	 respostaerrada(); 
			            	 }
		               } while (resposta >4 || resposta == 0);
              
		        do {
              System.out.printf("\n\nQUESTÃO 2°\nO tênis de mesa constitui, em sua partida, de sets de:\n1 -  7 pontos.\n2 -  9 pontos.\n3 -  11 pontos. RESPOSTA CERTA\n4 -  13 pontos.\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		        do {
              System.out.printf("\n\nQUESTÃO  3°\nA prática do futebol de campo demanda uma série de equipamentos obrigatórios de acordo com o Manual de Regras de Futebol da FIFA 2021/2022. Dentre as opções a seguir, assinale a que apresenta o equipamento que não é obrigatório.\n1 - Caneleira.\n2 - Calçado.\n3 - Camiseta sem manga. RESPOSTA CERTA\n4 - Calções.\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		       do {
              System.out.printf("\n\nQUESTÃO 4°\nA Capoeira é considerada por seus praticantes como luta, dança, jogo, arte, música, expressão corporal e cultural, dentre outras. Acerca dos fatos históricos que envolvem a prática de Capoeira, é INCORRETO dizer que foi:\n1 - considerada crime previsto no Código Penal brasileiro.\n2 - homologada pelo Ministério da Educação e Cultura como modalidade desportiva.\n3 - incluída pelo Comitê Olímpico Internacional no programa dos Jogos Olímpicos de Verão.  RESPOSTA CERTA\n4 - registrada pelo Instituto do Patrimônio Histórico e Artístico Nacional como patrimônio cultural brasileiro.\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		        do {
              System.out.printf("\n\nQUESTÃO 5°\nO futebol, esporte que é considerado a paixão nacional e, sem dúvidas, o mais popular do mundo, começou a ser praticado:\n1 - Na Inglaterra. RESPOSTA CERTA\n2 - Na França.\n3 - Nos Estados Unidos.\n4 - No Brasil.\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 1)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		        do {
              System.out.printf("\n\nQUESTÃO 6°\nО quе rерrеѕеntа о ѕímbоlо dоѕ сіnсо аnéіѕ dаѕ Оlіmрíаdаѕ?\n1 - Аѕ сіnсо соrеѕ рrіnсіраіѕ ехіѕtеntеѕ.2 - Оѕ сіnсоѕ соntіnеntеѕ hаbіtаdоѕ nо mundо. RESPOSTA CERTA\n3 - Оѕ сіnсоѕ рrіnсіраіѕ раíѕеѕ vеnсеdоrеѕ.\n4 - Аѕ сіnсо mаіоrеѕ nаçõеѕ dо mundо.\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 2)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		        do {
              System.out.printf("\n\nQUESTÃO 7°\nQual país é o único que participou de todas as Copas do Mundo?\n1 - México\n2 - Alemanha\n3 - Espanha\n4 – Brasil RESPOSTA CERTA\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		        do {
              System.out.printf("\n\nQUESTÃO 8°\nAs primeiras olimpíadas aconteceram em que país?\n1 - França\n2 - Inglaterra\n3 - Grécia RESPOSTA CERTA\n4 - Estados Unidos da América\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 3)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		        do {
              System.out.printf("\n\nQUESTÃO 9°\nQue seleção venceu a Copa do Mundo, em 1998?\n1 - Brasil\n2 - França RESPOSTA CERTA\n3 - Alemanha\n4 – Argentina\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 2)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		        do {
              System.out.printf("\n\nQUESTÃO 10°\nQual o time mais famoso da cidade italiana de Turín?\n1 – Torino\n2 - Milan\n3 -  Lazio\n4 – Juventus RESPOSTA CERTA\n\nDigite a resposta certa: ");
		        resposta = ler.nextInt();
		        if (resposta == 4)  {
		           acertos++;
               respostacerta();
		          }
             else if (resposta >4 || resposta == 0) {
               limpatela();
               respostainvalida();
             }
              else {
                respostaerrada();
              }
            } while (resposta >4 || resposta == 0);
              
		        if (acertos == 10)  {
		        	System.out.printf("\n\nUau voce sabe tudo sobre esportes. Voce acertou todas!!!!");
		          }
		        if (acertos >5 && acertos <10)  {
		           System.out.printf("\n\nMuito bem, voce é um especialista em esportes!!. Voce acertou "+ acertos +" de 10");
		          }
		        if (acertos ==5)  {
		           System.out.printf("\n\nVoce acertou "+ acertos + " de 10."+" Voce esta na media mas pode melhorar." );
		          }
		        if (acertos <5)  {
		           System.out.printf("\n\nVoce acertou "+ acertos+ " de 10" + "\nQue pena, voce tem que praticar mais esportes, esta passando vergonha!");
		          }
      }
      public static void caseHistoria()  {
             Scanner ler = new Scanner(System.in);
             int resposta = 0;
             int acertos = 0;
		         limpatela();
				      System.out.printf("\n\nVoce selecionou o tema HISTÓRIA.");
		    	   do { 
		    		   
		               System.out.printf("\n\nQuestão 1°\nNa Grécia Antiga, as principais cidades-estado foram\n1 - Babilônia e Atenas\n2 - Esparta e Roma\n3 - Babilônia e Esparta\n4 - Atenas e Esparta RESPOSTA CERTA\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 4)  {
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
		    		   
		               System.out.printf("\n\nQuestão 2°\nA Segunda Grande Guerra (1939-1945) adquiriu caráter mundial a partir de 7 de dezembro de 1941, quando:\n1 - os russos tomaram a iniciativa de anexar os Estados Bálticos.\n2 - os alemães invadiram a França.\n3 - os japoneses atacaram a base norte-americana de Pearl Harbor. RESPOSTA CERTA\n4 - os chineses cederam a maior parte de seu território às tropas do Eixo.\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 3)  {
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
		    		   
		               System.out.printf("\n\nQuestão 3°\nA II Guerra Mundial foi caracterizada pelo desenvolvimento da indústria bélica. Sobre este assunto é correto afirmar que:\n1 - A maior invenção deste conflito foi a bomba atômica lançada em cidades japonesas em agosto de 1945. RESPOSTA CERTA\n2 - Os nazistas conseguiram criar armas como o submarino nuclear e o gás Ziklon-B.\n3 - As mesmas estratégias utilizadas na Primeira Guerra foram repetidas na Segunda, como o uso da cavalaria.4 - A aviação de guerra se restringiu à missões de patrulhamento e reconhecimento.\n\nDigite a resposta certa: ");     
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
		    		   
		               System.out.printf("\n\nQuestão 4°\nAlguns povos que fizeram parte da civilização Mesopotâmica são:\n1 - sumérios e acádios RESPOSTA CERTA\n2 - gregos e romanos\n3 - gregos e egípcios\n4 - sumérios e romanos\n\nDigite a resposta certa: ");     
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
		    		   
		               System.out.printf("\n\nQuestão 5°\nO Rio Nilo foi importante para os egípcios, pois:\n1 - Suas cheias tornavam a terra fértil.\n2 - Era utilizado pelos egípcios para pesca.\n3 - Garantia a unidade política do Egito, pois era uma via utilizada para interligar os territórios.\n4 - Todas as alternativas anteriores. RESPOSTA CERTA\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 4)  {
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
		    		   
		               System.out.printf("\n\nQuestão 6°\nCom a crise da República e o início do período imperial, quem assumiu o poder em Roma em 27 a.c. foi:\n1 - Júlio César\n2 - Marco Antônio\n3 – Brutus\n4 - Otávio Augusto RESPOSTA CERTA\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 4)  {
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
		    		   
		               System.out.printf("\n\nQuestão 7°\nA Guerra do Peloponeso, ocorrida na Grécia entre 431 e 401 a.C., foi:\n1 - uma guerra defensiva empreendida pelos gregos contra a invasão dos persas e a ameaça de perda de suas principais praças de comércio do Mar Mediterrâneo;\n2 - uma luta comandada pelas cidades de Esparta e Corinto contra a hegemonia da Confederação de Delos - liderada por Atenas - sobre o território grego;RESPOSTA CERTA\n3 - uma guerra entre gregos e romanos, pelo desejo de implantação de uma cultura hegemônica sobre os povos do Oriente Próximo;\n4 - uma invasão do território grego pelas tropas de Alexandre - O Grande, na época de expansão do Império Macedônico que herdara de seu pai.\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 2)  {
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
		    		   
		               System.out.printf("\n\nQuestão 8°\nO papiro — suporte usado pelos egípcios na sua escrita — era produzido com:\n1 - uma planta RESPOSTA CERTA\n2 - pele de animais\n3 – algodão\n4 – barro\n\nDigite a resposta certa: ");     
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
		    		   
		               System.out.printf("\n\nQuestão 9°\nQuando, a partir do final do último século a.C., Roma conquistou o Egito, e áreas da Mesopotâmia, encontrou nesses territórios uma forte presença de elementos gregos. Isto foi devido:\n\n1 - ao recrutamento de soldados gregos pelos monarcas persas e egípcios;\n2 - à colonização grega, semelhante à realizada na Sicília e Magna Grécia;\n3 - à expansão comercial egípcia no Mediterrâneo Oriental;\n4 - ao helenismo, resultante das conquistas de Alexandre, o Grande. RESPOSTA CERTA\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 4)  {
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
		    		   
		               System.out.printf("\n\nQuestão 10°\n\nMaior conflito da história da América do Sul foi:1 - Guerra do Pacífico\n2 - Guerra do Chaco\n3 - Guerra da Cisplatina\n4 - Guerra do Paraguai RESPOSTA CERTA\n\nDigite a resposta certa: ");     
		             resposta = ler.nextInt();
		             if (resposta == 4)  {
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
              
		        if (acertos == 10)  {
		        	System.out.printf("\n\nUau voce sabe tudo sobre História. Voce acertou todas!!!!");
		          }
		        if (acertos >5 && acertos <10)  {
		           System.out.printf("\n\nMuito bem, voce é um expert em História!!. Voce acertou "+ acertos +" de 10");
		          }
		        if (acertos ==5)  {
		           System.out.printf("\n\nVoce acertou "+ acertos + " de 10."+" Voce esta na media mas pode melhorar." );
		          }
		        if (acertos <5)  {
		           System.out.printf("\n\nVoce acertou "+ acertos+ " de 10" + "\nQue pena, voce tem que estudar mais História, esta passando vergonha!");
		          }
      }
      public static void funcaoTemas()  {
        Scanner ler = new Scanner(System.in);
        int temas;
        int opcao = 0;
		      limpatela();
		      System.out.printf("\n\nSelecione o tema desejado\n\n ==============   1-ENGENHARIA DE SOFTWARE   ===============\n\n   2-ESPORTES     |       3-HISTÓRIA         |       4-TEMA4\n\n0-VOLTAR\n\nDigite sua opção: ");
		      temas = ler.nextInt();
		      
		      switch (temas) {
		      
		       case 1:
            caseEngenhariadeSoftware();
		        System.out.printf("Fim do quiz.\n\n 1 - Voltar ao menu\n\nDigite sua opção: ");
		        opcao = ler.nextInt();
		        break;
		      
		      case 2:
            caseEsportes();
		        System.out.printf("Fim do quiz.\n\n 1 - Voltar ao menu\n\nDigite sua opção: ");
		        opcao = ler.nextInt();
		        break;
              
		      case 3:
		         caseHistoria();
             System.out.printf("Fim do quiz.\n\n 1 - Voltar ao menu\n\nDigite sua opção: ");
		         opcao = ler.nextInt();
		         break;
		      
		      case 4:
		         int resposta = 0;
             int acertos = 0;
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
}
