package com.example;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTotalDeSalariosTest {

    @Test
    public void deveRetornaCalculoTotalSalarioFuncionarios() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        CalculadorTotalDeSalarios calculadorTotalDeSalarios = new CalculadorTotalDeSalarios();
        BigDecimal totalSalario = calculadorTotalDeSalarios.calcular(funcionarios);
        BigDecimal resposta = new BigDecimal("48563.31");
        assertEquals(resposta, totalSalario);
    }
}
