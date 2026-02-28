package pedro.ProjetoJava.exerciciosRevisaoInternet;

import java.util.Arrays;
import java.util.Scanner;

public class miniProjeto01 {

    static void menuLoop(){
        System.out.println(" ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("ATENÇÃO!! NOTA >= 8 - APROVADO; NOTA >= 6 - RECUPERAÇÃO; NOTA <= 5 - REPROVADO");
        System.out.println("1 - Calcula a média de um aluno, 2 - Exibe melhor e pior aluno" +
                " 3 - Calcula média da turma, 4 - Exibe as estatisticas gerais!");
        System.out.println("5 - Sai do Programa.");
        System.out.println(" ");
    }

    static void calcularMediaDeUmAluno(double [] nota) {
        double media = 0;
        for (int i = 0; i < nota.length; i++) {
            media += nota[i];
        }
        media /= nota.length;
        if (media >= 8) {
            System.out.println("APROVADO!! MÉDIA = " + media);
        } else if (media >= 6 ) {
            System.out.println("RECUPERAÇÃO!! MÉDIA = " + media);
        } else {
            System.out.println("REPROVADO!! MÉDIA = " + media);
        }
    }

    static void calcularMelhorEPiorAluno(double [][] nota, String [] aluno, int totalAlunos) {
        double [][] media = new double[totalAlunos][4];
        double [] armazenarMedia = new double[totalAlunos];
        for (int i = 0; i < totalAlunos; i++) {
            double somaMedia = 0;
            for (int j = 0; j < 4; j++) {
                media[i][j] = nota[i][j];
                somaMedia += media[i][j];
            }
            somaMedia /= 4;
            armazenarMedia[i] = somaMedia;

        }

        double maxValue = armazenarMedia[0];

        for (int i = 0; i < totalAlunos; i++) {
            if (armazenarMedia[i] > maxValue) {
                maxValue = armazenarMedia[i];
            }
        }
        double  minValue = maxValue;
        for (int i = 0; i < totalAlunos; i++) {

            if (armazenarMedia[i] < minValue) {
                minValue = armazenarMedia[i];
            }
        }

        System.out.println("A maior média dentre os alunos é: " + maxValue);
        System.out.println("A menor média dentre os alunos é: " + minValue);
    }

    static void calcularMediaDaTurma(double [][] nota, int totalAlunos) {
        double somaMediaTurma = 0;
        for (int i = 0; i < totalAlunos; i++) {
            for (int j = 0; j < 4; j++) {
                somaMediaTurma += nota[i][j];
            }
        }

        int notasMultiplicadasAlunos = 4*totalAlunos;
        System.out.println("Média da turma: " + somaMediaTurma / notasMultiplicadasAlunos);

    }

    static void estatisticasGerais (double [][] nota, int totalAlunos) {
        double mediaEstatisticas = 0;
        int aprovados = 0, recuperacao = 0, reprovados = 0;

        for(int i = 0; i < totalAlunos; i++){
            double mediaAluno = 0;

            for(int j = 0; j < 4; j++){
                mediaAluno += nota[i][j];
            }
            mediaAluno /= 4;

            mediaEstatisticas += mediaAluno;

            if (mediaAluno >= 8) {
                aprovados++;
            } else if (mediaAluno >= 6) {
                recuperacao++;
            } else {
                reprovados++;
            }

        }

        double mediaGeral = mediaEstatisticas / totalAlunos;

        double percentualAprovados = (aprovados / (double) totalAlunos) * 100;

            System.out.println("Número de aprovados: " + aprovados);
            System.out.println("Número em recuperação: " + recuperacao);
            System.out.println("Número de reprovados: " + reprovados);
        System.out.println("Média Geral da turma: " + mediaGeral);
        System.out.println("Percentual de Aprovação: " + percentualAprovados);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=-=-=-=-=-= Mini Projeto de Notas de Aluno =-=-=-=-=-=-=-=");
        System.out.println("Quantos alunos você vai cadastrar? Digite um número de 1 a 10");
        int numeroDeAlunos = entrada.nextInt();


        String [] alunos = new String [numeroDeAlunos];
        double [][] notas = new double[alunos.length][4];
        double nota;
        int totalAlunos = 0;

        System.out.println(" ");
        System.out.println("Digite os nomes dos alunos: ");
        for (int i = 0; i < alunos.length; i++) {
            String nomesTeste = entrada.next();
            alunos[i] = nomesTeste;
            totalAlunos++;
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Digite as 4 notas de cada aluno: ");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < 4; j++) {
                boolean notaValida = false;
                while (!notaValida) {
                    nota = entrada.nextInt();
                    if (nota >= 0 && nota <= 10) {
                        notas[i][j] = nota;
                        notaValida = true;
                    } else {
                        System.out.println("Nota inválida, digite um valor entre 0 a 10!");
                    }
                }
            }
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Alunos cadastrados:" +Arrays.toString(alunos));
        System.out.println("Notas dos Alunos: ");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.print(alunos[i] + " : " +Arrays.toString(notas[i]));
        }


        boolean encontrado = false;
        while (true) {
            String sairEntrar = "";
            menuLoop();
            sairEntrar = entrada.next();

            switch (sairEntrar) {
                case "1":
                    System.out.println(" ");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Peça o nome de um aluno para que, a média dele possa ser feita: ");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    String nome = entrada.next();

                    for (int i = 0; i < totalAlunos; i++) {
                        if (alunos[i].equals(nome)) {
                            calcularMediaDeUmAluno(notas[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Aluno não encontrado!");
                    }
                    continue;

                case "2":
                    System.out.println("=-=-=--=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Maior e Menor Média de TODOS os alunos");
                    calcularMelhorEPiorAluno(notas, alunos, totalAlunos);
                    continue;

                case "3":
                    System.out.println("=-=-=--=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Média geral de notas da turma: ");
                    calcularMediaDaTurma(notas, totalAlunos);
                    continue;

                case "4":
                    System.out.println("=-=-=--=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    estatisticasGerais(notas, totalAlunos);
                    continue;

                case "5":
                    break;

                default:
                    System.out.println("Erro, insira o valor correto escrito no menu!! ");
                    break;
            }


        }
    }
}
