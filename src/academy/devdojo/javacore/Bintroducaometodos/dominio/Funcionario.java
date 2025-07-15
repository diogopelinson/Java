package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;


    public void imprimeFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario == null) {
            return;
        }
        for (int i = 0; i < salario.length; i++) {
            System.out.println("Salario: " + salario[i]);
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if (salario == null) {
            return;
        }
        double soma = 0;
        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }
        double media = soma / salario.length;
        System.out.println("Media dos salario: " + media);


    }

}