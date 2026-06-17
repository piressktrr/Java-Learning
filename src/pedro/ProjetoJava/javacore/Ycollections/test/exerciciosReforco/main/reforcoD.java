package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.D.Avaliacao;
import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.D.BoletimEscolar;

public class reforcoD {
    public static void main(String[] args) {
        BoletimEscolar boletimEscolar = new BoletimEscolar();
        Avaliacao avaliacao1 = new Avaliacao("Matematica", 7);
        Avaliacao avaliacao2 = new Avaliacao("Historia", 2);
        Avaliacao avaliacao3 = new Avaliacao("Portugues", 8);
        Avaliacao avaliacao4  = new Avaliacao("Geografia", 5);

        boletimEscolar.adicionarAvaliaçao(avaliacao1);
        boletimEscolar.adicionarAvaliaçao(avaliacao2);
        boletimEscolar.adicionarAvaliaçao(avaliacao3);
        boletimEscolar.adicionarAvaliaçao(avaliacao4);

        System.out.println(boletimEscolar.situacao());
        boletimEscolar.atualizarNota(avaliacao2, 9);
        System.out.println();
        System.out.println(boletimEscolar.situacao());
    }
}
