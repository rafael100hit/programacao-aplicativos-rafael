/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade03;

/**
 *
 * @author Aluno
 */

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Math.sqrt;
import java.util.Random;
import java.util.Arrays;

public class Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        // Atividade 01
        // int acucar, porcoes, total;
        // acucar = 25;
        // System.out.println("Digite a quatidade de porções desjada: ");
        // porcoes = entrada.nextInt();
        // total = (porcoes * acucar);
        // System.out.println("Seram necessarios " + total + "gr de açucar");

        // Atividade 02
        // int impressora, pagina, total, pgn_minuto;
        // System.out.println("Digite a quantida de impressoras que desejam usar: ");
        // impressora = entrada.nextInt();
        // pagina = 5;
        // pgn_minuto = (impressora * pagina);
        // total = 180 / (pgn_minuto);
        // System.out.println("Tempo total: " + total);

        // Atividade 03
        // int distancia;
        // double km_litro, total_litro;
        // DecimalFormat df = new DecimalFormat("0.000");
        // System.out.println("Digite a distancia em km: ");
        // distancia = entrada.nextInt();
        // km_litro = 13.333;
        // total_litro = (distancia / km_litro);
        // System.out.println("Total em litros: " + df.format(total_litro));

        // Atividade 04
        // int maquinas, pecas, horas;
        // System.out.println("Digite a quantidade de maquinas: ");
        // maquinas = entrada.nextInt();
        // System.out.println("Digite a quantidade de horas: ");
        // horas = entrada.nextInt();
        // pecas = (maquinas * horas) * 30;
        // System.out.println("Serão produzidas: " + pecas + " peças em " + horas + " Horas, por " + maquinas + " Maquinas.");

        // Atividade 05
        // double cotacao, qtt_dolar, reais;
        // System.out.println("Digite a cotação: ");
        // cotacao = entrada.nextDouble();
        // System.out.println("Digite a quantia em dolares: ");
        // qtt_dolar = entrada.nextDouble();
        // reais = (cotacao * qtt_dolar);
        // System.out.println("Você precisará de: R$" + reais + " para comprar " + qtt_dolar + " Dolares.");

        // Atividade 06
        // double a, x, b, q;
        // System.out.println("Digite o valor de A: ");
        // a = entrada.nextDouble();
        // System.out.println("Digite o valor de B: ");
        // b = entrada.nextDouble();
        // x = (-b) / a;
        // q = (a * x) + b;
        // System.out.println("O valor de AX+B= " + q);
        // System.out.println("O valor de A foi: " + a);
        // System.out.println("O valor de B foi: " + b);
        // System.out.println("O valor de X foi: " + x);

        // Atividade 07
        // double m, b, x0, y0;
        // System.out.println("Digite o valor de M: ");
        // m = entrada.nextDouble();
        // System.out.println("Digite o valor de B: ");
        // b = entrada.nextDouble();
        // System.out.println("Digite o valor do ponto x0: ");
        // x0 = entrada.nextDouble();
        // y0 = (m * x0) + b;
        // System.out.println("O ponto y0 será: " + y0);

        // Atividade 08
        // double x1, y1, x2, y2, m, b, y;
        // System.out.println("Digite o valor de x1: ");
        // x1 = entrada.nextDouble();
        // System.out.println("Digite o valor de y1: ");
        // y1 = entrada.nextDouble();
        // System.out.println("Digite o valor de x2: ");
        // x2 = entrada.nextDouble();
        // System.out.println("Digite o valor de y2: ");
        // y2 = entrada.nextDouble();
        // m = (y2 - y1) / (x2 - x1);
        // b = y1 - (m * x1);
        // System.out.println("Y=MX+B \n Y=" + ((m * x1) + b) + " M=" + m + " X=" + x1 + " +B=" + b);

        // Atividade 09
        // double m1, b1, m2, b2, x, y;
        // System.out.println("Digite o valor de m1: ");
        // m1 = entrada.nextDouble();
        // System.out.println("Digite o valor de b1: ");
        // b1 = entrada.nextDouble();
        // System.out.println("Digite o valor de m2: ");
        // m2 = entrada.nextDouble();
        // System.out.println("Digite o valor de b2: ");
        // b2 = entrada.nextDouble();
        // x = (b2 - b1) / (m1 - m2);
        // y = m1 * x + b1;
        // System.out.println("Seu valor de X: " + x + " e o valor de Y: " + y);

        // Atividade 10
        // double a, b, c, delta, x1, x2;
        // System.out.println("Digite o valor de A:");
        // a = entrada.nextDouble();
        // System.out.println("Digite o valor de B:");
        // b = entrada.nextDouble();
        // System.out.println("Digite o valor de C:");
        // c = entrada.nextDouble();
        // delta = (b * b) - (4 * a * c);
        // x1 = (-b + sqrt(delta)) / (2 * a);
        // x2 = (-b - sqrt(delta)) / (2 * a);
        // System.out.println("O valor de Delta será: " + delta + ". O valor de x1 será: " + x1 + ". O valor de x2 será: " + x2);

        // Atividade 11
        // double delta, a, d;
        // System.out.println("Digite o valor de Delta: ");
        // delta = entrada.nextDouble();
        // System.out.println("Digite o valor de A: ");
        // a = entrada.nextDouble();
        // d = Math.abs(sqrt(delta)) / a;
        // System.out.println("Seu resultado: " + d);

        // Atividade 12
        // double a, b, c, x0, fx0, f_linha;
        // System.out.println("Digite o valor de A:");
        // a = entrada.nextDouble();
        // System.out.println("Digite o valor de B:");
        // b = entrada.nextDouble();
        // System.out.println("Digite o valor de C:");
        // c = entrada.nextDouble();
        // System.out.println("Digite o valor de x0:");
        // x0 = entrada.nextDouble();
        // fx0 = (a * (x0 * x0)) + (b * x0) + c;
        // f_linha = (2 * a * x0) + b;
        // System.out.println("O valor de F(x0) será: " + fx0 + ". O valor de F'(x0) será: " + f_linha);

        // Atividade 13
        //double y, m, x, b, x1, x2, y1, y2, a;
        //System.out.println("Digite o valor de M: ");
        //m = entrada.nextDouble();
        //System.out.println("Digite o valor de B: ");
        //b = entrada.nextDouble();
        //System.out.println("Digite o valor de X1: ");
        //x1 = entrada.nextDouble();
        //System.out.println("Digite o valor X2: ");
        //x2 = entrada.nextDouble();
        //y = (m * x1) + b;
        //y1 = (m * x1) + b;
        //y2 = (m * x2) + b;
        //a = ((y1 + y2) / 2) * (x2 - x1);
        //System.out.println("Seu valor de A: " + a);
    }

}