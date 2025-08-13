package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FuncionariosFiltrarPorAnivesarioNoMesTest {
    @Test
    public void deveFiltraFuncionariosPorAnimvesarioNoMes() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        FuncionariosFiltrarPorAnivesarioNoMes funcionariosFiltrarPorAnivesarioNoMes = new FuncionariosFiltrarPorAnivesarioNoMes();
        List<Funcionario> listaFuncionariosPorAnivesarioNoMes = funcionariosFiltrarPorAnivesarioNoMes
                .filtra(funcionarios);
        String nomePrimeiroResposta = "Maria";
        String nomeUltimoResposta = "Miguel";
        assertTrue(listaFuncionariosPorAnivesarioNoMes.size() == 2);
        assertTrue(listaFuncionariosPorAnivesarioNoMes.get(0).getNome().equals(nomePrimeiroResposta));
        assertTrue(listaFuncionariosPorAnivesarioNoMes.get(1).getNome().equals(nomeUltimoResposta));
    }
}
