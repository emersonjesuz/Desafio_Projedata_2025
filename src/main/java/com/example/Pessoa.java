package com.example;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.validarNome(nome);
        this.validarDataNascimento(dataNascimento);

        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    private void validarNome(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome é obrigatório!");
        }
    }

    private void validarDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null) {
            throw new IllegalArgumentException("A data de nascimento é obrigatória!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
}
