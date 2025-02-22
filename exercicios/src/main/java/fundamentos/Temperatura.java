package fundamentos;

import java.util.Scanner;

/**
 * @author V-Renan
 * @date 21/02/2025
 */
public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // (Fº -32) * 5/9 = ºC
        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;

        System.out.print("Digite um valor em fahrenheit: ");
        double valorFahrenheit = scan.nextDouble();

        double calc = (valorFahrenheit - AJUSTE) * FATOR;

        System.out.printf("%.2f Fahrenheit equivalem a %.2f Celsius.",valorFahrenheit, calc);
        scan.close();
    }
}
