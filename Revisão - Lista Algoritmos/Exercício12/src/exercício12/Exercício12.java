/*
Faça um algoritmo que leia uma temperatura em Graus Fahrenheits e mostre a temperatura em Graus
Celsius. Para isso use a fórmula: 
Celsius = (fahreheit - 32) * (5 / 9)
 */
package exercício12;

import java.util.Scanner;

public class Exercício12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fahreheit;

        System.out.print("Informe a temoeratura em Graus Fahrenheits: ");
        fahreheit = sc.nextInt();

        System.out.println("\nA temperatura em Graus Celsius é: " + (fahreheit - 32) * (5 / 9));
    }

}
