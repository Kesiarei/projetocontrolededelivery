
# Restaurant Delivery API

A API Restaurant Delivery é um sistema simplificado para o controle de delivery de um restaurante. Ela oferece endpoints para gerenciar clientes, pedidos e entregas. 

## Tecnologias Utilizadas

- Java 8
- Spring Boot 2
- Banco de Dados PostgreSQL
- Maven
- OpenAPI 3.0 (Swagger)

## Configuração do Ambiente

1. Clone o repositório:

bash
git clone https://github.com/seu-usuario/seu-repositorio.git


2. Configure o Banco de Dados:

   Abra o arquivo `src/main/resources/application.yml` e atualize as seguintes propriedades com as informações do seu banco de dados PostgreSQL:

yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/seu_banco_de_dados
    username: seu_usuario
    password: sua_senha


3. Execute o Aplicativo:

bash
mvn spring-boot:run


4. Acesse a Documentação da API:

   Abra o navegador e acesse [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) para visualizar e testar os endpoints da API.

## Endpoints Disponíveis

### Clientes

- `GET /clientes`: Retorna a lista de clientes.
- `GET /clientes/{id}`: Retorna os detalhes de um cliente pelo ID.
- `POST /clientes`: Cria um novo cliente.
- `PUT /clientes/{id}`: Atualiza os detalhes de um cliente pelo ID.
- `DELETE /clientes/{id}`: Deleta um cliente pelo ID.

### Pedidos

- `GET /pedidos`: Retorna a lista de pedidos.
- `GET /pedidos/{id}`: Retorna os detalhes de um pedido pelo ID.
- `POST /pedidos`: Cria um novo pedido.
- `PUT /pedidos/{id}`: Atualiza os detalhes de um pedido pelo ID.
- `DELETE /pedidos/{id}`: Deleta um pedido pelo ID.

### Entregas

- `GET /entregas`: Retorna a lista de entregas.
- `GET /entregas/{id}`: Retorna os detalhes de uma entrega pelo ID.
- `POST /entregas`: Cria uma nova entrega.
- `PUT /entregas/{id}`: Atualiza os detalhes de uma entrega pelo ID.
- `DELETE /entregas/{id}`: Deleta uma entrega pelo ID.

## Testes Automatizados

Para executar os testes automatizados, utilize o seguinte comando:

bash
mvn test


## Autor

Kesia Reis - [kesiag80@outlook.com](mailto:seu.email@example.com)

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.


Certifique-se de substituir `seu-usuario`, `seu-repositorio`, `seu_banco_de_dados`, `seu_usuario`, `sua_senha`, `Nome Sobrenome` e `seu.email@example.com` com as informações reais do seu projeto. Este README oferece detalhes sobre a configuração, utilização e características da sua API, o que pode ajudar os outros a entender e usar o que você desenvolveu.
