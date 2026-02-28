package pedro.ProjetoJava.exerciciosRevisaoInternet;

import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.cursoEspecializacaoProjeto03;
import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.cursoGraduacaoProjeto03;
import pedro.ProjetoJava.exerciciosRevisaoInternet.dominios.cursoTecnicoProjeto03;

import java.util.Arrays;

public class miniProjeto03 {
    public static void main(String[] args) {
        cursoTecnicoProjeto03 administracao = new cursoTecnicoProjeto03("Administraçao", "Cadu",
                2000,
                new String[4], "CENTRO PAULA SOUZA");

        cursoGraduacaoProjeto03 ADS = new cursoGraduacaoProjeto03("ADS", "Luiz", 2500,
                new String[5], new String[]{null});

        cursoEspecializacaoProjeto03 engSoftware = new cursoEspecializacaoProjeto03("Eng. Software",
                "Maikol", 200, new String[2],"");

        String [] alunosAdmi = new String[]{"pedro", "mathias", "joao", "gabriel"};
        double [] notasAdmi = new double []{10,8,9,7};

        String [] alunosAds = new String[]{"maria", "mariana", "mariene", "marilia", "ana"};
        double [] notasADS = new double []{10,10,9,6,4};

        String [] alunosEspecializacao = new String[]{"maria", "pedro"};
        double [] notasEspec = new double []{10,6};


        administracao.adicionarAluno(alunosAdmi);

        ADS.adicionarAluno(alunosAds);
        String[] disciplinasADS = new String[]{"eng de software", "logica de programaçao", "comunicacao"};
        ADS.setDisciplinas(disciplinasADS);

        engSoftware.adicionarAluno(alunosEspecializacao);
        engSoftware.setProjetoFinalMestrado("Aplicativo Mobile Revolucionario");

        System.out.println("-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=--==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        administracao.gerarCertificado();
        System.out.println("Nome alunos ADM: "+Arrays.toString(administracao.getAlunos()));
        System.out.println("Nome do professor de ADM: " + administracao.getProfessor());
        System.out.println("Carga Horária do curso: " + administracao.getCargaHoraria());
        System.out.println("Nome da empresa do curso: " + administracao.getEmpresa());
        administracao.calcularNotaFinal(notasAdmi);
        System.out.println("-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=--==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        ADS.gerarCertificado();
        System.out.println("Nome alunos ADS: "+Arrays.toString(ADS.getAlunos()));
        System.out.println("Nome do professor de ADS: " + ADS.getProfessor());
        System.out.println("Carga Horária do curso: " + ADS.getCargaHoraria());
        System.out.println("Nome disciplinas: "+Arrays.toString(ADS.getDisciplinas()));
        ADS.calcularNotaFinal(notasADS);
        System.out.println("-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=--==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");



        engSoftware.gerarCertificado();
        System.out.println("Nome alunos Especialização: "+Arrays.toString(engSoftware.getAlunos()));
        System.out.println("Nome do professor de Eng Software: " + engSoftware.getProfessor());
        System.out.println("Carga horária do curso: "+ engSoftware.getCargaHoraria());
        System.out.println("Nome do Projeto Final Mestrado: " +engSoftware.getProjetoFinalMestrado());
        engSoftware.calcularNotaFinal(notasEspec);
        System.out.println("-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=--==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");


        System.out.println("Total do número de cursos: " + cursoGraduacaoProjeto03.getTotalCursos());
    }
}
