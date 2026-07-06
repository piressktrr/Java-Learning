package pedro.ProjetoJava.javacore.Zgenerics.tests;

import pedro.ProjetoJava.javacore.Zgenerics.Dominios.Barco;
import pedro.ProjetoJava.javacore.Zgenerics.Dominios.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        List<Carro> carros = List.of(new Carro("BMW"), new Carro("Mercedes"));
        List<Barco> barcos = List.of(new Barco("lancha"), new Barco("iaty"));
        RentalService<Carro> serviceRentalCarro = new RentalService<>(carros);
        Carro carro = serviceRentalCarro.buscarobjetosDisponiveis();
        System.out.println("ALugando carro por um mês..");
        serviceRentalCarro.retornarCarroAlugado(carro);

        System.out.println("---------------------------------");


        RentalService<Barco> serviceRentalBarco = new RentalService<>(barcos);
        Barco barco = serviceRentalBarco.buscarobjetosDisponiveis();
        System.out.println("ALugando barco por um mês..");
        serviceRentalBarco.retornarCarroAlugado(barco);

    }
}
