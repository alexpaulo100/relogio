# Relógio (Clock Conversion)

Projeto Java desenvolvido com o objetivo de praticar **orientação a objetos**, **testes automatizados com JUnit 5** e **integração contínua (CI/CD)**.

O sistema realiza a conversão de horários entre os formatos **24 horas (BR)** e **12 horas (US)**, utilizando `enum` para representar períodos (`AM` / `PM`) e garantindo consistência através de testes automatizados.

[![CI - Maven Build](https://github.com/alexpaulo100/relogio/actions/workflows/ci.yml/badge.svg)](https://github.com/alexpaulo100/relogio/actions/workflows/ci.yml)

---

## Tecnologias Utilizadas

- **Java 21**
- **Maven**
- **JUnit 5**
- **Git / GitHub**
- **CI/CD (execução automática de testes)**

---

## 📂 Estrutura do Projeto

```relogio
├── pom.xml
├── src
│ ├── main
│ │ └── java
│ │ └── br/com/relogio
│ │ ├── Clock.java
│ │ ├── BRLClock.java
│ │ ├── USClock.java
│ │ └── Period.java
│ └── test
│ └── java
│ └── br/com/relogio
│ ├── USClockTest.java
│ └── ClockConversionTest.java
└── target
```

---

## Funcionalidades

- Conversão de horário **24h → 12h**
- Identificação automática de período (`AM` / `PM`)
- Validação de valores inválidos (hora, minuto e segundo)
- Formatação de horário no padrão:


---

## Testes Automatizados

O projeto possui testes unitários com **JUnit 5**, cobrindo:

- Conversão de meia-noite (00:00 → 12:00 AM)
- Conversão de horários da tarde (15:00 → 03:00 PM)
- Validação de valores inválidos
- Conversão entre tipos de relógio

Para executar os testes localmente use o comando `mvn clean test`:



### CI/CD

Este projeto foi preparado para rodar em pipelines de **CI/CD**, onde:

- O código é compilado automaticamente
- Os testes são executados via **Maven**
- O build falha caso algum teste não passe

**Comando utilizado no pipeline:**

```mvn clean test```



### Objetivo do Projeto 

Este projeto tem objetivo educacional e demonstrativo, sendo utilizado como:

- Estudo prático de Java moderno
- Exercício de testes automatizados
- Exemplo de projeto pronto para CI/CD
- Item de portfólio técnico

---

### Autor

**Alex Silva**  
Desenvolvedor Backend  


---


