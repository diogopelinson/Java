package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    // modificador de acesso: public
    // nao vai retornar nada: void

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    // Parâmetros: Variaveis locais, vivas durante o metodo
    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }
}
