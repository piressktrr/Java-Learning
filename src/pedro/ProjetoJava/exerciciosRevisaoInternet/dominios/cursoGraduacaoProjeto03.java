package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class cursoGraduacaoProjeto03 extends cursoProjeto03{
    private String[] disciplinas;
    public cursoGraduacaoProjeto03(String nomeCurso, String professor, int cargaHoraria, String[] alunos,
                                   String[] disciplinas) {
        super(nomeCurso, professor, cargaHoraria, alunos);
        this.disciplinas = disciplinas;
        totalCursos++;
    }
    @Override
    public void gerarCertificado(){
        System.out.println("Gerando certificado de: "+getNome() +" ...");
    }

    @Override
    public void adicionarAluno(String... alunos) {
        System.out.println("Adicionando alunos...");
        if (alunos == null || alunos.length == 0) {
            return;
        }
        setAlunos(alunos);
    }

    @Override
    public void calcularNotaFinal(double[] notaFinal) {

        for (double nota : notaFinal) {
            if (nota > 10 || nota < 0){
                return;
            }
        }
        double soma = 0;
        for (double v : notaFinal) {
            soma+= v;
        }
        double media = soma/ notaFinal.length;
        if (media >= 7){
            System.out.println("os alunos estão aptos para a graduação: ");
        } else {
            System.out.println("os alunos não estão aptos para a graduação");
        }
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        if (disciplinas == null)
            return;
        this.disciplinas = disciplinas;
    }
}
