package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class FormatadorDataNascimentoTest {

    @Test
    public void deveRetornaDataNascimentoFormatada() {
        LocalDate dataNascimento = LocalDate.parse("1998-11-30");
        String dataFormatada = FormatadorData.formatar(dataNascimento);
        String resposta = "30/11/1998";
        assertEquals(resposta, dataFormatada);
    }
}
