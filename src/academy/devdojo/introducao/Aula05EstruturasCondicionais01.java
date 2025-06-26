package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;


        if (isAutorizadoComprarBebida != false) {
            System.out.println("Liberado, pode comprar a bebida alcolica!");
        }else{
            System.out.println("Menor de idade, nao pode comprar a bebida!");
        }


        // !
        if (!isAutorizadoComprarBebida) {
            System.out.println("Menor de idade, nao pode comprar a bebida!");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }


    }
}
