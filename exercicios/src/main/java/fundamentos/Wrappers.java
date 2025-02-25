package fundamentos;

import java.util.Scanner;

/**
 * @author V-Renan
 * @date 25/02/2025
 */
public class Wrappers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // byte
        Byte b = 100;
        Short s = 1000;

        //Integer
        Integer i = Integer.parseInt(scan.next()); // convertendo de String para Integer
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 5);
        System.out.println(l / 3);

        // float
        Float f = 123.10F;
        System.out.println(f);

        // double
        Double d = 1234.5678;
        System.out.println(d);

        // boolean
        Boolean bo = Boolean.parseBoolean("true"); // covertendo um valor String para booleano
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase()); // convertendo de volta para String e usando notação ponto para maiusculo

        Character c = '#'; // char
        System.out.println(c.toString() + "...");

        scan.close();
    }
}
