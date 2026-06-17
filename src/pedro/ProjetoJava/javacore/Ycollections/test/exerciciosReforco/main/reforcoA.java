package pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.main;

import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.A.RegistroSenhas;
import pedro.ProjetoJava.javacore.Ycollections.test.exerciciosReforco.dominios.A.Senha;

public class reforcoA {
    public static void main(String[] args) {
        Senha senha1 = new Senha("Pedro", "123132");
        Senha senha2 = new Senha("Pablo", "421424");
        Senha senha3 = new Senha("Pedro", "12312331");
        Senha senha4 = new Senha("Pedro", "123132");

        RegistroSenhas  registroSenhas = new RegistroSenhas();

        registroSenhas.adicionar(senha1);
        registroSenhas.adicionar(senha2);
        registroSenhas.adicionar(senha3);
        registroSenhas.adicionar(senha4);

        System.out.println(registroSenhas.buscarPorUsuario("pedro"));
        System.out.println();
        System.out.println(registroSenhas.listar());
    }
}
