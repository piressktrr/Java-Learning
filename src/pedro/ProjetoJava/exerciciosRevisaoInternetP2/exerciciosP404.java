package pedro.ProjetoJava.exerciciosRevisaoInternetP2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.circulo04;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.quadrado04;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.triangulo04;

public class exerciciosP404 {
    public static void main(String[] args) {
        quadrado04 quadrado = new quadrado04("amarelo", 10);
        circulo04 circulo = new circulo04("azul", 10);
        triangulo04 triangulo = new triangulo04("roxoo", 10, 5, 5);

        System.out.println("QUADRADO: ");
        System.out.println(quadrado.getCor());
        System.out.println("Area: "+quadrado.calcularArea());
        System.out.println("Perimetro: "+quadrado.calcularPerimetro());
        System.out.println();

        System.out.println("CIRCULO: ");
        System.out.println(circulo.getCor());
        System.out.println("Area: "+circulo.calcularArea());
        System.out.println("Perimetro: "+circulo.calcularPerimetro());
        System.out.println();

        System.out.println("TRIANGULO: ");
        System.out.println(triangulo.getCor());
        System.out.println("Area: "+triangulo.calcularArea());
        System.out.println("Perimetro: "+triangulo.calcularPerimetro());
    }
}
