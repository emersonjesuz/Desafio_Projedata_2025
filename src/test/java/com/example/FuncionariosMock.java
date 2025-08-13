package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuncionariosMock {
    public static List<Funcionario> lista() {
        return new ArrayList<>(Arrays.asList(
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

    }
}
