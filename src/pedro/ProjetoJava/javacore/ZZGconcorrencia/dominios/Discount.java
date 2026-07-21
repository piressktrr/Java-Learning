package pedro.ProjetoJava.javacore.ZZGconcorrencia.dominios;

public class Discount {
    public enum Code {
        NONE(0), BAIXO(5), MEDIO(10), ALTO(15);

        private final int value;
        Code(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
