package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class gerenciadorFrota03 {
    private veiculo03[] veiculos = new veiculo03[6];


    public void buscarVeiculo(String placa) {
        System.out.println("BUSCANDO VEICULO POR PLACA: ");
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                continue;
            }

            if (veiculos[i].getPlaca().equals(placa)) {
                System.out.println(veiculos[i].getModelo() + ": Veiculo da placa encontrado.");
            }
        }
    }

    public void buscarVeiculo(tipoVeiculo03 tipoVeiculo) {
        System.out.println("BUSCANDO VEICULOS POR - "+tipoVeiculo+": ");
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                System.out.println("Veiculo por tipo não encontrado.");
                continue;
            }

            if (veiculos[i].getTipoVeiculo().equals(tipoVeiculo)) {
                System.out.println(veiculos[i].getModelo());
            }
        }
    }

    public void listarPorStatus(statusVeiculo03 statusVeiculo) {
        System.out.println("BUSCANDO VEICULOS POR STATUS - " +statusVeiculo+ ": ");
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                System.out.println("Veiculo por status não encontrado.");

                continue;
            }

            if (veiculos[i].getStatusVeiculo().equals(statusVeiculo)) {
                System.out.println(veiculos[i].getModelo());
            }
        }
    }

    public veiculo03[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(veiculo03[] veiculos) {
        if (veiculos == null) {
            System.out.println("ERRO NO SET VEICULOS!!");
            return;
        }
        this.veiculos = veiculos;
    }


}
