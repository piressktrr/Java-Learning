package pedro.ProjetoJava.javacore.Ycollections.test;

import pedro.ProjetoJava.javacore.Ycollections.test.Dominios.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome1 = "Pedro"; // string constant pool
        String nome2 = new String("Pedro"); // memoria heap
        // retorna false

        Smartphone s1 = new Smartphone("iphone", "123");
        Smartphone s2 = new Smartphone("iphone", "123");
        System.out.println(s1.equals(s2)); // so serve pro numero de lote nesse caso, entao se eu mudar o nome
        // ele vai retornar true

    }
}
