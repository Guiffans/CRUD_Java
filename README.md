
# Projeto de Gerenciamento de Pessoas 🧑‍🤝‍🧑

Este projeto é uma aplicação web em Java usando o Spring Framework, com o objetivo de gerenciar informações de pessoas. Ele permite listar, adicionar, editar e deletar pessoas de um sistema.

## Funcionalidades 🚀

- **Listar Pessoas** 📋: Visualize todas as pessoas cadastradas no sistema.
- **Adicionar Pessoa** ➕: Adicione uma nova pessoa ao sistema, fornecendo o nome e CPF.
- **Editar Pessoa** ✏️: Atualize as informações de uma pessoa existente.
- **Deletar Pessoa** 🗑️: Remova uma pessoa do sistema.

![image](https://github.com/user-attachments/assets/5f24dec3-981c-4e4e-9ff6-2feb08d6eec5)

## Estrutura do Projeto 📁

- **Controller**: A classe `PessoaController` manipula as requisições HTTP e direciona as ações para a camada de dados.
- **Model**: A classe `Pessoa` representa o modelo de dados de uma pessoa, com os campos `id`, `nome` e `cpf`.
- **Interface Repository**: `PessoaRepository` é a interface que permite o acesso e manipulação dos dados no banco de dados.

![image](https://github.com/user-attachments/assets/38d5a925-94dd-4a12-b053-4a72af9f780c)


## Views HTML 🌐

A aplicação utiliza **Thymeleaf** para renderizar as páginas HTML:

- **listar-pessoas.html** 📝: Exibe a lista de pessoas cadastradas com seus detalhes e ações.  
  - Possui uma tabela que apresenta `ID`, `Nome`, e `CPF` de cada pessoa.
  - Oferece botões para editar e deletar cada registro.
  - Link para adicionar uma nova pessoa.

- **form-pessoa.html** 🖊️: Formulário para adicionar ou editar uma pessoa.  
  - Campos: `Nome` e `CPF` com validação de preenchimento.
  - Botão "Salvar" para enviar as informações ao banco de dados e botão "Voltar" para retornar à lista de pessoas.

## Arquivo de Configuração de Banco de Dados 🛠️

O projeto é configurado para se conectar a um banco de dados MySQL com as seguintes configurações:

![image](https://github.com/user-attachments/assets/ad4a6ab7-a587-44ad-b902-d9f34677650d)

## Tecnologias Utilizadas 🛠️

- Java ☕
- Spring Boot 🌱
- Spring Data JPA 🗄️
- Thymeleaf 🌐
- Banco de Dados MySQL 💾

## Como Rodar o Projeto ▶️

1. Clone o repositório.
2. Configure o banco de dados MySQL conforme indicado nas configurações.
3. Execute o projeto com o comando:

```bash
mvn spring-boot:run
```

4. Acesse a aplicação em: `http://localhost:8080/pessoas`

