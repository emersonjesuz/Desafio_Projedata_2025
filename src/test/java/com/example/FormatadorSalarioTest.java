package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class FormatadorSalarioTest {
    @Test
    public void deveRetornaSalarioFormatadoBRL() {
        BigDecimal salario = new BigDecimal(1000);
        String salarioFormatado = FormatadorSalario.formatar(salario);
        String resposta = "R$ 1.000,00";
        assertEquals(resposta, salarioFormatado);
        salario = new BigDecimal(0);
        salarioFormatado = FormatadorSalario.formatar(salario);
        resposta = "R$ 0,00";
        assertEquals(resposta, salarioFormatado);
    }
}
