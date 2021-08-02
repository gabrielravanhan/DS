/*
Utilizando Java monte uma calculadora que efetue as operações de Soma, Subtração, Multiplicação e Divisão,
e que fique em loop até que seja selecionado uma opção de saida do programa.
 */
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, resultado;
        int opcao;

        System.out.print("Digite o 1° número: ");
        n1 = sc.nextDouble();

        System.out.print("\nDigite o 2° número: ");
        n2 = sc.nextDouble();

        System.out.print("\nEscolha alguma das seguites opções:"
                + "\n1 = +; \n2 = -; \n3 = *; \n4 = /; \n5 = sair. \nOpção: ");
        opcao = sc.nextInt();

        while (opcao != 5) {
            if (opcao == 1) {
                resultado = n1 + n2;
                System.out.print("\nO resultado da operação " + n1 + " + " + n2 + " é: " + resultado);
            } else {
                if (opcao == 2) {
                    resultado = n1 - n2;
                    System.out.print("\nO resultado da operação " + n1 + " - " + n2 + " é: " + resultado);
                } else {
                    if (opcao == 3) {
                        resultado = n1 * n2;
                        System.out.print("\nO resultado da operação " + n1 + " * " + n2 + " é: " + resultado);
                    } else {
                        if (opcao == 4) {
                            resultado = n1 / n2;
                            System.out.print("\nO resultado da operação " + n1 + " / " + n2 + " é: " + resultado);
                        } else {
                            System.out.print("\nEssa opção existe!!! \nInforme tudo novamente!!!");
                        }
                    }
                }
            }

            System.out.print("\n\nDigite o 1° número: ");
            n1 = sc.nextDouble();

            System.out.print("\nDigite o 2° número: ");
            n2 = sc.nextDouble();
            
            System.out.print("\n\nEscolha alguma das seguites opções:"
                    + "\n1 = +; \n2 = -; \n3 = *; \n4 = /; \n5 = sair. \nOpção: ");
            opcao = sc.nextInt();
        }

        System.out.println("\nVocê escolheu sair, então o algoritmo da Calculadora Java terminou!!!");
    }

}
