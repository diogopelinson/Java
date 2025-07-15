package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

        // metodo VarArgs deixa vc passar o array dentro do metodo como abaixo
        calculadora.somaVarArgs(1,32,3,24,24,24,24,2);
    }
}
