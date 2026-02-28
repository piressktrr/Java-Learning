package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class gerente02 extends funcionario02{



    public gerente02(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }

    public double calcularBonus(double bonus, double porcentagem){
        return (bonus*porcentagem) + getSalario();
    }
}
