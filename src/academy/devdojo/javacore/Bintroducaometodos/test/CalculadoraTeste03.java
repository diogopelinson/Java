package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("----------------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(85,0);
    }
}
