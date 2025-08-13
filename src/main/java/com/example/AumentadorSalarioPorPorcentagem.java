package com.example;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class AumentadorSalarioPorPorcentagem {
    public List<Funcionario> aumentarSalarios(List<Funcionario> funcionarios, BigDecimal porcentagem) {
        List<Funcionario> novoFuncionarios = funcionarios;
        return novoFuncionarios.stream().map(funcionario -> {
            funcionario.aumentarSalario(porcentagem);
            return funcionario;
        }).collect(Collectors.toList());
    }
}
