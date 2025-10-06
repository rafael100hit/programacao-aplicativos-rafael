package atividade03;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class Atividade_03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // ================== Atividade 01 ==================
        /*
        int acucar, porcoes, total;
        acucar = 25;
        System.out.print("Digite a quantidade de porções desejada: ");
        porcoes = entrada.nextInt();
        total = porcoes * acucar;
        System.out.println("Serão necessários " + total + "g de açúcar");
        */

        // ================== Atividade 02 ==================
        /*
        int impressora, pagina, total, pgn_minuto;
        System.out.print("Digite a quantidade de impressoras que desejam usar: ");
        impressora = entrada.nextInt();
        pagina = 5;
        pgn_minuto = impressora * pagina;
        total = 180 / pgn_minuto;
        System.out.println("Tempo total: " + total + " minutos");
        */

        // ================== Atividade 03 ==================
        /*
        int distancia;
        double km_litro, total_litro;
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.print("Digite a distância em km: ");
        distancia = entrada.nextInt();

        km_litro = 13.333;
        total_litro = distancia / km_litro;
        System.out.println("Total em litros: " + df.format(total_litro));
        */

        // ================== Atividade 04 ==================
        /*
        int maquinas, pecas, horas;
        System.out.print("Digite a quantidade de máquinas: ");
        maquinas = entrada.nextInt();
        System.out.print("Digite a quantidade de horas: ");
        horas = entrada.nextInt();
        pecas = (maquinas * horas) * 30;
        System.out.println("Serão produzidas: " + pecas + " peças em " + horas + " horas, por " + maquinas + " máquinas.");
        */

        // ================== Atividade 05 ==================
        /*
        double cotacao, qtt_dolar, reais;
        System.out.print("Digite a cotação: ");
        cotacao = entrada.nextDouble();
        System.out.print("Digite a quantia em dólares: ");
        qtt_dolar = entrada.nextDouble();
        reais = cotacao * qtt_dolar;
        System.out.println("Você precisará de: R$" + reais + " para comprar " + qtt_dolar + " dólares.");
        */

        // ================== Atividade 06 ==================
        /*
        double a, b, x, q;
        System.out.print("Digite o valor de A: ");
        a = entrada.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = entrada.nextDouble();
        x = -b / a;
        q = (a * x) + b;
        System.out.println("O valor de AX+B= " + q);
        System.out.println("A = " + a + ", B = " + b + ", X = " + x);
        */

        // ================== Atividade 07 ==================
        /*
        double m, b, x0, y0;
        System.out.print("Digite o valor de M: ");
        m = entrada.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = entrada.nextDouble();
        System.out.print("Digite o valor do ponto x0: ");
        x0 = entrada.nextDouble();
        y0 = (m * x0) + b;
        System.out.println("O ponto y0 será: " + y0);
        */

        // ================== Atividade 08 ==================
        /*
        double x1, y1, x2, y2, m, b;
        System.out.print("Digite x1: "); x1 = entrada.nextDouble();
        System.out.print("Digite y1: "); y1 = entrada.nextDouble();
        System.out.print("Digite x2: "); x2 = entrada.nextDouble();
        System.out.print("Digite y2: "); y2 = entrada.nextDouble();
        m = (y2 - y1) / (x2 - x1);
        b = y1 - (m * x1);
        System.out.println("Equação da reta: Y = " + m + "X + " + b);
        */

        // ================== Atividade 09 ==================
        /*
        double m1, b1, m2, b2, x, y;
        System.out.print("Digite m1: "); m1 = entrada.nextDouble();
        System.out.print("Digite b1: "); b1 = entrada.nextDouble();
        System.out.print("Digite m2: "); m2 = entrada.nextDouble();
        System.out.print("Digite b2: "); b2 = entrada.nextDouble();
        x = (b2 - b1) / (m1 - m2);
        y = m1 * x + b1;
        System.out.println("Interseção: X = " + x + ", Y = " + y);
        */

        // ================== Atividade 10 ==================
        /*
        double a, b, c, delta, x1, x2;
        System.out.print("Digite A: "); a = entrada.nextDouble();
        System.out.print("Digite B: "); b = entrada.nextDouble();
        System.out.print("Digite C: "); c = entrada.nextDouble();
        delta = (b * b) - (4 * a * c);
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Delta: " + delta + ", x1: " + x1 + ", x2: " + x2);
        */

        // ================== Atividade 11 ==================
        /*
        double delta, a, d;
        System.out.print("Digite Delta: "); delta = entrada.nextDouble();
        System.out.print("Digite A: "); a = entrada.nextDouble();
        d = Math.abs(Math.sqrt(delta)) / a;
        System.out.println("Resultado: " + d);
        */

        // ================== Atividade 12 ==================
        /*
        double a, b, c, x0, fx0, f_linha;
        System.out.print("Digite A: "); a = entrada.nextDouble();
        System.out.print("Digite B: "); b = entrada.nextDouble();
        System.out.print("Digite C: "); c = entrada.nextDouble();
        System.out.print("Digite x0: "); x0 = entrada.nextDouble();
        fx0 = (a * x0 * x0) + (b * x0) + c;
        f_linha = (2 * a * x0) + b;
        System.out.println("F(x0) = " + fx0 + ", F'(x0) = " + f_linha);
        */

        // ================== Atividade 13 ==================
        /*
        double y, m, x1, x2, y1, y2, a;
        double b;
        System.out.print("Digite M: "); m = entrada.nextDouble();
        System.out.print("Digite B: "); b = entrada.nextDouble();
        System.out.print("Digite X1: "); x1 = entrada.nextDouble();
        System.out.print("Digite X2: "); x2 = entrada.nextDouble();
        y1 = (m * x1) + b;
        y2 = (m * x2) + b;
        a = ((y1 + y2) / 2) * (x2 - x1);
        System.out.println("Área sob a reta: " + a);
        */

        entrada.close();
    }
}
