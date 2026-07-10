package pedro.ProjetoJava.javacore.ZZClambdas.dominios;

public class Anime {
    private String title;
    private int quantidadeEp;

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantidadeEp=" + quantidadeEp +
                '}';
    }

    public Anime(String title, int quantidadeEp) {
        this.title = title;
        this.quantidadeEp = quantidadeEp;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantidadeEp() {
        return quantidadeEp;
    }


}
