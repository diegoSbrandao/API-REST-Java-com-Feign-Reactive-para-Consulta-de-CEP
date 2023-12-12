# API REST Java com Feign Reactive para Consulta de CEP

Este projeto é um projeto de teste para aprender a utilizar o feign reactive numa API REST Java, sendo que para tal, essa api fará o consumo de dados de CEP de uma API externa, a API do ViaCEP (https://viacep.com.br) e obter informações de endereços a partir de um CEP.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 2.5.15
- Feign Reactive 3.0.3
- Lombok
- Reactor Core
- Spring WebFlux

## Estrutura do Projeto

- CepResponse: DTO que representa a resposta da API de CEP.
- CepService: Serviço que utiliza o Feign Reactive para consultar informações de CEP.
- RestExceptionHandler: Handler de exceções, tratando exceções específicas.
- CepController: Controlador REST que expõe endpoints relacionados a CEP.

## Funcionalidade

A API disponibiliza um endpoint /zipcode/{zipCode} que recebe um CEP como parâmetro e retorna um objeto CepResponse contendo as informações do endereço associado ao CEP.

## Como Rodar

Configuração do Ambiente:

Certifique-se de ter o Java 17 instalado em seu ambiente.
Build do Projeto:

Utilize o Maven para construir o projeto.
`mvn clean install`

Execução da Aplicação:
Execute o JAR gerado pelo Maven.
`java -jar target/consumer-sqs-0.0.1-SNAPSHOT.jar`

### Acesso à API:
- A API estará disponível em http://localhost:8080/zipcode/{zipCode}.
- Substitua {zipCode} pelo CEP desejado na URL.

## Tratamento de Exceções
- CepNotFoundException: Retorna um status 404 quando o CEP não é encontrado.
- CommunicationException: Retorna um status 500 em caso de erro de comunicação com o servidor.

#Observações
- Certifique-se de que a aplicação esteja rodando antes de fazer chamadas à API.
- Este projeto utiliza a versão mais recente do Feign Reactive disponível no momento da criação deste README. Recomenda-se verificar se há versões mais recentes disponíveis.
- Lembre-se de substituir as versões das dependências conforme necessário e considerar atualizações regulares para manter a segurança e a compatibilidade.

