package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios3;

public class Par <A, B>{
    final A a;
    final B b;

    public Par(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public static <A, B> Par<A, B> create(A a, B b) {
        return new Par<>(a, b);
        // entendi, precisa botar a generics depois do static e antes do retorno do metodo
    }


    public A getPrimeiro() {
        return a;
    }

    public B getSegundo() {
        return b;
    }

    @Override
    public String toString() {
        return "Par{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
