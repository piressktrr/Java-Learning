package pedro.ProjetoJava.exerciciosRevisaoInternetP2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.caminhao03;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.carro03;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.moto03;
import pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2.veiculo03;

public class exerciciosP303 {

    public static void main(String[] args) {




        carro03 carro = new carro03("BMW", "320I", 2023, 150, 4 );
        caminhao03 caminhao = new caminhao03("MERCEDES", "3301", 2024, 70, "celio");
        moto03 moto = new moto03("BMW", "GS1200", 2024, 90, 4);

        carro03.velocidadeMaxima = 300;
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println("KM/h: "+carro.getVelocidade());
        System.out.println("Velocidade Max " + veiculo03.getVelocidadeMaxima());
        System.out.println(carro.getNumeroDePortas());
        System.out.println();
        caminhao03.velocidadeMaxima = 150;
        System.out.println(caminhao.getMarca());
        System.out.println(caminhao.getModelo());
        System.out.println(caminhao.getAno());
        System.out.println("KM/h: "+caminhao.getVelocidade());
        System.out.println("Velocidade Max " + veiculo03.getVelocidadeMaxima());
        System.out.println(caminhao.getNomeDoChofer());
        System.out.println();
        moto03.velocidadeMaxima = 200;
        System.out.println(moto.getMarca());
        System.out.println(moto.getModelo());
        System.out.println(moto.getAno());
        System.out.println("KM/h: "+moto.getVelocidade());
        System.out.println("Velocidade Max " + veiculo03.getVelocidadeMaxima());
        System.out.println(moto.getNumeroInfracoes());


    }

}
