package pedro.ProjetoJava.exerciciosRevisaoInternetP2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.animal01;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.cachorro01;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.gato01;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.passaro01;

public class exerciciosP201 {
    public static void main(String[] args) {
       cachorro01 cachorro = new cachorro01("rex", 5, "corgi");
       gato01 gato = new gato01("mamoas", 3, "laranja");
       passaro01 passaro = new passaro01("tucano", 2, "passarideos");

       System.out.println(cachorro.getNome());
       cachorro.fazerSom();
       System.out.println("--------");
       System.out.println(gato.getNome());
       gato.fazerSom();
       System.out.println("--------");
       System.out.println(passaro.getNome());
       passaro.fazerSom();


        System.out.println("--------");

        System.out.println("Quantidade de Animais: ");
       System.out.println(animal01.getQuantidadeAnimais());
    }
}
