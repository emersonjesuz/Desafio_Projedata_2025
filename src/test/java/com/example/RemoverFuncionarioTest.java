package com.example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class RemoverFuncionarioTest {
    @Test
    public void deveRemoverFuncionarioPeloNome() {
        List<Funcionario> funcionarios = FuncionariosMock.lista();
        String nomeFuncionario = "caio";
        RemoverFuncionario removerFuncionario = new RemoverFuncionario();
        List<Funcionario> novaListaFuncionarios = removerFuncionario.remover(funcionarios, nomeFuncionario);
        Boolean temFuncionario = false;
        for (Funcionario funcionario : novaListaFuncionarios) {
            if (funcionario.getNome() == nomeFuncionario) {
                temFuncionario = true;
            }
        }
        assertFalse(temFuncionario);
    }
}
