package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class RemoverFuncionario {
    public List<Funcionario> remover(List<Funcionario> funcionarios, String nome) {
        return funcionarios.stream().filter(funcionario -> !funcionario.getNome().equals(nome))
                .collect(Collectors.toList());
    }
}
