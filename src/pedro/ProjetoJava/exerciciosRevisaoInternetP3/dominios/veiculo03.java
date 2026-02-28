package pedro.ProjetoJava.exerciciosRevisaoInternetP3.dominios;

public class veiculo03 {
    private String placa;
    private String modelo;
    private tipoVeiculo03 tipoVeiculo;
    private statusVeiculo03 statusVeiculo;


    public veiculo03(String placa, String modelo, tipoVeiculo03 tipoVeiculo, statusVeiculo03 statusVeiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipoVeiculo = tipoVeiculo;
        this.statusVeiculo = statusVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()){
            System.out.println("erro na placa, try again");
            return;
        }
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("erro no modelo, try again");
            return;
        }
        this.modelo = modelo;
    }

    public tipoVeiculo03 getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(tipoVeiculo03 tipoVeiculo) {
        if (tipoVeiculo == null ){
            System.out.println("erro no tipo do veiculo, try again");
            return;
        }
        this.tipoVeiculo = tipoVeiculo;
    }

    public statusVeiculo03 getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(statusVeiculo03 statusVeiculo) {
        if (statusVeiculo == null ){
            System.out.println("erro no status do veiculo, try again");
            return;
        }
        this.statusVeiculo = statusVeiculo;
    }
}
