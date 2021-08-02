/*
Analisando a fórmula "Prestação = valor + (valor * (taxa/100) * tempo)", crie um algoritmo para
efetuar o cálculo do valor de uma prestação em atraso. (Você deverá ler o VALOR da prestação, a TAXA de
juros imposta pelo banco, e o número de dias em ATRASO.
 */
package execício10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Execício10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###,###,##0.00");

        double valor;
        int taxa, tempo;

        System.out.print("Informe o valor da prestação: ");
        valor = sc.nextDouble();

        System.out.print("Informe a taxa de juros imposta pelo banco: ");
        taxa = sc.nextInt();

        System.out.print("Informe o número de dias em atraso: ");
        tempo = sc.nextInt();

        System.out.println("\nO valor da prestação em atraso é: " + df.format(valor + (valor * (taxa / 100) * tempo)));
    }

}
