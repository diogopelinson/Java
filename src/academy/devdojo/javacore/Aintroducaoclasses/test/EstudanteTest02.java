package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Obito";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("--------------");

        estudante2.nome = "Gaara";
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);


    }
}
