package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class cursoTecnicoProjeto03 extends cursoProjeto03{
    private String empresa;
    public cursoTecnicoProjeto03(String nomeCurso, String professor, int cargaHoraria, String[] alunos, String empresa)
    {
        super(nomeCurso, professor, cargaHoraria, alunos);
        this.empresa = empresa;
        totalCursos++;
    }

    @Override
    public void gerarCertificado() {
        System.out.println("Gerando Certificado do curso de: " + getNome() +" ...");
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
        System.out.println("A média final dos alunos é igual a: " + soma/ notaFinal.length);
    }


    @Override
    public void adicionarAluno(String... alunos) {
        System.out.println("Adicionando alunos...");
        if (alunos == null || alunos.length == 0) {
            return;
        }
        setAlunos(alunos);
    }



    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        if (empresa == null)
            return;
        this.empresa = empresa;

    }
}
