package pedro.ProjetoJava.exerciciosRevisaoIntensivo.dominios;

public class testeIntensivo {
    public static void main(String[] args) {
        testeIntesivoEstudante estudante = new testeIntesivoEstudante();
        testeIntesivoEstudante estudante1 = new testeIntesivoEstudante();
        testeIntensivoImpressora impressora = new testeIntensivoImpressora();

        estudante.nome = "pedro";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante1.nome = "ordep";
        estudante1.idade = 25;
        estudante1.sexo = 'F';

        impressora.imprimir(estudante);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        impressora.imprimir(estudante1);
    }
}
