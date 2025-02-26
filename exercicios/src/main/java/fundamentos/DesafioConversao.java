package fundamentos;

import java.util.Scanner;

/**
 * @author V-Renan
 * @date 2/25/2025
 */
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro salario: ");
        String valor1 = scan.nextLine().replace(",", ".");
        System.out.print("Digite o segundo salario: ");
        String valor2 = scan.nextLine().replace(",", ".");
        System.out.print("Digite o terceiro salario: ");
        String valor3 = scan.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double soma = salario1 + salario2 + salario3;
        double resultado = soma / 3;

        System.out.printf("Media salarial: R$ %.2f", resultado);

        scan.close();
    }
}
