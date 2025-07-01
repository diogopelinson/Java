package academy.devdojo.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Tipos de inicializacao do objeto(array) na memoria
        // byte, short, int, long, float e double = 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Gaara";
        nomes[1] = "Sasuke";
        nomes[2] = "Obito";
        nomes[3] = "Mira";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[5];

    }
}
