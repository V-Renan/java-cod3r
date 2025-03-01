package fundamentos.operadores;

/**
 * @author V-Renan
 * @date 2/25/2025
 */
public class DesafioAritimeticos {
    public static void main(String[] args) {

        int F1 = (6 * (3 + 2));
        double calculoF1 = Math.pow(F1, 2) / (3 * 2);

        int F2 = ((1 - 5) * (2 - 7));
        double calculoF2 = Math.pow((double) F2 / 2, 2);

        int resultadoParcial = (int) (calculoF1 - calculoF2);

        int resultadoFinal = (int) (Math.pow(resultadoParcial, 3) / Math.pow(10, 3));

        System.out.printf("Resultado Final: %d", resultadoFinal);
    }
}
