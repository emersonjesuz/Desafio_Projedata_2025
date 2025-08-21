package com.example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadorTotalDeSalariosTest {

    @Test
    public void deveRetornaCalculoTotalSalarioFuncionarios() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        CalculadorTotalDeSalarios calculadorTotalDeSalarios = new CalculadorTotalDeSalarios();
        String totalSalario = calculadorTotalDeSalarios.calcular(funcionarios);
        String resposta = "R$ 48.563,31";
        assertEquals(resposta, totalSalario);
    }
}
