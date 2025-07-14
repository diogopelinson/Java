package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Mustang";
        carro01.modelo = "GT";
        carro01.ano = 2025;

        carro02.nome = "Ram";
        carro02.modelo = "Laramie Night Edition 3500";
        carro02.ano = 2024;

        carro02 = carro01;

        System.out.println("Nome: " + carro01.nome + " | Modelo: " + carro01.modelo + " | Ano: " + carro01.ano);
        System.out.println("Nome: " + carro02.nome + " | Modelo: " + carro02.modelo + " | Ano: " + carro02.ano);


    }
}
