package pedro.ProjetoJava.javacore.ZZDoptional.exercicios;

import pedro.ProjetoJava.javacore.ZZDoptional.dominios2.Endereco;
import pedro.ProjetoJava.javacore.ZZDoptional.dominios2.Funcionario;

public class main002 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario
                ("pedro", 20, new Endereco("CASA 6 ", "mauricinho", "60"));

        System.out.println(funcionario.returnComplemento());
    }
}
