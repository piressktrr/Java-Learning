package pedro.ProjetoJava.exerciciosRevisaoIntensivo;

import pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios.aluno011;
import pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios.local011;
import pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios.professor011;
import pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios.seminario011;

public class exercicio011Intensivo {

    static void imprimir(aluno011 aluno, professor011 professor, seminario011 seminario, local011 local) {

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Especialidade: " + professor.getEspecialidade());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        if (seminario == null) return;
        System.out.println("Seminario: " +seminario.getTitulo());
        System.out.println("Local: " + local.getEndereco());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public static void main(String[] args) {
        local011 local = new local011("ETEC CAIEIRAS");

        aluno011 aluno1 = new aluno011("pedro", 17);
        aluno011 aluno2 = new aluno011("gabriel", 18);
        aluno011 aluno3 = new aluno011("matheus", 19);
        aluno011 aluno4 = new aluno011("samuel", 20);
        aluno011 aluno5 = new aluno011("matias", 16);
        aluno011 [] alunos = {aluno1,aluno2,aluno3,aluno4,aluno5};


        aluno011[] alunosHistoria = {aluno1, aluno4};
        aluno011[] alunosQuimica = {aluno2, aluno3};
        aluno011[] alunosGeografia = {aluno5};


        seminario011 seminario1 = new seminario011("trabalho de historia", local);
        seminario011 seminario2 = new seminario011("trabalho de quimica", local);
        seminario011 seminario3 = new seminario011("trabalho de geografia", local);
        seminario011[] seminariosHumanas = {seminario1, seminario3};
        seminario011[] seminariosExatas = {seminario2};

        professor011 professor1 = new professor011("Cadu", "historia e geografia", seminariosHumanas);
        professor011 professor2 = new professor011("Lina", "quimica e matematica", seminariosExatas);



        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario2);
        aluno3.setSeminario(seminario2);
        aluno4.setSeminario(seminario1);
        aluno5.setSeminario(seminario3);

        seminario1.setAlunos(alunosHistoria);
        seminario2.setAlunos(alunosQuimica);
        seminario3.setAlunos(alunosGeografia);


       for (int i = 0; i < alunosHistoria.length; i++) {
           imprimir(alunosHistoria[i], professor1, seminario1, local);
       }


    }
}
