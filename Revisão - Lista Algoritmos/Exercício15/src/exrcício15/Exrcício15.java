/*
15. Escreva um algoritmo que calcule a quantidade de latas de tinta necessárias e o custo para pintar
tanques cilíndricos de combustível, onde são fornecidos a altura (h) e o raio (r) desse cilindro. Sabe-se que
a lata de tinta anticorrosiva custa R$ 40.00, cada lata contém 5 litros e cada litro pinta-se 3 metros
quadrados na média. Para que fique bem coberto de tinta, há necessidade de 2 demãos.
Portanto:
1) A lata de tinta custa R$ 40,00;
2) Cada lata contém 5 litros;
3) A cada litro de tinta pinta-se 3 metros quadrados.
Dados de entrada: altura (H) e raio (R).
Dados de saída: custo (C) e quantidade (QTDE). Utilizando o planejamento reverso, sabemos que:
• Custo é dado por quantidade de latas * 40,00;
• Quantidade de latas é dada por quantidade total de litros/5;
• A quantidade total de litros é dada por área do cilindro/3 * 2;
• Área do cilindro é dada por área da base + área lateral;
• Área da base é (P1 * EXP(R,2));
• A área lateral é altura * comprimento: (2 * P1 * R * H);
• Sendo que R (raio) e H (altura) são dados de entrada e P1 é urna constante de valor conhecido:
3,14. 
 */
package exrcício15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exrcício15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###,###,##0.00");

        double h, r, a_l, a_b, a_c, quant_lit, quant_lat;

        System.out.print("Informe a altura dos tanques cilídricos de combustível: ");
        h = sc.nextDouble();

        System.out.print("Informe o raio dos tanques cilídricos de combustível: ");
        r = sc.nextDouble();

        a_l = h * (2 * 3.14 * r * h);

        a_b = 3.14 * Math.pow(r, 2);

        a_c = a_b + a_l;

        quant_lit = a_c / 3 * 2;

        quant_lat = quant_lit / 5;

        System.out.println("\nA quantidade total de litros é: " + df.format(quant_lit));
        System.out.println("O custo é de: R$ " + df.format(quant_lat * 40));
    }

}
