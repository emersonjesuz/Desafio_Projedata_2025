package com.example;

import java.math.BigDecimal;
import java.util.List;

public class CalculadorTotalDeSalarios {
    public BigDecimal calcular(List<Funcionario> funcionarios) {
        return funcionarios.stream().map(funcionario -> funcionario.getSalario()).reduce(BigDecimal.ZERO,
                (acumulador, salario) -> acumulador.add(salario));
    }
}
