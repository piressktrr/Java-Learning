package pedro.ProjetoJava.javacore.Oexception.exceptionn.test;

import java.util.Objects;
import java.util.Scanner;

public class CustomizeExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws Exception {
        Scanner input = new Scanner(System.in);
        String usuarioDB = "Pedro";
        String senhaDB = "123456";
        System.out.println("usuario: ");
        String usuario = input.nextLine();
        System.out.println("senha:");
        String senha = input.nextLine();

        if (!usuario.equalsIgnoreCase(usuarioDB)){
            throw new Exception("Erro no usuário passado");
        } else if (!senha.equalsIgnoreCase(senhaDB)){
            throw new Exception("Erro na senha passado");
        }
        System.out.println("usuario logado com sucesso");

    }
}
