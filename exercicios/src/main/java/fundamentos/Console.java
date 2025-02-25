package fundamentos;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * @author V-Renan
 * @date 25/02/2025
 */
public class Console {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.printf("""
                Nome: %s
                Sobrenome: %s
                Idade: %d
                """, nome, sobrenome, idade);

        scan.close();
    }
}
