package pedro.ProjetoJava.javacore.Ycollections.test.Dominios;

public class Smartphone {
    private String nome;
    private String numeroDeLote;

    public Smartphone(String nome, String numeroDeLote) {
        this.nome = nome;
        this.numeroDeLote = numeroDeLote;
    }

    // tem que ser reflexivo -> x.equals(x) tem que ser true para tudo diferente de null
    // simétrico -> para x e y diferentes de null, se x.equals(y) == true, então, y.equals(x) == true.
    // transitividade -> para x, y e z diferentes de null: se x.equals(y) == true E x.equals(z) == true, então,
    // y.equals(z) == true.

    // consistente -> x.equals(x) sempre retorna true se: x for diferente de null.
    // para x diferente de null, x.equals(null) retorna false
    @Override // implementação
    public boolean equals(Object obj) {
        //this sempre vai ter que ter, pois é a variavel antes de equals
        if (obj == null) return false; // se é nulo retorna
        if (obj == this) return true; // se é igual retorna // ex: smartphone1 = smartphone2
        if (this.getClass() != obj.getClass()) return false; // se é diferente da mesma classe retorna
        Smartphone smartphone = (Smartphone) obj; // instancia o objeto pra smartphone (coisa que ele já é)

        return numeroDeLote != null && numeroDeLote.equals(smartphone.numeroDeLote); // se o numero de lote for diferente
        // de null, faz um equals da STRING pro OBJETO smartphone, comparando os valores literais, nao os objetos
    }


    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() não diz que necessariamente o equals de y.equals(x) tem que ser true

    // x.equals(y) == false -> hashCode tem que ser diferente (que nem abaixo)
    // y.hashCode() != x.hashCode() -> x.equals(y) deverá ser false. (algo muito errado no código)
    // equals e hashcode tem que estar em sintonia (um mesmo atributo para gerar equals e hashcode)


    @Override
    public int hashCode() {
        return numeroDeLote == null  ? 0 : numeroDeLote.hashCode(); //está gerando um hashcode para mim
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(String numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
}
