package academy.devdojo.javacore.Bintroducaometodos.test;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Diogo");
        funcionario.setIdade(18);
        funcionario.setSalario(new double[]{2250.50, 1345.50, 745.20});

        funcionario.imprimeFuncionario();



    }



}
