package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Buck";
        estudante01.idade = 42;
        estudante01.sexo = 'M';

        estudante02.nome = "Azami";
        estudante02.idade = 36;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
