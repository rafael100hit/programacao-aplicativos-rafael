package atividade02;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade_02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // ================== Atividade 01 ==================
        /*
        double raio, circ, area;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = entrada.nextDouble();

        area = Math.PI * (Math.pow(raio, 2));
        circ = 2 * Math.PI * raio;

        System.out.println("Área: " + area);
        System.out.println("Circunferência: " + circ);
        */

        // ================== Atividade 02 ==================
        /*
        double imc, peso, altura;
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.print("Digite seu peso em KG: ");
        peso = entrada.nextDouble();

        System.out.print("Digite sua altura em Metros: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);
        System.out.println("Seu IMC será: " + df.format(imc));
        */

        // ================== Atividade 03 ==================
        /*
        double cat1, cat2, hipo, raiz;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor do primeiro cateto: ");
        cat1 = entrada.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        cat2 = entrada.nextDouble();

        hipo = (cat1 * cat1) + (cat2 * cat2);
        raiz = Math.sqrt(hipo);

        System.out.println("Sua Hipotenusa será: " + df.format(raiz));
        */

        // ================== Atividade 04 ==================
        /*
        double real, dolar, cotacao, troco;
        int val_cot;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor em R$ a ser convertido: ");
        real = entrada.nextDouble();

        dolar = 5.32;

        cotacao = (real / dolar);
        val_cot = (int) Math.round(cotacao);

        System.out.print("Com R$" + real);
        System.out.println(" você consegue: US$" + val_cot);

        troco = real - (val_cot * dolar);
        System.out.println("Troco: R$" + df.format(troco));
        */

        // ================== Atividade 05 ==================
        /*
        int escolha, dado;
        
        System.out.print("Digite a quantidade de rodadas: ");
        escolha = entrada.nextInt();

        Random rodada = new Random();
        for (int i = 0; i < escolha; i++) {
            dado = rodada.nextInt(6) + 1;
            System.out.println("Rodada " + (i + 1) + ": " + dado);
        }
        */

        entrada.close();
    }
}
