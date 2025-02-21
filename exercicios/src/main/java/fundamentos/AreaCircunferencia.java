package fundamentos;

/**
 * @author V-Renan
 * @date 21/02/2025
 */
public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println("resultado: " + area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área: " + area + "m2.");

    }
}
