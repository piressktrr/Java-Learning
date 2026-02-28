package pedro.ProjetoJava.exerciciosRevisaoIntensivo;

public class exercicio02Intensivo {
    public static void main(String[] args) {
        double salarioNetherlands = 65000;
        double imposto1 = 9.70/100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 49.50 /100;
        double valorImposto;

        if (salarioNetherlands <= 34712) {
            valorImposto = salarioNetherlands *= imposto1;
            salarioNetherlands -= valorImposto;
            System.out.println("seu imposto de 9,7% do salário é igual a: R$" +salarioNetherlands);
        } else if (salarioNetherlands >= 34713 && salarioNetherlands <= 68507) {
            valorImposto = salarioNetherlands *= imposto2;
            System.out.println("seu imposto de 37,85% do salário é igual a: R$" +valorImposto);
        } else {
            valorImposto = salarioNetherlands *= imposto3;
            salarioNetherlands -= valorImposto;
            System.out.println("seu imposto de 49,50% do salário é igual a: R$  " +salarioNetherlands);
        }
    }
}
