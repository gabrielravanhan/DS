/*
 Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas
efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas
vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. 
 */
package exercício8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###,###,##0.00");

        String nome;

        double sf, tv, c;

        System.out.print("Informe o nome do vendedor: ");
        nome = sc.nextLine();

        System.out.print("Informe o salário fixo de " + nome + ": ");
        sf = sc.nextDouble();

        System.out.print("Informe o total de vendas efetuadas por " + nome + " no mês (em dinheiro):");
        tv = sc.nextDouble();

        c = tv * 0.15;

        System.out.println("\nO nome do vendedor é: " + nome);
        System.out.println("O seu salário fixo é: " + df.format(sf));
        System.out.println("O seu salário final é: " + df.format(sf + c));
    }

}
