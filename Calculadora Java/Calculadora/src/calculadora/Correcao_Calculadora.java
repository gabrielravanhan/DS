package calculadora;

import java.util.Scanner;

public class Correcao_Calculadora {

    public static void main(String args[]) {
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        int operacao;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite a operação desejada:");
            System.out.println("1.Soma");
            System.out.println("2.Subtração");
            System.out.println("3.Multiplicação");
            System.out.println("4.Divisão");
            System.out.println("0.Sair");
            System.out.print("Operação: ");
            operacao = entrada.nextInt();

            if (operacao != 0) {
                System.out.println("Digite o primeiro número:");
                num1 = entrada.nextDouble();

                System.out.println("Digite o segundo número:");
                num2 = entrada.nextDouble();

                switch (operacao) {
                    case 1: //soma
                        resultado = num1 + num2;
                        break;
                    case 2: //subratação
                        resultado = num1 - num2;
                        break;
                    case 3: //multiplicação
                        resultado = num1 * num2;
                        break;
                    case 4: //divisão
                        resultado = num1 / num2;
                        break;
                }
            }
            if (operacao > 4) {
                System.out.println("Pare de gracinha >(");
            } else {
                //if (operacao !=0){
                System.out.println("O resultado da operação é: " + resultado);
                //}
            }

        } while (operacao != 0);
    }
}
