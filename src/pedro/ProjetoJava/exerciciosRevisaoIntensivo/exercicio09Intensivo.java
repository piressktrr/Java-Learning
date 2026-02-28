package pedro.ProjetoJava.exerciciosRevisaoIntensivo;

import pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios.exercicio09IntensivoCarro;

public class exercicio09Intensivo {
    public static void main(String[] args) {
        exercicio09IntensivoCarro carroBMW = new exercicio09IntensivoCarro();
        exercicio09IntensivoCarro carroMERCEDES = new exercicio09IntensivoCarro();

        carroBMW.setNome("320i");
        carroBMW.setMarca("BMW");
        carroBMW.setModelo("2021");

        System.out.println("Nome, Marca e Modelo: ");
        System.out.println(carroBMW.getNome() + " - " + carroBMW.getMarca() + " - " + carroBMW.getModelo());

        carroMERCEDES.setNome("G63-BRABUS");
        carroMERCEDES.setMarca("MERCEDES");
        carroMERCEDES.setModelo("2025");

        System.out.println(" ");
        System.out.println("Nome, Marca e Modelo: ");
        System.out.println(carroMERCEDES.getNome() + " - " + carroMERCEDES.getMarca() + " - " + carroMERCEDES.getModelo());

    }

}
