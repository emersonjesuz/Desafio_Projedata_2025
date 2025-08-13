package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FuncionarioFiltrarComMaiorIdadeTest {
    @Test
    public void deveRetornaFuncionarioMaisVelho() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        FuncionarioFiltrarComMaiorIdade funcionarioFiltrarComMaiorIdade = new FuncionarioFiltrarComMaiorIdade();
        Funcionario funcionarioMaisVelho = funcionarioFiltrarComMaiorIdade.filtra(funcionarios);
        int idadeResposta = 64;
        String nomeResposta = "Caio";
        assertTrue(funcionarioMaisVelho.getIdade() == idadeResposta);
        assertTrue(funcionarioMaisVelho.getNome().equals(nomeResposta));
    }
}
