package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios3.Funcionario;

public class main003 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario
                ("pedro", 20);

        funcionario.returnComplemento()
                .map(String::toUpperCase)
                .orElse("NÃO HÁ");
    }
}
