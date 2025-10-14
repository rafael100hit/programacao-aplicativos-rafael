/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_10;

/**
 *
 * @author Aluno
 */
public class Atividade_10 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Provas iniciar = new Provas();
//        iniciar.nova_prova();
        Provas.nova_prova();
    }
    
}



// CLASSE 


package atividade_10;

import java.util.Scanner;
import java.util.Random;

public class Provas {
    public String aluno;
    public int questao;
    public char resposta;
    public double pontos;
    public int acertos;
    public int erros;
    public char correcao;
    
    
    public Provas(String aluno, int questao, char resposta, double pontos, int acertos, int erros, char correcao){
        Random rd = new Random();
        this.aluno = aluno;
        this.questao = questao;
        this.resposta = resposta;
        this.pontos = pontos;
        this.acertos = acertos;
        this.erros = erros;
        this.correcao = correcao; 
                }
    
    public static class Gabarito{
        public char resposta_questao(int numero_questao){
          char [] respostaQuestao = {'a', 'b', 'c', 'd', 'e', 'e', 'd', 'c', 'b', 'a', 'c', 'c', 'e', 'd', 'a'};  
          return respostaQuestao[numero_questao-1];
        }
    }
    
    
    

    public static Provas nova_prova(){
        Scanner entrada = new Scanner(System.in);
        //Random rd = new Random();
        Gabarito gabarito = new Gabarito();
        System.out.println("Iniciando nova prova!");
        
        System.out.println("Digite o nome do Alulno: ");
        String aluno = entrada.nextLine();
        
        double pontos=0;
        int acertos=0, erros=0;
        
        for (int i=1; i<=15; i++){
            int questao = i;
            System.out.println("Questão "+i);
            System.out.println("Pergunta aleatoria: ");
            System.out.println("Resposta: \nA - * \nB - * \nC - * \nD - * \nE - * ");
            char resposta;
            
            while (true) { 
                System.out.println("Digite sua resposta (A - E): ");
                String letra = entrada.nextLine().toLowerCase();
                if (letra.length()==1){
                resposta = letra.charAt(0);
                if (resposta >= 'a' && resposta <= 'e'){
                    break;
                }
                }
                System.out.println("Resposta invalida! \nDigite apenas letras de A a E!");
                }
            
            int numero_questao=questao;
            
            char correcao = gabarito.resposta_questao(numero_questao);
            System.out.println("Gabarito: "+correcao);
                
                if(resposta==correcao){
                    System.out.println("Resposta correta!");
                    if(i<=10){
                        pontos = pontos + 0.5;
                        
                    }else{
                        pontos = pontos + 1;
                        
                    }
                    acertos = acertos + 1;
                }else{
                    System.out.println("Resposta incorreta!");
                    erros = erros + 1;
                }
    
        }
        
                Provas p = new Provas(aluno, 15, '-', pontos, acertos, erros, '-');
                System.out.println("\n--- RESULTADO FINAL ---");
                System.out.println("Aluno: " + p.aluno);
                System.out.println("Acertos: " + p.acertos);
                System.out.println("Erros: " + p.erros);
                System.out.println("Pontuação total: " + p.pontos);
                return p;
          
    }
    
}
