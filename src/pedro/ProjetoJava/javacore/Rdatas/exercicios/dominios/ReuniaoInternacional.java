package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ReuniaoInternacional {
    private String titulo;
    private ZonedDateTime dataHorario;

    public ReuniaoInternacional(String titulo) {
        this.titulo = titulo;
    }

    public String retornarData () {
        return getDataHorario().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ZonedDateTime getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(ZonedDateTime dataHorario) {
        this.dataHorario = dataHorario;
    }
}
