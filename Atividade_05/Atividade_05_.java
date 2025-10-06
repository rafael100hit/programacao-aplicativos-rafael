/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_05_;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

public class Atividade_05_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);

        // ========== Atividade 01 ==========
//        int num, i;
//        System.out.print("Digite um numero: ");
//        num = entrada.nextInt();
//        i = 1;
//        while (i <= num) {
//            System.out.println(i);
//            i = i + 1;
//        }

        // ========== Atividade 02 ==========
//        int num, soma, quantidade;
//        num = 0;
//        soma = 0;
//        quantidade = 0;
//        while (num != -1) {
//            if (num != -1) {
//                System.out.print("Digite um numero: ");
//                num = entrada.nextInt();
//                soma = soma + num;
//                quantidade = quantidade + 1;
//            }
//            if (num == -1) {
//                soma = soma + 1;
//                quantidade = quantidade - 1;
//                System.out.println("Soma total: " + soma);
//                System.out.println("Foram somados " + quantidade + " valores.");
//                break;
//            }
//        }
//        System.out.println("O valor da soma sera: " + soma);

        // ========== Atividade 03 ==========
//        String senha = "";
//        while (!senha.contains("Java123")) {
//            System.out.println("Digite a senha: ");
//            senha = entrada.nextLine();
//            if (!senha.equals("Java123")) {
//                System.out.println("Senha incorreta!");
//            }
//            if (senha.equals("Java123")) {
//                System.out.println("Acesso permitido!");
//            }
//        }

        // ========== Atividade 04 ==========
//        int menu, opcao;
//        double num1, num2, total;
//        opcao = -1;
//        while (opcao != 0) {
//            System.out.println(" *MENU* \n1 - Somar \n2 - Subtrair \n3 - Multiplicar \n0 - Sair ");
//            opcao = entrada.nextInt();
//            switch (opcao) {
//                case 1:
//                    System.out.println("Você escolheu a SOMA.");
//                    System.out.println("Digite o primeiro valor: ");
//                    num1 = entrada.nextDouble();
//                    System.out.println("Digite o segundo valor:");
//                    num2 = entrada.nextDouble();
//                    total = num1 + num2;
//                    System.out.println("Resultado: " + total);
//                    break;
//                case 2:
//                    System.out.println("Você escolheu a SUBTRAÇÃO.");
//                    System.out.println("Digite o primeiro valor: ");
//                    num1 = entrada.nextDouble();
//                    System.out.println("Digite o segundo valor:");
//                    num2 = entrada.nextDouble();
//                    total = num1 - num2;
//                    System.out.println("Resultado: " + total);
//                    break;
//                case 3:
//                    System.out.println("Você escolheu a MULTIPLICAÇÃO.");
//                    System.out.println("Digite o primeiro valor: ");
//                    num1 = entrada.nextDouble();
//                    System.out.println("Digite o segundo valor:");
//                    num2 = entrada.nextDouble();
//                    total = num1 * num2;
//                    System.out.println("Resultado: " + total);
//                    break;
//                case 0:
//                    System.out.println("Sistema encerrado!");
//                    break;
//                default:
//                    System.out.println("Opção inválida!");
//            }
//        }

        // ========== Atividade 05 ==========
//        int n, i;
//        float total;
//        System.out.println("Digite o numero desejado: ");
//        n = entrada.nextInt();
//        i = n;
//        total = 1;
//        if (n < 0) {
//            System.out.println("Numero inválido!");
//        }
//        while (i > 0) {
//            total = i * total;
//            i = i - 1;
//            System.out.println("Resultado: " + total);
//        }

        // ========== Atividade 06 ==========
//        int num, i, j, sequencia;
//        i = 1;
//        j = 0;
//        sequencia = i + j;
//        System.out.println("Digite o valor desejado para parar a sequência: ");
//        num = entrada.nextInt();
//        if (num < 0) {
//            System.out.println("Número inválido! \nDigite um valor positivo!");
//        } else {
//            System.out.println("A sequência de Fibonacci será: ");
//            while (j <= num) {
//                System.out.println(j);
//                sequencia = i + j;
//                j = i;
//                i = sequencia;
//            }
//        }

        // ========== Atividade 07 ==========
//        boolean primo = true;
//        int i, n;
//        i = 2;
//        System.out.println("Digite o número a ser verificado: ");
//        n = entrada.nextInt();
//        while (i * i <= n) {
//            if (n % i == 0) {
//                primo = false;
//                break;
//            }
//            i++;
//        }
//        if (primo) {
//            System.out.println("O número " + n + " é primo!");
//        } else {
//            System.out.println("O número " + n + " não é primo!");
//        }

        // ========== Atividade 08 ==========
//        double num, total;
//        total = 0;
//        num = 0;
//        while (num >= 0) {
//            System.out.println("Digite o número: ");
//            num = entrada.nextDouble();
//            total = total + num;
//        }
//        System.out.println("A soma total será: " + total);

        // ========== Atividade 10 ==========
//        int n;
//        System.out.print("Digite um número inteiro n > 0: ");
//        n = entrada.nextInt();
//        if (n <= 0) {
//            System.out.println("O número deve ser maior que 0.");
//            return;
//        }
//        System.out.println("Sequência de Collatz:");
//        while (n != 1) {
//            System.out.println(n);
//            if (n % 2 == 0) {
//                n = n / 2;
//            } else {
//                n = 3 * n + 1;
//            }
//        }
//        System.out.println(n);

        entrada.close();
    }
    
}
