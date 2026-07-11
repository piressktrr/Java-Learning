package pedro.ProjetoJava.javacore.ZZDoptional.dominios5;

public class Pacote {
    private String nomePacote;
    private Double pesoPacote;
    private Double distanciaPacoteKm;

    public Pacote(String nomePacote, Double pesoPacote, Double distanciaPacoteKm) {
        this.nomePacote = nomePacote;
        this.pesoPacote = pesoPacote;
        this.distanciaPacoteKm = distanciaPacoteKm;
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "nomePacote='" + nomePacote + '\'' +
                ", pesoPacote=" + pesoPacote +
                ", distanciaPacoteKm=" + distanciaPacoteKm +
                '}';
    }

    public String getNomePacote() {
        return nomePacote;
    }

    public Double getPesoPacote() {
        return pesoPacote;
    }

    public Double getDistanciaPacoteKm() {
        return distanciaPacoteKm;
    }
}
