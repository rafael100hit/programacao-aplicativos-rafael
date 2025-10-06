/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_06;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Atividade_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in);
            
            
//        Atividade 1

//          double nota;
//          
//         
//         do {
//             System.out.print("Digite uma nota (0 a 10): ");
//              nota = entrada.nextDouble();
//             
//         }
//         while (nota >= 11);
//            System.out.println("Nota valida: "+nota);
//            
//             if (nota < 0)
//                 System.out.println("Valor ivalido! Tente novamente.");

//           Aividade 2

//             int num1, soma;
//             double media, quantidade;
//             
//             quantidade = -1;
//             soma = 0;
//             media = 0;
//             
//             do {
//                 System.out.println("Digite um numero (0 encerra): ");
//                 num1 = entrada.nextInt();
//                 
//                 
//                 soma = soma + num1;
//                 
//                 
//                 quantidade = quantidade + 1;
//             }
//                 while (num1 != 0);
//                
//                 media = soma / quantidade;
//                 
//                 System.out.println("Soma: "+soma + "\nQuantidade: "+quantidade + "\nMedia: "+media);
           
//           Atividade 3 

//             int aleatorio, palpite, quantidade;
//             
//             quantidade = 0;
//             aleatorio = (int)(Math.random()*100) + 1;
//             
//             do {
//                 
//               System.out.println("Digite o seu palpite: ");
//               palpite = entrada.nextInt();
//               quantidade = quantidade + 1;
//               
//               if (palpite < aleatorio) {
//                   System.out.println("palpite: "+palpite);
//                   System.out.println("Muito baixo!");
//                   
//               }
//               if (palpite > aleatorio){
//                   System.out.println("palpite: "+palpite);
//                   System.out.println("Muito Alto");
//               }
//               
//               
//                }
//             
//             while (palpite != aleatorio);
//             System.out.println("palpite: "+palpite + "\nAcertou em: "+quantidade + " tentativas!");

//              Atividade 4

                int n, contagem;
                String opcao;
                
                    do {
                        System.out.println("Digite N (>0): ");
                        n=entrada.nextInt();
                        contagem=n;
                        if (n<=0) {
                            System.out.println("Valor inválido. Tente novamente!");
                        }
                        else {
                            while (contagem>=0) {
                                System.out.println(contagem);
                                contagem=contagem-1;
                            }
                             break;
                        }
                        System.out.println("Repetir? (s/n): ");
                    opcao=entrada.nextLine();
            
                    }
                    while (opcao.equalIgnoreCase("S"));
                    
    }
    
}
