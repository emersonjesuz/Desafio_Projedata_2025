package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatadorData {
    static String formatar(LocalDate entrada) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return entrada.format(formatador);
    }
}
