package academy.devdojo.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][]; // Todos aqui estao fazendo referencia ao espaco em memoria

        // O Array esta declarando que faz referencia para outros N arrays
        arrayInt[0] = new int[]{1, 2}; // 2 novos arrays dentro do array principal na posicao 0 e valem 0 pois e inteiro
        arrayInt[1] = new int[]{1, 2, 3}; // 3 novos arrays dentro do array principal na posicao 1 e valem 0 pois e inteiro
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6}; // 6 novos arrays dentro do array principal na posicao 2 e valem 0 pois e inteiro

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};


        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }

        }

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }

        }
    }
}
