package fundamentos;

/**
 * @author V-Renan
 * @date 2/21/2025
 */
public class Inferencia {
    public static void main(String[] args) {

        /**
         * var vai automaticamente inferir o tipo de variavel pelo valor inserido.
         * var tambem precisa ser inicializado no momento em que foi declarado.
         */


        var a = 7.5;
        System.out.println(a);
        System.out.println("(a) é do tipo " + ((Object) a).getClass().getSimpleName());

        var b = 3.9;
        System.out.println(b);

        var c = "Teste";
        System.out.println(c);

        c = "Outro teste";
        System.out.println(c);


    }
}
