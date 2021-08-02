/*
O custo ao consumidor de um carro novo, é a soma do custo de fábrica com a
percentagem do revendedor e com o custo dos impostos (aplicados ao custo de
fábrica). Supondo que a percentagem do revendedor seja de 25% do custo de
fábrica e que os impostos custam 45 % do custo de fábrica, faça um algoritmo que
leia o valor de custo de fábrica e determine o preço final do automóvel (custo ao consumidor)
 */
package exercício7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###,###,##0.00");

        double pf, pr, i;

        System.out.print("Informe o preço de fábrica do automóvel: ");
        pf = sc.nextDouble();

        pr = pf * 0.25;
        i = pf * 0.45;

        System.out.println("\nO preço final do automóvel é: " + df.format(pf + pr + i));
    }

}
