package pedro.ProjetoJava.javacore.Rdatas.exercicios.main;

import pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios.Pessoa;

public class ex001 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Pedro");
        p1.setDataDeNascimento("15/05/2008");

        p1.calculReturn(p1.getDataDeNascimento());
    }
}
