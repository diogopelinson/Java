package academy.devdojo.introducao;
// Atalho psvm
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos Primitivos: int, double, float, char, byte, shot, long, boolean

        int idade2 = 20;
        int idade = (int) 10000000000L; // 4 bytes, 32 bits casting
        long numero = (long) 155.23; // 8 bytes, 64 bits
        double salarioDouble = 2000.0D; // 8 bytes, 64 bits
        float salarioFloat = 25.000F; // 4 bytes, 32 bits
        byte idadeByte = 127; // 1 byte, 8 bits
        short idadeShort = 32000; // 2 bytes, 16 bits
        boolean verdadeiro = true; // 1 byte, 8 bits
        boolean falso = false; // 1 byte, 8 bits
        char caractere = '\u0042'; // 2 byte, 16 bits Baseado na tabela Ascii ou unicode

        // String nao é um tipo primitivo, é uma classe
        String nome = "Diogo";
        String texto = "Grande texto";


        System.out.println("A idade do pai é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("idadeByte "+idadeByte);
        System.out.println(numero);
        System.out.println("Oi, meu nome é " + nome);
    }
}
