package pedro.ProjetoJava.javacore.ZZDoptional.dominios5;

public class Pacote {
    private String nomePacote;
    private Double pesoPacoteKg;
    private Double distanciaPacoteKm;

    public Pacote(String nomePacote, Double pesoPacoteKg, Double distanciaPacoteKm) {
        this.nomePacote = nomePacote;
        this.pesoPacoteKg = pesoPacoteKg;
        this.distanciaPacoteKm = distanciaPacoteKm;
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "nomePacote='" + nomePacote + '\'' +
                ", pesoPacoteKg=" + pesoPacoteKg +
                ", distanciaPacoteKm=" + distanciaPacoteKm +
                '}';
    }

    public String getNomePacote() {
        return nomePacote;
    }

    public Double getPesoPacoteKg() {
        return pesoPacoteKg;
    }

    public Double getDistanciaPacoteKm() {
        return distanciaPacoteKm;
    }
}
