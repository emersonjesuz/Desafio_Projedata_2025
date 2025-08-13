package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    final static BigDecimal BASE_PORCENTAGEM = new BigDecimal(100);
    final static BigDecimal SALARIO_MINIMO = new BigDecimal("1212.00");

    public Funcionario(String name, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(name, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void aumentarSalario(BigDecimal porcentagem) {
        BigDecimal porcentagemEmDecimal = porcentagem.divide(BASE_PORCENTAGEM);
        BigDecimal valorAcrescentarSalario = this.salario.multiply(porcentagemEmDecimal);
        BigDecimal novoSalario = valorAcrescentarSalario.add(this.salario);
        novoSalario = novoSalario.setScale(2, RoundingMode.HALF_UP);
        this.salario = novoSalario;
    }

    public BigDecimal calcularSalariosMinimos() {
        return this.salario.divide(SALARIO_MINIMO, 0, RoundingMode.DOWN);
    }

    public String getDataFormatada() {
        return FormatadorData.formatar(this.getDataNascimento());
    }

    public String getSalarioFormatado() {
        return FormatadorSalario.formatar(salario);
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(this.getDataNascimento(), hoje).getYears();
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Data de Nascimento: " + getDataFormatada() + " - Salario: "
                + getSalarioFormatado() + " - Função: " + funcao;
    }
}
