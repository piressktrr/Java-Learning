package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.E.Chamado;
import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.E.FilaSuporte;
import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.E.Nivel;

public class reforcoE {
    public static void main(String[] args) {
        Chamado chamado1 = new Chamado(1234455, "chamado um", Nivel.ALTO);
        Chamado chamado2 = new Chamado(2345, "chamado dois", Nivel.CRITICO);
        Chamado chamado3 = new Chamado(987, "chamado tres", Nivel.CRITICO);
        Chamado chamado4 = new Chamado(231, "chamado quatro", Nivel.MEDIO);
        FilaSuporte fila = new FilaSuporte();
        fila.adicionarChamado(chamado1);
        fila.adicionarChamado(chamado2);
        fila.adicionarChamado(chamado3);
        fila.adicionarChamado(chamado4);


        System.out.println(fila.listarEmOrdem());

        System.out.println("----------------------------");

        System.out.println(fila.proximoChamado());
        System.out.println(fila.processarChamado());
        System.out.println(fila.processarChamado());
    }
}
