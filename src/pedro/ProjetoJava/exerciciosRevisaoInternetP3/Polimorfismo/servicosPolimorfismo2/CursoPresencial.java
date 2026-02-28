package pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.servicosPolimorfismo2;

import pedro.ProjetoJava.exerciciosRevisaoInternetP3.Polimorfismo.dominiosPolimorfismo2.Curso;

public class CursoPresencial extends Curso {
    private int AulasFrequentadas;
    private int TotalAulas;

    public CursoPresencial(String titulo, int cargaHoraria, String aluno, int aulasFrequentadas, int totalAulas) {
        super(titulo, cargaHoraria, aluno);
        AulasFrequentadas = aulasFrequentadas;
        TotalAulas = totalAulas;
    }

    @Override
    public double calcularProgresso() {
        return (double) AulasFrequentadas  / TotalAulas * 100;
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
            System.out.println("Certificado do curso presencial emitido com sucesso!!");

        }
    }

    @Override
    public boolean elegivelCertificado() {
        if (calcularProgresso() >= 80){
            return true;
        }
        return false;
    }
}
