package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Buck";
        estudante01.idade = 42;
        estudante01.sexo = 'M';

        estudante02.nome = "Azami";
        estudante02.idade = 36;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("####################");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
