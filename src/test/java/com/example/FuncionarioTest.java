package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    public void deveCriarUmFuncionarioComDadosValidos() {
        String nome = "Manuel";
        LocalDate dataNascimento = LocalDate.parse("2000-10-18");
        BigDecimal salario = new BigDecimal(1000);
        String funcao = "programador";
        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario, funcao);
        assertEquals(nome, funcionario.getNome());
        assertEquals(dataNascimento, funcionario.getDataNascimento());
        assertEquals(salario, funcionario.getSalario());
        assertEquals(funcao, funcionario.getFuncao());
    }

    @Test
    public void deveAumentarSalarioFuncionario() {
        String nome = "Manuel";
        LocalDate dataNascimento = LocalDate.parse("2000-10-18");
        BigDecimal salario = new BigDecimal("1000");
        String funcao = "programador";
        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario, funcao);
        BigDecimal porcentagemAumento = new BigDecimal(10);
        funcionario.aumentarSalario(porcentagemAumento);
        BigDecimal resposta1 = new BigDecimal("1100.00");
        assertEquals(resposta1, funcionario.getSalario());
        funcionario.aumentarSalario(porcentagemAumento);
        BigDecimal resposta2 = new BigDecimal("1210.00");
        assertEquals(resposta2, funcionario.getSalario());
    }

    @Test
    public void deveCalcularQuantidadeSalarioMinimo() {
        String nome = "Manuel";
        LocalDate dataNascimento = LocalDate.parse("2000-10-18");
        BigDecimal salario = new BigDecimal("2500");
        String funcao = "programador";
        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario, funcao);
        BigDecimal porcentagemAumento = new BigDecimal(10);
        funcionario.aumentarSalario(porcentagemAumento);
        BigDecimal resposta = new BigDecimal(2);
        assertEquals(resposta, funcionario.calcularSalariosMinimos());

    }

    @Test
    public void deveRetornarSalarioFormatadoBRL() {
        String nome = "Manuel";
        LocalDate dataNascimento = LocalDate.parse("2000-10-18");
        BigDecimal salario = new BigDecimal("1000");
        String funcao = "programador";
        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario, funcao);
        String resposta = "R$ 1.000,00";
        assertEquals(resposta, funcionario.getSalarioFormatado());

    }

    @Test
    public void deveRetornarDataNascimentoFormatada() {
        String nome = "Manuel";
        LocalDate dataNascimento = LocalDate.parse("2000-10-18");
        BigDecimal salario = new BigDecimal("1000");
        String funcao = "programador";
        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario, funcao);
        String resposta = "18/10/2000";
        assertEquals(resposta, funcionario.getDataFormatada());
    }

    @Test
    public void deveRetornarIdadeFuncionario() {
        String nome = "Manuel";
        LocalDate dataNascimento = LocalDate.parse("1999-04-17");
        BigDecimal salario = new BigDecimal("1000");
        String funcao = "programador";
        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario, funcao);
        int resposta = 26;
        assertEquals(resposta, funcionario.getIdade());
    }

    @Test
    public void deveLancarErroQuandoNomeVazio() {
        String nome = "";
        LocalDate dataNascimento = LocalDate.parse("1999-04-17");
        BigDecimal salario = new BigDecimal("1000");
        String funcao = "programador";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Funcionario(nome, dataNascimento, salario, funcao));
        assertEquals("O nome é obrigatório!", exception.getMessage());
    }

    @Test
    public void deveLancarErroQuandoDataNascimentoNula() {
        String nome = "Jose";
        LocalDate dataNascimento = null;
        BigDecimal salario = new BigDecimal("1000");
        String funcao = "programador";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Funcionario(nome, dataNascimento, salario, funcao));
        assertEquals("A data de nascimento é obrigatória!", exception.getMessage());
    }

    @Test
    public void deveLancarErroQuandoSalarioMenorIgualZero() {
        String nome = "Jose";
        LocalDate dataNascimento = LocalDate.parse("1999-04-17");
        BigDecimal salario = BigDecimal.ZERO;
        String funcao = "programador";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Funcionario(nome, dataNascimento, salario, funcao));
        assertEquals("O salario não pode ser menor que R$ 0,01", exception.getMessage());
    }

    @Test
    public void deveLancarErroQuandoFuncaoVazia() {
        String nome = "Jose";
        LocalDate dataNascimento = LocalDate.parse("1999-04-17");
        BigDecimal salario = new BigDecimal(100);
        String funcao = "";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Funcionario(nome, dataNascimento, salario, funcao));
        assertEquals("A função do funcionario é obrigatória!", exception.getMessage());
    }
}
