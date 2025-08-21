package com.example;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CalculadorTotalDeSalarios {
    public String calcular(List<Funcionario> funcionarios) {
        BigDecimal total = funcionarios.stream().map(funcionario -> funcionario.getSalario()).reduce(BigDecimal.ZERO,
                (acumulador, salario) -> acumulador.add(salario));
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatador.format(total);
    }
}
