/*
Construa um algoritmo que leia o nome de um aluno e três notas obtidas durante o
semestre, ao final mostre o nome do aluno e a média aritmética das notas.
 */
package exercício6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###,##0.00");

        double n1, n2, n3;
        String nome;

        System.out.print("O nome do aluno: ");
        nome = sc.next();

        System.out.print("\nInforme a 1° nota de " + nome + ": ");
        n1 = sc.nextDouble();

        System.out.print("Informe a 2° nota de " + nome + ": ");
        n2 = sc.nextDouble();

        System.out.print("Informe a 3° nota de " + nome + ": ");
        n3 = sc.nextDouble();

        System.out.println("\nA média aritmética de "+nome+" é: " + df.format((n1 + n2 + n3) / 3));
    }

}
