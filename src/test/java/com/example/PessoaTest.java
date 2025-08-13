package com.example;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void deveCriarPessoaComDadosValidos() {
        String nome = "Marcelo";
        LocalDate dataNascimento = LocalDate.parse("2000-10-18");
        Pessoa pessoa = new Pessoa(nome, dataNascimento);
        assertEquals(nome, pessoa.getNome());
        assertEquals(dataNascimento, pessoa.getDataNascimento());
    }

    @Test
    public void deveLancarErroQuandoNomeVazio() {
        String nome = "";
        LocalDate dataNascimento = LocalDate.parse("2000-10-18");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Pessoa(nome, dataNascimento));
        assertEquals("O nome é obrigatório!", exception.getMessage());
    }

    @Test
    void deveLancarErroQuandoDataNascimentoNula() {
        String nome = "Marcelo";
        LocalDate dataNascimento = null;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Pessoa(nome, dataNascimento));
        assertEquals("A data de nascimento é obrigatória!", exception.getMessage());
    }
}
