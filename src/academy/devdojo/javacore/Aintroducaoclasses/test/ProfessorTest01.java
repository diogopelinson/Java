package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Robertinho";
        professor.idade = 43;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade + " Anos");
        System.out.println(professor.sexo);

        System.out.println("Sou o professor " + professor.nome + ", tenho " + professor.idade + " anos e meu sexo é " + professor.sexo);
    }
}
