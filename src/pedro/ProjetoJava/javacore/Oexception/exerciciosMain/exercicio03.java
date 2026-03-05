package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios3.ValidadorDeSenhas;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        ValidadorDeSenhas validador = new ValidadorDeSenhas();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = input.nextLine();
        validador.validarSenha(senha);
    }
}
