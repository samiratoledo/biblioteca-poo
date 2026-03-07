# 📚 Bibliotech: Sistema de Gerenciamento de Biblioteca em Java

Este projeto é uma aplicação simples desenvolvida para simular um **sistema de biblioteca no terminal**, utilizando **Java** e conceitos de **Programação Orientada a Objetos (POO)**.  
O foco principal foi praticar **estruturação de código em múltiplas classes**, manipulação de **listas (`ArrayList`)** e organização de responsabilidades entre objetos.

## 🔗 Repositório

> **Acesse o projeto aqui:**  
(https://github.com/samiratoledo/bibliotech) 🚀

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Java:** Linguagem principal do projeto.
* **Programação Orientada a Objetos (POO):**
  * Classes e objetos
  * Encapsulamento
  * Métodos `get` e `set`
  * Separação de responsabilidades
* **ArrayList:**
  * Armazenamento dinâmico de usuários e livros
* **Scanner:**
  * Entrada de dados pelo terminal
* **Estruturas de Controle:**
  * `switch`
  * `for`
  * `while`

---

## 🌟 Funcionalidades

* **Listagem de Acervo:** Exibe todos os livros cadastrados com status de disponibilidade.
* **Cadastro de Livros:** Permite adicionar novos livros ao sistema.
* **Cadastro de Usuários:** Permite registrar usuários da biblioteca.
* **Empréstimo de Livros:** Associa um livro a um usuário e altera seu status para emprestado.
* **Devolução de Livros:** Atualiza o status do livro para disponível novamente.
* **Sistema de Menu Interativo:** Navegação simples através do terminal.

---

## 🏗 Estrutura do Projeto

O sistema foi organizado em diferentes classes para manter o código mais limpo e modular:
Bibliotech
│
├── App.java
├── Livro.java
├── Usuario.java
└── Acervo.java


**App.java**  
Responsável pelo controle do sistema e pela interface de menu no terminal.

**Livro.java**  
Representa um livro da biblioteca, contendo informações como nome, autor e disponibilidade.

**Usuario.java**  
Representa um usuário cadastrado no sistema, contendo dados como nome, CPF e email.

**Acervo.java**  
Responsável por gerenciar a coleção de livros da biblioteca, incluindo listagem e organização do acervo.

---

## 📚 Objetivo do Projeto

Este projeto foi desenvolvido com o objetivo de praticar:

* Estruturação de sistemas utilizando **POO**
* Manipulação de **listas em Java**
* Organização de código em **múltiplas classes**
* Desenvolvimento de aplicações simples no **terminal**
