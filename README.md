# Projeto DB-DAO

Este projeto demonstra uma aplicação Java simples para interação com um banco de dados relacional utilizando o padrão de projeto DAO (Data Access Object). Ele inclui classes e interfaces para operações de banco de dados, classes de entidade representando tabelas do banco de dados e uma classe de fábrica para criar instâncias DAO.

## Tecnologias

- Java
- JDBC (Java Database Connectivity)
- MySQL (Banco de Dados)
- Maven (Gerenciamento de Dependências)

## Configuração

Para executar este projeto localmente, você precisa ter o Java e o Maven instalados no seu sistema. Você também precisa ter acesso a um banco de dados MySQL.

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/rodri-oliveira/dao-jdbc.git
## Uso

Esta aplicação permite realizar operações CRUD (CREATE, READ, UPDADTE, DELETE) em duas entidades: `Department` e `Seller`. Ela fornece funcionalidades como inserção, atualização, exclusão e busca de registros no banco de dados.

## Estrutura do Projeto

O projeto tem a seguinte estrutura:

- `src/main/java/db`: Contém classes relacionadas à conexão com o banco de dados e exceções.
- `src/main/java/model/dao`: Contém interfaces para classes DAO.
- `src/main/java/model/dao/impl`: Contém classes de implementação para as interfaces DAO.
- `src/main/java/model/entities`: Contém classes de entidade representando tabelas do banco de dados.

## Contribuição

Contribuições são bem-vindas! Por favor, sinta-se à vontade para enviar um pull request ou abrir uma issue se encontrar algum bug ou quiser sugerir melhorias.


