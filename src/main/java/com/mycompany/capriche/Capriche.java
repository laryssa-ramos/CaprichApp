/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capriche;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Laryssa
 */
public class Capriche {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        String[] questions = new String[6];
        
        
        System.out.println("**************************** CaprichApp ****************************");
        
        System.out.println();
        
        System.out.println("Bem-vindo(a) ao CaprichApp!\n\n");
        
        System.out.println("Questionário da semana: Você está afim do seu melhor amigo?\n");
        
        System.out.println("Responda as perguntas com 'S'(SIM) ou 'N'(NÃO)\n");
        
        char letter;
        
        do{
                System.out.println("******* Perguntas *******");

            System.out.println();

            questions[0] = "Você já sonhou que seu melhor amigo era um unicórnio voando sobre arco-íris cor-de-rosa enquanto segurava um buquê de salsichas?";
            questions[1] = "Você já se viu dançando a dança do frango em homenagem ao aniversário do seu melhor amigo, vestida de pinguim?";
            questions[2] = "Se seu melhor amigo fosse um sorvete, ele seria o sorvete de pistache?";
            questions[3] = "Você pensa em patos de borracha quando olha para o seu melhor amigo?";
            questions[4] = "Você já escreveu um poema de amor épico para o seu melhor amigo usando apenas emojis de vegetais?";
            questions[5] = "Você acha que seu melhor amigo seria um bom companheiro numa luta contra zumbis alienígenas usando almofadas como armas?";

            int total = 0;

            for(int i = 0; i < questions.length; i++){

                System.out.println(questions[i]);
                System.out.print("Resposta: ");
                char ch = sc.next().charAt(0);

                if(ch == 'S' || ch == 's'){   
                     total += 1;

                }
                if(ch != 'S' && ch !='s' && ch != 'N' && ch != 'n'){
                     System.out.println("\nResposta inválida. Responda com 'S' ou 'N'");

                }

                System.out.println();

            }

            System.out.println("Pontuação: ");

            System.out.println();

            System.out.println("A) De 0 a 2 pontos: você colocou seu melhor amigo na friendzone. O que é ótimo porque talvez ele seja apenas seu amigo.\n"
                    + "B) De 3 a 4 pontos: Talvez haja amor, talvez seja hormônios. Vale a pena experimentar uns cinco minutos de trocação de beijo sem estragar a amizade.\n"
                    + "C) 5 ou mais pontos: É o amor /Que mexe com minha cabeça e me deixa assim/ Que faz eu pensar em você e esquecer de mim/ Que faz eu esquecer que a vida é feita pra viver");

            System.out.println();

            System.out.println();

            if(total <= 2){

                System.out.println("Sua pontuação foi " + total +" => Você colocou seu melhor amigo na friendzone. O que é ótimo porque talvez ele seja apenas seu amigo.");

            }else if(total == 3 || total == 4){
                System.out.println("Sua pontuação foi " + total +" => Talvez haja amor, talvez seja hormônios. Vale a pena experimentar uns cinco minutos de trocação de beijo sem estragar a amizade.");

            }else{
                System.out.println("Sua pontuação foi " + total +" => \n\n"
                        + "'É o amor\n"
                        + "Que mexe com minha cabeça e me deixa assim\n"
                        + "Que faz eu pensar em você e esquecer de mim\n"
                        + "Que faz eu esquecer que a vida é feita pra viver...'");
            }
            
            System.out.println();
            
            System.out.println("***************************************************************************************************\n\n");
            
            System.out.println("Deja fazer o questionário novamente?");
            System.out.println("Responda com 'S'(SIM) ou 'N'(NÃO)\n");
            System.out.print("Resposta: ");
            letter = sc.next().charAt(0);
            
            System.out.println();
            System.out.println();
            
        }while (letter == 'S' || letter == 's');
        
     
        sc.close();
    }
}
