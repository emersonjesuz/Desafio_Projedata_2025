# TESTE PRÁTICO DA PROJEDATA

---

## Considerando que uma indústria possui as pessoas/funcionários abaixo:

Diante disso, você deve desenvolver um projeto java, com os seguintes requisitos:

## Requisitos do projeto

Este projeto Java 17 consiste em gerenciar uma lista de funcionários de uma indústria, com as seguintes classes e funcionalidades:

- **1 – Classe Pessoa**: atributos `nome` (String) e `dataNascimento` (LocalDate).
- **2 – Classe Funcionário**: estende Pessoa, com atributos `salario` (BigDecimal) e `funcao` (String).
- **3 – Classe Principal**: executa as seguintes ações:

  - 3.1 – Inserir todos os funcionários na mesma ordem da tabela fornecida.
  - 3.2 – Remover o funcionário “João” da lista.
  - 3.3 – Imprimir todos os funcionários com todas as informações:
    • data no formato dd/MM/yyyy;
    • valores numéricos com ponto como separador de milhar e vírgula como decimal.
  - 3.4 – Aplicar 10% de aumento no salário e atualizar a lista.
  - 3.5 – Agrupar funcionários por função em um Map (`função` → `lista de funcionários`).
  - 3.6 – Imprimir os funcionários agrupados por função.
  - 3.8 – Imprimir os funcionários que fazem aniversário nos meses 10 e 12.
  - 3.9 – Imprimir o funcionário com maior idade (nome e idade).
  - 3.10 – Imprimir a lista de funcionários em ordem alfabética.
  - 3.11 – Imprimir o total dos salários dos funcionários.
  - 3.12 – Calcular quantos salários mínimos cada funcionário recebe (salário mínimo = R\$1212,00).

---

## Orientações gerais

- Pode utilizar qualquer IDE ou editor de sua preferência (Eclipse, IntelliJ, NetBeans).
- Após finalizar, exporte o projeto e envie o link na etapa “Mão na Massa 🖐”.
- Haverá entrevista técnica para avaliação.

---

## Requisitos do ambiente

- **Java 17**
- **Maven**

---

## Como rodar o projeto

### 1️⃣ Abrindo o terminal

Navegue até a pasta raiz do projeto, onde está o `pom.xml`.

---

### 2️⃣ Compilando o projeto

```bash
mvn clean compile
```

---

### 3️⃣ Executando o projeto

```bash
mvn exec:java
```
