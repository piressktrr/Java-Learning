package pedro.ProjetoJava.exerciciosRevisaoIntensivo;

import pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios.funcionario010Intensivo;

import java.util.Scanner;

public class exercicio010Intensivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        funcionario010Intensivo funcionario1 = new funcionario010Intensivo();
        funcionario010Intensivo funcionario2 = new funcionario010Intensivo();
        funcionario010Intensivo funcionario3 = new funcionario010Intensivo();

        funcionario1.nome = "pedro";
        funcionario2.nome = "Maria";
        funcionario3.nome = "Joao";

        funcionario1.idade = 20;
        funcionario2.idade = 21;
        funcionario3.idade = 22;

        funcionario1.salario = new double[]{1000,2000,3000};
        funcionario2.salario = new double[]{3000,4000,5000};
        funcionario3.salario = new double[]{5000,6000,7000};


        funcionario1.imprimir();
        System.out.println("Média salarial: R$"+funcionario1.mediaSalario());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");

        funcionario2.imprimir();
        System.out.println("Média salarial: R$"+funcionario2.mediaSalario());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");
        funcionario3.imprimir();
        System.out.println("Média salarial: R$"+funcionario3.mediaSalario());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=");

    }

}
