package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo2.Curso;

public class CursoRemoto extends Curso {
    private int videosAssistidos;
    private int totalVideos;

    public CursoRemoto(String titulo, int cargaHoraria, String aluno, int videosAssistidos, int totalVideos) {
        super(titulo, cargaHoraria, aluno);
        this.videosAssistidos = videosAssistidos;
        this.totalVideos = totalVideos;
    }

    @Override
    public double calcularProgresso() {
        return (double) videosAssistidos /  totalVideos * 100;
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
            System.out.println("Certificado do curso remoto emitido com sucesso!!");
        } else {
            System.out.println("O aluno não está elegivel para o certificado!!");
        }
    }

    @Override
    public boolean elegivelCertificado() {
        if (calcularProgresso() >= 75){
            return true;
        }
        return false;
    }
}
