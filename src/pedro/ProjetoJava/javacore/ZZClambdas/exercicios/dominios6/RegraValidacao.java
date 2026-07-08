package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios6;


@FunctionalInterface
public interface RegraValidacao <T> {

    boolean validar(T entidade);

}
