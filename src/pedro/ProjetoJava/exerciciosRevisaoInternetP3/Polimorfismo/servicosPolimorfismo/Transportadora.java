package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo.Veiculo;

public class Transportadora {
    private Veiculo[] veiculos = new Veiculo[6];

    public void adicionarVeiculo(Veiculo veiculo, int posicao) {
        for (int i = 0; i < 1; i++) {
            if (veiculo != null || posicao < 0 || posicao > veiculos.length) {
                veiculos[posicao] = veiculo;
            }
        }
    }

    public double calcularFreteTotal(double distanciaKm){
        double somaTotal = 0;
        for (Veiculo veiculo : veiculos) {
            if (veiculo != null){
                somaTotal += veiculo.calcularFrete(distanciaKm);
            }
        }
        return somaTotal;
    }

    public void exibirFrota(){
        for (Veiculo veiculo : veiculos) {
            if (veiculo != null){
                System.out.println("Modelo: " + veiculo.getModelo());
                System.out.println("Capacidade: " +veiculo.getCapacidadeKg()+ "KG");
                System.out.println("Tipo: " +veiculo.exibirTipo());
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }

    }

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        if (veiculos == null) {
            return;
        }
        this.veiculos = veiculos;
    }
}
