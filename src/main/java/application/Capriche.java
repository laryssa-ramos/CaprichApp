/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Laryssa
 */
public class Capriche {
    
        public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "u001B[33m"; 
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        char letter;
        
        do{
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println(ANSI_PURPLE_BACKGROUND + "####################################################### CaprichApp #######################################################" + ANSI_BLACK_BACKGROUND);
        
        //Banco de Perguntas
        
        String[] questions = {
            "Você já sonhou em fazer uma viagem à Lua com seu melhor amigo?",
            "Você acha que seu amigo é a reencarnação de um unicórnio?",
            "Você já considerou mudar seu nome para Geleca apenas para combinar com o apelido do seu amigo?",
            "Você acredita que seu amigo é secretamente um super-herói disfarçado?",
            "Você já planejou uma festa surpresa de aniversário para o seu amigo no dia errado, só para ver a reação?",
            "Você acha que seu amigo é a única pessoa capaz de decifrar porque o cocô das cabras é redondo e o do wombat é quadrado?",
            "Você já pensou em criar um clube exclusivo para pessoas que usam pijamas de abacaxi nas segundas-feiras?",
            "Você consegue segurar o tchan?",
            "Você já considerou tatuar uma imagem de batata frita no braço em homenagem ao seu amigo?",
            "Você já pensou em criar um podcast sobre teorias da conspiração envolvendo a vida secreta do seu melhor amigo?",
            "Você acredita que seu amigo é a verdadeira inspiração por trás das músicas de karaokê?",
            "Você acha que seu amigo possui um diploma honorário em Mímica Avançada?",
            "Você acha que seu amigo é o verdadeiro criador das terríveis baratas voadas?"
        };
        
        
        System.out.println();
        
        //Header do programa
        
       
        
        System.out.println("Bem-vindo(a) ao CaprichApp!\n\n");
        
        System.out.println(ANSI_PURPLE + "Questionário da semana:" + ANSI_CYAN + " Você está afim do seu melhor amigo?\n" + ANSI_RESET);
        
        System.out.println("Responda as perguntas com 'S'(SIM) ou 'N'(NÃO)\n");
        
        //Pontuação
        
        System.out.println("Regras de Pontuação: ");

            System.out.println();

            System.out.println(ANSI_PURPLE + "A)" + ANSI_CYAN + " De 0 a 2 pontos:" + ANSI_RESET + "Você colocou seu melhor amigo na friendzone. O que é ótimo porque talvez ele seja apenas seu amigo.\n"
                    +ANSI_PURPLE + "B)" + ANSI_CYAN + " De 3 a 4 pontos:" + ANSI_RESET + "Talvez haja amor, talvez seja hormônios.\n   Vale a pena experimentar uns cinco minutos de trocação de beijo sem estragar a amizade.\n"
                    + ANSI_PURPLE +  "C)" + ANSI_CYAN + " 5 ou mais pontos:" + ANSI_RESET + "'É o amor...\n"
                    + "   Que mexe com minha cabeça e me deixa assim\n"
                    + "   Que faz eu pensar em você e esquecer de mim\n"
                    + "   Que faz eu esquecer que a vida é feita pra viver...'\n");

            System.out.println();

            System.out.println();
        
        
        //Perguntas
        
        
            System.out.println(ANSI_CYAN+ "******************************************************* PERGUNTAS *******************************************************\n" + ANSI_RESET);
                    
            int total = 0;
            
         //Algortimo para adicionar 5 perguntas do vetor de Strings "questions" de forma aleatória
         
            Random random = new Random();
            
            List<String> selectedQuestions = new ArrayList<>();

            for(int i = 0; selectedQuestions.size() < 5; i++){
                
                int randomIndex = random.nextInt(questions.length);
                String selectedQuestion = questions[randomIndex];
                
                if(!selectedQuestions.contains(selectedQuestion)){
                    selectedQuestions.add(selectedQuestion);
                
                   }  
                
            }
            
         //Algoritmo para imprimir as perguntas e somar as respostas
            int i = 1;
            
            for(String question : selectedQuestions){
                 
                 System.out.print(i + ")");
                 System.out.println( question);
                 System.out.print(ANSI_PURPLE + "Resposta: " + ANSI_RESET);
                 
                 
                char ch = sc.next().charAt(0);

                if(ch == 'S' || ch == 's'){   
                     total += 1;

                }
                if(ch != 'S' && ch !='s' && ch != 'N' && ch != 'n'){
                     System.out.println("\nResposta inválida. Responda com 'S' ou 'N'");

                }
               
                System.out.println();
                
                i ++;
               
            }
            
            System.out.println(ANSI_CYAN + "*************************************************************************************************************************\n" + ANSI_RESET);

            if(total <= 2){

                System.out.println(ANSI_PURPLE +"PONTUAÇÃO: " +  ANSI_CYAN + total + ANSI_RESET
                        + "\n\nVocê colocou seu melhor amigo na friendzone.\nO que é ótimo porque talvez ele seja apenas seu amigo." + ANSI_RESET);

            }else if(total == 3 || total == 4){
                System.out.println(ANSI_PURPLE + "PONTUAÇÃO: " + ANSI_CYAN + total + ANSI_RESET
                        + "\n\nTalvez haja amor, talvez seja hormônios. \nVale a pena experimentar uns cinco minutos de trocação de beijo sem estragar a amizade." + ANSI_RESET);

            }else{
                System.out.println(ANSI_PURPLE + "PONTUAÇÃO: " + ANSI_CYAN + total + " \n\n" + ANSI_RESET
                        + "'É o amor\n"
                        + "Que mexe com minha cabeça e me deixa assim\n"
                        + "Que faz eu pensar em você e esquecer de mim\n"
                        + "Que faz eu esquecer que a vida é feita pra viver...'" + ANSI_RESET);
            }
            
            System.out.println();
            
            System.out.println(ANSI_CYAN + "*************************************************************************************************************************\n" + ANSI_RESET);
                                                                                                             
            
            System.out.println("Deja fazer o questionário novamente? Responda com 'S'(SIM) ou 'N'(NÃO)\n");
           
            System.out.print(ANSI_PURPLE + "Resposta: " + ANSI_RESET);
            letter = sc.next().charAt(0);
            
            System.out.println();
            System.out.println();
            
        }while (letter == 'S' || letter == 's');
        
     
        sc.close();
    }
}
