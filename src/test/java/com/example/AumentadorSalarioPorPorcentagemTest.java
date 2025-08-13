package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AumentadorSalarioPorPorcentagemTest {

    @Test
    public void deveAumentarSalarioTodosFuncionarios() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        AumentadorSalarioPorPorcentagem aumentadorSalario = new AumentadorSalarioPorPorcentagem();
        BigDecimal porcentagem = new BigDecimal(10);
        List<Funcionario> funcionariosSalarioAumentado = aumentadorSalario.aumentarSalarios(funcionarios, porcentagem);

        assertTrue(funcionariosSalarioAumentado.size() == funcionarios.size());
        BigDecimal respostaSalario1 = new BigDecimal("2210.38");
        assertEquals(respostaSalario1, funcionariosSalarioAumentado.get(0).getSalario());
        BigDecimal respostaSalario10 = new BigDecimal("3079.92");
        assertEquals(respostaSalario10, funcionariosSalarioAumentado.get(9).getSalario());
    }
}
