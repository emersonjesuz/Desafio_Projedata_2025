package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FuncionariosFiltrarPorOrdemAlfabeticaTest {
    @Test
    public void deveRetornaFuncionariosEmOrdemAlfabetica() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        FuncionariosFiltrarPorOrdemAlfabetica filtrarPorOrdemAlfabetica = new FuncionariosFiltrarPorOrdemAlfabetica();
        List<Funcionario> listaFuncionariosOrdemAlfabetica = filtrarPorOrdemAlfabetica.filtra(funcionarios);
        String nomePrimeiroResposta = "Alice";
        String nomeUltimoResposta = "Miguel";
        assertTrue(listaFuncionariosOrdemAlfabetica.size() == 10);
        assertTrue(listaFuncionariosOrdemAlfabetica.get(0).getNome().equals(nomePrimeiroResposta));
        assertTrue(listaFuncionariosOrdemAlfabetica.get(9).getNome().equals(nomeUltimoResposta));
    }
}
