package pedro.ProjetoJava.exerciciosRevisaoInternetP2.dominiosP2;

public class estagiario02 extends funcionario02{
    public estagiario02(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }
    public double calcularBonus(double bonus){
        return bonus + getSalario();
    }
}
