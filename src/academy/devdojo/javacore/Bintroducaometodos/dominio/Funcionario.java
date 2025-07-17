package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double soma;


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
        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }
        double media = soma / salario.length;
        System.out.println("Media dos salario: " + media);


    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getSoma() {
        return soma;
    }
}