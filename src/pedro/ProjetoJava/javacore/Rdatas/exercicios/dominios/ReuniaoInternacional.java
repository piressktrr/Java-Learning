package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

public class ReuniaoInternacional {
    private String titulo;
    private String data = "2026-04-10";
    private int horario = 10;

    public ReuniaoInternacional(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public int getHorario() {
        return horario;
    }
}
