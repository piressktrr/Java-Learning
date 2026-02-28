package pedro.ProjetoJava.exerciciosRevisaoInternet.dominios;

public class cursoEspecializacaoProjeto03 extends cursoProjeto03{
    private String projetoFinalMestrado;
    public cursoEspecializacaoProjeto03(String nomeCurso, String professor, int cargaHoraria, String[] alunos,
                                        String projetoFinalMestrado) {
        super(nomeCurso, professor, cargaHoraria, alunos);
        this.projetoFinalMestrado = projetoFinalMestrado;
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
        System.out.println("A média final dos alunos é igual a: " + media);

        if (media >= 8){
            System.out.println("Os alunos foram aprovados!");
        } else {
            System.out.println("Os alunos foram reprovados!");
        }
    }

    public String getProjetoFinalMestrado() {
        return projetoFinalMestrado;
    }

    public void setProjetoFinalMestrado(String projetoFinalMestrado) {
        if (projetoFinalMestrado == null) {
            return;
        }
        this.projetoFinalMestrado = projetoFinalMestrado;
    }
}
