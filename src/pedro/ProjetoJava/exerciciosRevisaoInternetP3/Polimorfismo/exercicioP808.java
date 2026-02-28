package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo.Caminhao;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo.Moto;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo.Van;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo.Veiculo;
import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo.Transportadora;

public class exercicioP808 {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("SCANIA 113H", 1000, 4);
        Moto moto = new Moto("1200GS", 100, true);
        Van van = new Van("Scooter", 300, true);

        Moto moto1 = new Moto("Africa Twin 1000", 100, true);
        Van van1 = new Van("Kombi", 40, true);
        Caminhao caminhao1 = new Caminhao("SCANIA 230h", 1200, 5);

        Veiculo[] veiculos = new Veiculo[]{caminhao, moto, van, moto1, van1, caminhao1};
        Transportadora transportadora = new Transportadora();

        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null){
                transportadora.adicionarVeiculo(veiculos[i], i);
            }
        }

        transportadora.exibirFrota();
        System.out.println("Frete total de todos os veiculos: R$" +transportadora.calcularFreteTotal(100));
    }
}
