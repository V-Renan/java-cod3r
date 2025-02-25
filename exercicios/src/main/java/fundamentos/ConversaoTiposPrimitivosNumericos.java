package fundamentos;

/**
 * @author V-Renan
 * @date 25/02/2025
 */
public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1.123456788888; // implicita
        System.out.println(a);

        float b = (float) 1.1234588888; // explicita (CAST)
        System.out.println(b);

        int c = 4; // explicita (CAST)
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999999; // explicita (CAST)
        int f = (int) e;
        System.out.println(f);
    }
}
