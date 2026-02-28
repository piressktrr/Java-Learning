package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo2.Curso;

public class CursoHibrido extends Curso {
    private int videosAssistidos;
    private int videosTotais;
    private int aulasFrequentadas;
    private int aulasTotais;

    public CursoHibrido(String titulo, int cargaHoraria, String aluno, int videosAssistidos, int videosTotais,
                        int aulasFrequentadas, int aulasTotais) {
        super(titulo, cargaHoraria, aluno);
        this.videosAssistidos = videosAssistidos;
        this.videosTotais = videosTotais;
        this.aulasFrequentadas = aulasFrequentadas;
        this.aulasTotais = aulasTotais;
    }

    @Override
    public double calcularProgresso() {
        double media1 = (double) videosAssistidos / videosTotais;
        double media2 = (double) aulasFrequentadas / aulasTotais;
        return (media1 + media2) / 2;

    }

    @Override
    public double calcularNota() {
        return calcularProgresso() / 10;
    }

    @Override
    public String getConceito() {
        if (calcularNota() < 10 && calcularNota() >= 7){
            return "Aprovado";
        }  else if (calcularNota() < 7 && calcularNota() >= 5){
            return "Recuperacao";
        }
        return "Reprovado";
    }

    @Override
    public void emitirCertificado() {
        if (elegivelCertificado()){
            System.out.println("Certificado do Curso hibrido emitido com sucesso!");
        }
    }

    @Override
    public boolean elegivelCertificado() {
        if (calcularProgresso() >= 70){
            return true;
        }
        return false;
    }
}
