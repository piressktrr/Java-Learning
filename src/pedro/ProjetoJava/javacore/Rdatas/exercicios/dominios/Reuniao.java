package pedro.ProjetoJava.javacore.Rdatas.exercicios.dominios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Reuniao {
    private String titulo;
    private LocalDate data;


    public Reuniao(String titulo, LocalDate data) {
        this.titulo = titulo;
        this.data = data;
    }

    public LocalDate getDataAjustada() {
        DayOfWeek dia = this.data.getDayOfWeek();
        if (dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY) {
            return this.data.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        return this.data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            return;
        }
        this.titulo = titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data == null) {
            return;
        }
        this.data = data;
    }
}
