package pedro.ProjetoJava.javacore.Oexception.exerciciosMain;

import pedro.ProjetoJava.javacore.Oexception.dominios1.IdadeInvalidaException;
import pedro.ProjetoJava.javacore.Oexception.dominios1.LeitorDeIdade;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        System.out.println("Digite uma idade!: ");
        Scanner sc = new Scanner(System.in);
        LeitorDeIdade leitor = new LeitorDeIdade();
        String idade = sc.nextLine();
        try {
            leitor.leitorDeIdade(idade);
        } catch (NumberFormatException e) {
            System.out.println("Nao é numero inválido!, digite um numero " + e.getMessage());
        }  catch (IdadeInvalidaException e) {
            System.out.println("Idade invalida!: " + e.getMessage());
        }
        sc.close();
    }
}
