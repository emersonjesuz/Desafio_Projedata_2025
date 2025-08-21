package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Funcionario extends Pessoa {
    private final static BigDecimal BASE_PORCENTAGEM = new BigDecimal(100);
    private final static BigDecimal SALARIO_MINIMO = new BigDecimal("1212.00");
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String name, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(name, dataNascimento);

        this.validarSalario(salario);
        this.validarFuncao(funcao);

        this.salario = salario;
        this.funcao = funcao;
    }

    private void validarSalario(BigDecimal salario) {
        if (salario.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O salario não pode ser menor que R$ 0,01");
        }
    }

    private void validarFuncao(String funcao) {
        if (funcao.isEmpty()) {
            throw new IllegalArgumentException("A função do funcionario é obrigatória!");
        }
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

    public String getSalarioFormatado() {
        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatador.format(this.salario);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - Data de Nascimento: " + getDataFormatada() + " - Salario: "
                + getSalarioFormatado() + " - Função: " + funcao;
    }
}
