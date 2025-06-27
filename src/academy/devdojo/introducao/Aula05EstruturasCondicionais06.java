package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Usando Switch e dados os valores de 1 a 7 Imprima se e dia util ou final de semana
        // Considerando 1 como domingo

        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Final de semana | Domingo");
                break;
            case 2:
                System.out.println("Dia Util | Segunda");
                break;
            case 3:
                System.out.println("Dia Util | Terca");
                break;
            case 4:
                System.out.println("Dia Util | Quarta");
                break;
            case 5:
                System.out.println("Dia Util | Quinta");
                break;
            case 6:
                System.out.println("Dia Util | Sexta");
                break;
            case 7:
                System.out.println("Final de semana | Sabado");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
