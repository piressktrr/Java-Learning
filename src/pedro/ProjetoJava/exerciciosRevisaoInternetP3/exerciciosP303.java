package pedro.ProjetoJava.exerciciosRevisaoInternetP3;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios.*;

public class exerciciosP303 {
    public static void main(String[] args) {
        veiculo03 veiculo = new veiculo03("1231234", "320i", tipoVeiculo03.CARRO,
                statusVeiculo03.DISPONIVEL);

        veiculo03 veiculo2 = new veiculo03 ("124124124", "cla-coupe", tipoVeiculo03.CARRO,
                statusVeiculo03.ALUGADO);

        veiculoPremium03 veiculo3 = new veiculoPremium03("241424124", "q3", tipoVeiculo03.CARRO,
                statusVeiculo03.MANUTENCAO);

        veiculo03 veiculo4 = new veiculo03("1234142421", "1200GS", tipoVeiculo03.MOTO,
                statusVeiculo03.DISPONIVEL);

        veiculo03 veiculo5 = new veiculo03("12345555999", "VOLVAO", tipoVeiculo03.CAMINHAO,
                statusVeiculo03.DISPONIVEL);

        gerenciadorFrota03 gerenciador = new gerenciadorFrota03();
        veiculo3.setValorDiaria(100);

        veiculo03[] veiculos = {veiculo, veiculo2, veiculo3, veiculo4, veiculo5};



        gerenciador.setVeiculos(veiculos);
        gerenciador.buscarVeiculo("1231234");
        System.out.println();
        gerenciador.buscarVeiculo(tipoVeiculo03.CARRO);
        System.out.println();
        gerenciador.buscarVeiculo(tipoVeiculo03.CAMINHAO);
        System.out.println();
        gerenciador.buscarVeiculo(tipoVeiculo03.MOTO  );
        System.out.println();
        gerenciador.listarPorStatus(statusVeiculo03.DISPONIVEL);
        System.out.println();
        gerenciador.listarPorStatus(statusVeiculo03.ALUGADO);
        System.out.println();
        gerenciador.listarPorStatus(statusVeiculo03.MANUTENCAO);

    }

}
