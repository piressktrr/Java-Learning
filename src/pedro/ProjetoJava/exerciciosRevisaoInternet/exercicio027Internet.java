package pedro.ProjetoJava.exerciciosRevisaoInternet;

import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.carro027;

public class exercicio027Internet {

    public static double teste(){
        return 10+10;
    }


    public static void main(String[] args) {
        carro027.alterarVelocidadeMaxima(310);
        carro027 carro = new carro027("BMW", "320i", 2023, 100);
        carro027 carro2 = new carro027("AUDI", "SEDAN", 2024, 270);
        carro027 carro3 = new carro027("MERCEDES", "CLÁ-COUPE", 2025, 260);

        carro027 carro4 = new carro027("bmw");

        carro.acelerar();
        carro2.acelerar();
        carro3.acelerar();

        carro.acelerar(20);
        carro2.acelerar(20);
        carro3.acelerar(20);

        System.out.println(carro.getVelocidade());
        System.out.println(carro2.getVelocidade());
        System.out.println(carro3.getVelocidade());

        carro.frear();
        carro2.frear();
        carro3.frear();

        System.out.println();
        System.out.println(carro.getVelocidade());
        System.out.println(carro2.getVelocidade());
        System.out.println(carro3.getVelocidade());

        carro.frear(50);
        carro2.frear(50);
        carro3.frear(50);

        System.out.println();
        System.out.println(carro.getVelocidade());
        System.out.println(carro2.getVelocidade());
        System.out.println(carro3.getVelocidade());
        System.out.println();
        System.out.println(carro027.getVelocidadeMaximaPermitida());
        carro.verificarVelocidade(carro.getVelocidade(), carro.getMarca());

    }

}
