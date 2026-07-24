package pedro.ProjetoJava.javacore.ZZHdesignpatterns.dominios;



public class Pessoa {
    private String nome;
    private int  idade;
    private String cidade;

    private Pessoa(Builder builder) {
        nome = builder.nome;
        idade = builder.idade;
        cidade = builder.cidade;
    }


    public static final class Builder {
        private String nome;
        private int idade;
        private String cidade;

        private Builder() {
        }

        public static Builder newPessoa() {
            return new Builder();
        }

        public Builder setNome(String val) {
            nome = val;
            return this;
        }

        public Builder setIdade(int val) {
            idade = val;
            return this;
        }

        public Builder setCidade(String val) {
            cidade = val;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }
}
