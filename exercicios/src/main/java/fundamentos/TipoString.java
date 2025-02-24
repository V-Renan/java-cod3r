package fundamentos;

/**
 * @author V-Renan
 * @date 2/23/2025
 */
public class TipoString {
    public static void main(String[] args) {
        System.out.println("Ola mundo!".charAt((4)));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!");
        System.out.println("Inicia com [Boa]: " + s.startsWith("Boa"));
        System.out.println("Inicia com [boa] em minusculo: " + s.toLowerCase().startsWith("boa"));
        System.out.println("Termina com [TARDE]: " + s.endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("Boa tarde"));

        var nome = "Renan";
        var sobrenome = "Moura";
        var idade = 25;
        var salario = 1.412;

        System.out.printf("""
                Nome: %s
                Sobrenome: %s
                Idade: %d
                Salario R$%.3f
                """, nome, sobrenome, idade, salario);

        String frase = "The best game is God of War";
        System.out.println(frase);
        System.out.println(frase.toLowerCase().contains("war"));
        System.out.println(frase.indexOf("God"));
        System.out.println(frase.substring(17));
        System.out.println(frase.substring(17, 20));
    }
}
