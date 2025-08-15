package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
        public static void main(String[] args) {
                List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(
                                new Funcionario("Maria", LocalDate.parse("2000-10-18"), new BigDecimal("2009.44"),
                                                "Operador"),
                                new Funcionario("João", LocalDate.parse("1990-05-12"), new BigDecimal("2284.38"),
                                                "Operador"),
                                new Funcionario("Caio", LocalDate.parse("1961-05-02"), new BigDecimal("9836.14"),
                                                "Coordenador"),
                                new Funcionario("Miguel", LocalDate.parse("1988-10-14"), new BigDecimal("19119.88"),
                                                "Diretor"),
                                new Funcionario("Alice", LocalDate.parse("1995-01-05"), new BigDecimal("2234.68"),
                                                "Recepcionista"),
                                new Funcionario("Heitor", LocalDate.parse("1999-11-19"), new BigDecimal("1582.72"),
                                                "Operador"),
                                new Funcionario("Arthur", LocalDate.parse("1993-03-31"), new BigDecimal("4071.84"),
                                                "Contador"),
                                new Funcionario("Laura", LocalDate.parse("1994-07-08"), new BigDecimal("3017.45"),
                                                "Gerente"),
                                new Funcionario("Heloísa", LocalDate.parse("2003-05-24"), new BigDecimal("1606.85"),
                                                "Eletricista"),
                                new Funcionario("Helena", LocalDate.parse("1996-09-02"), new BigDecimal("2799.93"),
                                                "Gerente")));

                RemoverFuncionario removerFuncionario = new RemoverFuncionario();
                List<Funcionario> novaListaFuncionarios = removerFuncionario.remover(funcionarios, "João");
                ImprimirFuncionarios imprimirFuncionarios = new ImprimirFuncionarios();
                imprimirFuncionarios.imprimir(novaListaFuncionarios, "Lista de funcionarios");

                AumentadorSalarioPorPorcentagem aumentadorSalarioPorPorcentagem = new AumentadorSalarioPorPorcentagem();
                BigDecimal porcentagemAumentoSalario = new BigDecimal(10);
                List<Funcionario> funcionariosComAumentoSalario = aumentadorSalarioPorPorcentagem.aumentarSalarios(
                                novaListaFuncionarios,
                                porcentagemAumentoSalario);
                imprimirFuncionarios.imprimir(funcionariosComAumentoSalario, "Lista de funcionarios com aumento");

                FuncionarioFiltro<Map<String, List<Funcionario>>> funcionariosFiltrarPorFuncoes = new FuncionariosFiltrarPorFuncoes();
                Map<String, List<Funcionario>> funcionariosFiltradoPorFuncao = funcionariosFiltrarPorFuncoes
                                .filtra(funcionariosComAumentoSalario);

                ImprimirFuncionariosPorFuncao imprimirFuncionariosPorFuncao = new ImprimirFuncionariosPorFuncao();
                imprimirFuncionariosPorFuncao.imprimir(funcionariosFiltradoPorFuncao,
                                "Lista de funcionarios por funções");

                FuncionarioFiltro<List<Funcionario>> funcionariosFiltrarPorMesAnivesario = new FuncionariosFiltrarPorAnivesarioNoMes();
                imprimirFuncionarios.imprimir(funcionariosFiltrarPorMesAnivesario.filtra(funcionariosComAumentoSalario),
                                "Lista de funcionarios por mes de Anivesario 10 e 12");

                FuncionarioFiltro<Funcionario> funcionarioFiltrarComMaiorIdade = new FuncionarioFiltrarComMaiorIdade();
                Funcionario funcionarioMaisVelho = funcionarioFiltrarComMaiorIdade
                                .filtra(funcionariosComAumentoSalario);
                ImprimirFuncionarioMaisVelho imprimirFuncionarioMaisVelho = new ImprimirFuncionarioMaisVelho();
                imprimirFuncionarioMaisVelho.imprimir(funcionarioMaisVelho, "Funcionario mais velho");

                FuncionarioFiltro<List<Funcionario>> funcionariosPorOrdemAlfabetica = new FuncionariosFiltrarPorOrdemAlfabetica();
                imprimirFuncionarios.imprimir(funcionariosPorOrdemAlfabetica.filtra(funcionariosComAumentoSalario),
                                "Lista de funcionarios por order alfabética");

                CalculadorTotalDeSalarios calculadorTotalSalarios = new CalculadorTotalDeSalarios();
                ImprimirTotalSalarios imprimirTotalSalarios = new ImprimirTotalSalarios();
                imprimirTotalSalarios.imprimir(calculadorTotalSalarios.calcular(funcionariosComAumentoSalario),
                                "Valor total dos Salarios");

                ImprimirSalariosMinimosFuncionarios imprimirSalariosMinimosFuncionarios = new ImprimirSalariosMinimosFuncionarios();
                imprimirSalariosMinimosFuncionarios.imprimir(funcionariosComAumentoSalario,
                                "Lista de funcionarios com quantidade de salários Minimos");
        }
}
