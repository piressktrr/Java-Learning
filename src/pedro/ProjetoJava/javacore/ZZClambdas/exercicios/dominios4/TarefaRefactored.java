package pedro.ProjetoJava.javacore.ZZClambdas.exercicios.dominios4;

public class TarefaRefactored {
    private final String nome;
    private final String descricao;
    private final Prioridade prioridade;

    @Override
    public String toString() {
        return "TarefaRefactored{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }

    private TarefaRefactored(Builder builder) {
        this.nome = builder.nome;
        this.descricao = builder.descricao;
        this.prioridade = builder.prioridade;

    }

    public static class Builder {
        private String nome;
        private String descricao;
        private Prioridade prioridade;

        public Builder definirNome(String nome) {
            this.nome = nome;
            return this; // o return this que permite ir aninhando os metodos la em cima
        }

        public Builder definirDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder definirPrioridade(Prioridade prioridade) {
            this.prioridade = prioridade;
            return this;
        }

        public TarefaRefactored build() {
            if (nome == null || descricao == null || prioridade == null) {
                throw new IllegalArgumentException("one of the values is null");
            } else if (nome.isEmpty() || descricao.isEmpty()) {
                throw new IllegalArgumentException("one of the values is empty");
            } else {
                return new TarefaRefactored(this);
                // retorna o this(builder atual)
            }
        }
    }

}
