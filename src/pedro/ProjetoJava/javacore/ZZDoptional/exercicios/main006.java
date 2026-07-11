package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios6.UsuarioRepositorio;

public class main006 {
    public static void main(String[] args) {
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        System.out.println(usuarioRepositorio.autenticar("mariakap_", "maria123"));
    }
}
