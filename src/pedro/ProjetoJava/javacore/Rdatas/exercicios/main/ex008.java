package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Cronometro;

import java.time.ZoneId;

public class ex008 {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
        System.out.println("Tempo de entrada: "+cronometro.getHoraEntrada().atZone(ZoneId.systemDefault()));
        int cont = 0;
        while (cont < 10) { // logica simples pra fazer o cronometro funcionar, coisa basica
            if (cont == 9) {
                cronometro.parar();
            }
            cont += 1;
        }

        System.out.println("Tempo de saida: " +cronometro.getHoraSaida().atZone(ZoneId.systemDefault()));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Duração em milissegundos: "+ cronometro.getTempoMs());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Duração em nanosegundos: " + cronometro.getTempoNs());
    }
}
