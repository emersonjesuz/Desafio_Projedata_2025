package com.example;

import java.util.List;
import java.util.Map;

public interface ImprimirFiltro<I> {
    public void imprimir(I entrada, String titulo);
}

class ImprimirFuncionarios implements ImprimirFiltro<List<Funcionario>> {
    @Override
    public void imprimir(List<Funcionario> funcionarios, String titulo) {
        System.out.println("");
        System.out.println("----- " + titulo + " -----");
        System.out.println("");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
        System.out.println("");
    }
}

class ImprimirFuncionariosPorFuncao implements ImprimirFiltro<Map<String, List<Funcionario>>> {
    @Override
    public void imprimir(Map<String, List<Funcionario>> funcionarios, String titulo) {
        System.out.println("\n----- " + titulo + " -----");
        System.out.println("");
        for (Map.Entry<String, List<Funcionario>> funcao : funcionarios.entrySet()) {
            System.out.println(funcao.getKey() + ": ");
            for (Funcionario funcionario : funcao.getValue()) {
                System.out.println("   " + funcionario);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}

class ImprimirFuncionarioMaisVelho implements ImprimirFiltro<Funcionario> {
    @Override
    public void imprimir(Funcionario funcionario, String titulo) {
        System.out.println("----- " + titulo + " -----");
        System.out.println("");
        System.out.println("Nome: " + funcionario.getNome() + " - Idade: " + funcionario.getIdade());
        System.out.println("");
    }
}

class ImprimirTotalSalarios implements ImprimirFiltro<String> {
    @Override
    public void imprimir(String salario, String titulo) {
        System.out.println("----- " + titulo + " -----");
        System.out.println("");
        System.out.println("Total: " + salario);
        System.out.println("");
    }
}

class ImprimirSalariosMinimosFuncionarios implements ImprimirFiltro<List<Funcionario>> {
    @Override
    public void imprimir(List<Funcionario> funcionarios, String titulo) {
        System.out.println("----- " + titulo + " -----");
        System.out.println("");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(
                    "Nome: " + funcionario.getNome() + " - Salários mínimos: " + funcionario.calcularSalariosMinimos());
        }
        System.out.println("");
    }
}