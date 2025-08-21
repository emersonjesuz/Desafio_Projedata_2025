package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface FuncionarioFiltro<R> {
    public R filtra(List<Funcionario> funcionarios);
}

class FuncionariosFiltrarPorFuncoes implements FuncionarioFiltro<Map<String, List<Funcionario>>> {
    @Override
    public Map<String, List<Funcionario>> filtra(List<Funcionario> funcionarios) {
        Map<String, List<Funcionario>> listaFuncionariosPorFuncao = new HashMap<>();
        for (Funcionario funcionario : funcionarios) {
            if (!listaFuncionariosPorFuncao.containsKey(funcionario.getFuncao())) {
                List<Funcionario> novaListaFuncionarios = new ArrayList<>();
                novaListaFuncionarios.add(funcionario);
                listaFuncionariosPorFuncao.put(funcionario.getFuncao(), novaListaFuncionarios);
                continue;
            }
            listaFuncionariosPorFuncao.get(funcionario.getFuncao()).add(funcionario);
        }
        return listaFuncionariosPorFuncao;
    }
}

class FuncionariosFiltrarPorAnivesarioNoMes implements FuncionarioFiltro<List<Funcionario>> {
    private List<Integer> mesesAnivesarios;

    public FuncionariosFiltrarPorAnivesarioNoMes(List<Integer> mesesAnivesarios) {
        this.mesesAnivesarios = mesesAnivesarios;
    }

    @Override
    public List<Funcionario> filtra(List<Funcionario> funcionarios) {
        return funcionarios.stream()
                .filter(funcionario -> this.mesesAnivesarios.contains(funcionario.getDataNascimento().getMonthValue()))
                .collect(Collectors.toList());
    }
}

class FuncionarioFiltrarComMaiorIdade implements FuncionarioFiltro<Funcionario> {
    @Override
    public Funcionario filtra(List<Funcionario> funcionarios) {
        Funcionario funcionarioMaisVelho = funcionarios.get(0);
        for (int index = 1; index < funcionarios.size(); index++) {
            Funcionario funcionario = funcionarios.get(index);
            if (funcionario.getIdade() > funcionarioMaisVelho.getIdade()) {
                funcionarioMaisVelho = funcionarios.get(index);
            }
        }
        return funcionarioMaisVelho;
    }
}

class FuncionariosFiltrarPorOrdemAlfabetica implements FuncionarioFiltro<List<Funcionario>> {
    @Override
    public List<Funcionario> filtra(List<Funcionario> funcionarios) {
        return funcionarios.stream().sorted((a, b) -> a.getNome().compareTo(b.getNome())).collect(Collectors.toList());
    }
}
