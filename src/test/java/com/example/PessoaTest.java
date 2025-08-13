package com.example;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testaCriarPessoa() {
        String nome = "Marcelo";
        LocalDate dataNascimento = LocalDate.parse("2000-10-18");
        Pessoa pessoa = new Pessoa(nome, dataNascimento);
        Assertions.assertEquals(pessoa.getNome(), nome);
        Assertions.assertEquals(pessoa.getDataNascimento(), dataNascimento);
    }

    // @Test
    // public void testaErroNomeVazio() {
    // String nome = "";
    // LocalDate dataNascimento = LocalDate.parse("2000-10-18");
    // Pessoa pessoa = new Pessoa(nome, dataNascimento);
    // Assertions.assertThrows(pessoa, "Nome não pode ser vazio!");

    // }
}
