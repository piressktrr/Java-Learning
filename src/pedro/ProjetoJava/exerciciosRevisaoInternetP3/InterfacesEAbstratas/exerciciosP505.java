package pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.InterfacesEAbstratas.dominiosInterfaces2.*;

public class exerciciosP505 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("azul", 20);
        Retangulo r1 = new Retangulo("verde", 100, 100);
        Triangulo t1 = new Triangulo("roxo", 50, 50);

        Forma[] formas = new Forma[]{c1, r1, t1};

        for (Forma forma : formas) {
            forma.exibirInfo();
        }

        int a = Forma.getTotalFormas();
        System.out.println("Total formas: " + a);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Desenhavel desenhavel = (Desenhavel) c1;
        Desenhavel desenhavel2 = (Desenhavel) r1;
        Desenhavel desenhavel3 = (Desenhavel) t1;
        desenhavel.desenhar();
        System.out.println();
        desenhavel2.desenhar();
        System.out.println();
        desenhavel3.desenhar();


    }
}
