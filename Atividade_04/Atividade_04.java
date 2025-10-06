/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade_04;

/**
 *
 * @author Aluno
 */

import java.util.Scanner;
import java.lang.Math;

public class Atividade_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in);

        // ================== Atividade 01 ==================
        /*
        double num;
        System.out.print("Digite o número desejado: ");
        num = entrada.nextDouble();

        if (num < 0) {
            System.out.println("Você digitou o número " + num + " e ele é negativo!");
        } else {
            System.out.println("Você digitou o número " + num + " e ele é positivo!");
        }
        */

        // ================== Atividade 02 ==================
        /*
        double num;
        System.out.print("Digite o número desejado: ");
        num = entrada.nextDouble();

        if (num < 0) {
            System.out.println("Você digitou o número " + num + " e ele é negativo!");
        } else if (num == 0) {
            System.out.println("O número digitado é Zero!");
        } else {
            System.out.println("Você digitou o número " + num + " e ele é positivo!");
        }
        */

        // ================== Atividade 03 ==================
        /*
        double nota1, nota2, nota3, media;
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
        */

        // ================== Atividade 04 ==================
        /*
        double nota1, nota2, nota3, media;
        System.out.print("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em recuperação.");
        }
        */

        // ================== Atividade 05 ==================
        /*
        int num;
        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número digitado é Par.");
        } else {
            System.out.println("O número digitado é Ímpar.");
        }
        */

        // ================== Atividade 06 ==================
        /*
        double num1, num2, num3;
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();
        System.out.print("Digite o terceiro número: ");
        num3 = entrada.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
        */

        // ================== Atividade 07 ==================
        /*
        int idade;
        System.out.print("Digite a idade do nadador: ");
        idade = entrada.nextInt();

        if (idade < 9) {
            System.out.println("Categoria Mirim.");
        } else if (idade < 14) {
            System.out.println("Categoria Infantil.");
        } else if (idade < 18) {
            System.out.println("Categoria Juvenil.");
        } else {
            System.out.println("Categoria Adulto.");
        }
        */

        // ================== Atividade 08 ==================
        /*
        double num1, num2, soma;
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();

        soma = num1 + num2;

        if (soma > 20) {
            System.out.println("Soma = " + soma + ", resultado = " + (soma + 8));
        } else {
            System.out.println("Soma = " + soma + ", resultado = " + (soma - 5));
        }
        */

        // ================== Atividade 09 ==================
        /*
        double venda, lucro;
        System.out.print("Digite o preço do produto: ");
        venda = entrada.nextDouble();

        lucro = venda / 100;

        if (venda < 20) {
            System.out.println("Valor de venda: R$" + ((lucro * 45) + venda));
        } else {
            System.out.println("Valor de venda: R$" + ((lucro * 30) + venda));
        }
        */

        // ================== Atividade 10 ==================
        /*
        int quantidade;
        double maca, compra;
        System.out.print("Digite a quantidade de maçãs: ");
        quantidade = entrada.nextInt();

        if (quantidade < 12) {
            maca = 0.25;
        } else {
            maca = 0.30;
        }
        compra = quantidade * maca;
        System.out.println("Valor total da compra: R$" + compra);
        */

        // ================== Atividade 11 ==================
        /*
        int sexo;
        double altura, peso;
        System.out.print("Digite seu sexo (1-Feminino, 2-Masculino): ");
        sexo = entrada.nextInt();

        switch (sexo) {
            case 1:
                System.out.print("Digite sua altura: ");
                altura = entrada.nextDouble();
                peso = (65.1 * altura) - 44.7;
                System.out.println("Peso ideal: " + peso + " Kg.");
                break;
            case 2:
                System.out.print("Digite sua altura: ");
                altura = entrada.nextDouble();
                peso = (72.7 * altura) - 58;
                System.out.println("Peso ideal: " + peso + " Kg.");
                break;
            default:
                System.out.println("Digite apenas 1 para feminino ou 2 para masculino.");
        }
        */

        // ================== Atividade 12 ==================
        /*
        int num;
        System.out.print("Digite o dia da semana (1 a 7): ");
        num = entrada.nextInt();

        switch (num) {
            case 1 -> System.out.println("Domingo - final de semana");
            case 2 -> System.out.println("Segunda-feira - dia útil");
            case 3 -> System.out.println("Terça-feira - dia útil");
            case 4 -> System.out.println("Quarta-feira - dia útil");
            case 5 -> System.out.println("Quinta-feira - dia útil");
            case 6 -> System.out.println("Sexta-feira - dia útil");
            case 7 -> System.out.println("Sábado - final de semana");
            default -> System.out.println("Número inválido!");
        }
        */

        // ================== Atividade 13 ==================
        /*
        int codigo, quantidade;
        double total = 0, preco;
        System.out.println("Produtos disponíveis: \nDetergente - R$1,59 \nEsponja - R$4,59 \nLã de aço - R$1,79");
        System.out.print("Digite o código do produto (100-Detergente, 101-Esponja, 102-Lã de aço, 4-Exibir total): ");
        codigo = entrada.nextInt();

        switch (codigo) {
            case 100 -> {
                System.out.print("Quantidade desejada: ");
                quantidade = entrada.nextInt();
                total += 1.59 * quantidade;
                System.out.println("Total: R$" + total);
            }
            case 101 -> {
                System.out.print("Quantidade desejada: ");
                quantidade = entrada.nextInt();
                total += 4.59 * quantidade;
                System.out.println("Total: R$" + total);
            }
            case 102 -> {
                System.out.print("Quantidade desejada: ");
                quantidade = entrada.nextInt();
                total += 1.79 * quantidade;
                System.out.println("Total: R$" + total);
            }
            case 4 -> System.out.println("Total acumulado: R$" + total);
            default -> System.out.println("Número inválido!");
        }
        */

        // ================== Atividade 14 ==================
        /*
        int operacao;
        double num1, num2, total;
        System.out.println("Escolha a operação: \n1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão");
        operacao = entrada.nextInt();

        switch (operacao) {
            case 1 -> {
                System.out.print("Primeiro valor: "); num1 = entrada.nextDouble();
                System.out.print("Segundo valor: "); num2 = entrada.nextDouble();
                total = num1 + num2;
                System.out.println("Resultado: " + total);
            }
            case 2 -> {
                System.out.print("Primeiro valor: "); num1 = entrada.nextDouble();
                System.out.print("Segundo valor: "); num2 = entrada.nextDouble();
                total = num1 - num2;
                System.out.println("Resultado: " + total);
            }
            case 3 -> {
                System.out.print("Primeiro valor: "); num1 = entrada.nextDouble();
                System.out.print("Segundo valor: "); num2 = entrada.nextDouble();
                total = num1 * num2;
                System.out.println("Resultado: " + total);
            }
            case 4 -> {
                System.out.print("Primeiro valor: "); num1 = entrada.nextDouble();
                System.out.print("Segundo valor: "); num2 = entrada.nextDouble();
                if (num2 != 0) {
                    total = num1 / num2;
                    System.out.println("Resultado: " + total);
                } else {
                    System.out.println("O divisor não pode ser zero!");
                }
            }
            default -> System.out.println("Opção inválida!");
        }
        */

        entrada.close();
    }
    
}
