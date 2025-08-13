package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FuncionariosFiltrarPorFuncoesTest {
    @Test
    public void deveFiltraFuncionariosPorFuncoes() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        FuncionariosFiltrarPorFuncoes funcionariosFiltrarPorFuncoes = new FuncionariosFiltrarPorFuncoes();
        Map<String, List<Funcionario>> listaFuncionariosPorFuncao = funcionariosFiltrarPorFuncoes.filtra(funcionarios);

        assertTrue(listaFuncionariosPorFuncao.containsKey("Operador"));
        assertTrue(listaFuncionariosPorFuncao.get("Operador").size() == 3);
    }
}
