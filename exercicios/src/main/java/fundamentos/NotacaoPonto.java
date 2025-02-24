package fundamentos;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * @author V-Renan
 * @date 22/02/2025
 */
public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X".toUpperCase().replace("X", "Senhora");
        // s = s.toUpperCase();
        // s.replace("X", "!");
        System.out.println(s.concat("!!!"));

        String x = "Victor".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "Renan")
                .toUpperCase();
        System.out.println(y);

        // Tipos primitivos nao tem operador "."

        int a = 3;
        //a.
    }
}
