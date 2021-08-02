/*
O custo ao consumidor de um carro novo, é a soma do custo de fábrica com a percentagem do 
revendedor e com o custo dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do 
revendedor seja de 25% do custo de fábrica e que os impostos custam 45 % do custo de fábrica, faça um 
algoritmo que leia o valor de custo de fábrica e determine o preço final do automóvel (custo ao 
consumidor). 
 */
package procedure_function;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Procedure_Function {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cf, pr, i;

        System.out.print("Informe o custo de fábrica do veículo: ");
        cf = sc.nextDouble();

        pr = calculaPercentagemRevendedor(cf);

        i = calculaImpostos(cf);

        determinaPrecoFinal(cf, pr, i);
    }

    private static double calculaPercentagemRevendedor(double cf) {
        return cf * 0.25;
    }

    private static double calculaImpostos(double cf) {
        return cf * 0.45;
    }

    private static void determinaPrecoFinal(double cf, double pr, double i) {
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        
        System.out.println("\nO preço final é: " + df.format(cf + pr + i));
    }
}
