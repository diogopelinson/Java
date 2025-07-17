package academy.devdojo.javacore.Bintroducaometodos.dominio;


// Modificador de acesso: privado, so pode ser acessado dentro do mesmo objeto
public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // Toda vez que criar um metodo para colocar um atributo em memoria comecar a palavra por set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }

    // Get
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}
