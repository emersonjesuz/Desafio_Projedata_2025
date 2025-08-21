package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FuncionariosFiltrarPorAnivesarioNoMesTest {
    @Test
    public void deveFiltraFuncionariosPorAnimvesarioNoMes10e12() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        List<Integer> mesesAnivesarios = new ArrayList<>();
        mesesAnivesarios.add(10);
        mesesAnivesarios.add(12);
        FuncionariosFiltrarPorAnivesarioNoMes funcionariosFiltrarPorAnivesarioNoMes = new FuncionariosFiltrarPorAnivesarioNoMes(
                mesesAnivesarios);
        List<Funcionario> listaFuncionariosPorAnivesarioNoMes = funcionariosFiltrarPorAnivesarioNoMes
                .filtra(funcionarios);
        String nomePrimeiroResposta = "Maria";
        String nomeUltimoResposta = "Miguel";
        assertTrue(listaFuncionariosPorAnivesarioNoMes.size() == 2);
        assertTrue(listaFuncionariosPorAnivesarioNoMes.get(0).getNome().equals(nomePrimeiroResposta));
        assertTrue(listaFuncionariosPorAnivesarioNoMes.get(1).getNome().equals(nomeUltimoResposta));
    }

    @Test
    public void deveFiltraFuncionariosPorAnimvesarioNoMes5e7() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        List<Integer> mesesAnivesarios = new ArrayList<>();
        mesesAnivesarios.add(5);
        mesesAnivesarios.add(7);
        FuncionariosFiltrarPorAnivesarioNoMes funcionariosFiltrarPorAnivesarioNoMes = new FuncionariosFiltrarPorAnivesarioNoMes(
                mesesAnivesarios);
        List<Funcionario> listaFuncionariosPorAnivesarioNoMes = funcionariosFiltrarPorAnivesarioNoMes
                .filtra(funcionarios);

        List<String> listaNomesFuncionario = new ArrayList<>(Arrays.asList("João", "Caio", "Laura", "Heloísa"));
        listaFuncionariosPorAnivesarioNoMes.forEach(System.out::println);
        assertTrue(listaFuncionariosPorAnivesarioNoMes.stream()
                .allMatch(funcionario -> listaNomesFuncionario.contains(funcionario.getNome())));
    }
}
