/*
Considerando que para um consórcio, sabe-se o número total de prestações, a 
quantidade de prestações pagas e o valor atual da prestação, escreva um 
algoritmo que determine o total pago pelo consorciado e o saldo devedor.
 */
package exercício5;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercício5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        int qt, qp, pnp;
        double v;
        
        System.out.print("Informe o número total de prestações: ");
        qt = sc.nextInt();
        
        System.out.print("Informe o número de prestações pagas : ");
        qp = sc.nextInt();
        
        System.out.print("Informe o valor atual da prestação: ");
        v = sc.nextDouble();
        
        pnp = qt - qp;
        
        System.out.println("O saldo devedor é: " + df.format(pnp * v));
        System.out.println("Ele já pagou: " + df.format(qp * v));

    }
    
}
