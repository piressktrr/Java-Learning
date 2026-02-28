package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class desenvolvedor02 extends funcionario02{

    public desenvolvedor02(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }

    public double calcularBonus(double bonus){
        return bonus + getSalario();
    }
}
