package pedro.ProjetoJava.exerciciosRevisaoInternet;

import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.calculadora025;

public class exercicio025Intenret {
    public static void main(String[] args) {
        calculadora025 calculadora = new calculadora025();

        System.out.println("soma");
        System.out.println(calculadora025.somar(10,10));
        System.out.println("subtracao");
        System.out.println(calculadora025.subtrair(10,10));
        System.out.println("multiplicacao");
        System.out.println(calculadora025.multiplicar(10,10));
        System.out.println("divisao");
        System.out.println(calculadora025.dividir(0,10));

    }
}
