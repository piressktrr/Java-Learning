package pedro.ProjetoJava.javacore.ZZDoptional.dominios;

public class Manga {
    private String nomeManga;
    private int quantidadeEpisodios;
    private int anoLancado;
    private Long id;

    public Manga(String nomeManga, int quantidadeEpisodios, int anoLancado) {
        this.nomeManga = nomeManga;
        this.quantidadeEpisodios = quantidadeEpisodios;
        this.anoLancado = anoLancado;
    }

    public Manga(String nomeManga, int quantidadeEpisodios, int anoLancado, Long id) {
        this.nomeManga = nomeManga;
        this.quantidadeEpisodios = quantidadeEpisodios;
        this.anoLancado = anoLancado;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "nomeManga='" + nomeManga + '\'' +
                ", quantidadeEpisodios=" + quantidadeEpisodios +
                ", anoLancado=" + anoLancado +
                '}';
    }

    public String getNomeManga() {
        return nomeManga;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public int getAnoLancado() {
        return anoLancado;
    }
}
