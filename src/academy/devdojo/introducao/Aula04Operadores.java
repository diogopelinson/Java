package academy.devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        // % : resto
        int resto = 21 % 7; // Par ou Impar
        System.out.println(resto);

        // <  >  <=  >=  ==  !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        boolean isDezMaiorOuIgualAVinte = 10 >= 20;
        boolean notIsDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte: " + isDezDiferenteDeVinte);
        System.out.println("isDezMaiorOuIgualAVinte: " + isDezMaiorOuIgualAVinte);
        System.out.println("notIsDezMaiorQueVinte: " + notIsDezMaiorQueVinte);


        // Operadores Logicos,  && (AND)  ,  || (OR)  ,  !
        int idade = 35;
        float salario = 5000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayCinco = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlayCinco || valorTotalContaPoupanca >= valorPlayCinco;

        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);


        // Operadores Atribuicao, =   +=   -=   *=   /=   %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Total: " + bonus);

        //++ --
        int cont = 0;
        cont++;
        cont--;
        ++cont;
        --cont;
        System.out.println(cont);

    }
}
