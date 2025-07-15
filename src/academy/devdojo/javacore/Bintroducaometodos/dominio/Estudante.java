package academy.devdojo.javacore.Bintroducaometodos.dominio;

// Dentro do Objeto

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // Referência this(esse)
    public void imprime(){
        System.out.println("----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
