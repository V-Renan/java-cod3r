package fundamentos;

/**
 * @author V-Renan
 * @date 2/21/2025
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informacoes do funcionario


        // Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_707_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere (so aceita uma unica letra/simbolo)
        char status = 'A';

        // Dias de empresa
        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

        // numeros de viagens
        System.out.println("Numero de viagens: " + numeroDeVoos / 2);

        // Pontos por real
        System.out.println("Para cada real vendido o funcionario ganha: " + pontosAcumulados / vendasAcumuladas);

        System.out.println(id + " Ganha -> " + salario);
        System.out.println("Ferias: " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
