package academy.devdojo.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // Formas de iniciar o Array
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        // Foreach
        for (int num : numeros3) {
            System.out.println(num);
        }

    }
}
