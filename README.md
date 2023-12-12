# API REST Java com Feign Reactive para Consulta de CEP
[![Java](https://img.shields.io/badge/Java-17-green.svg)](https://docs.oracle.com/javase/17/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.15-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Spring WebFlux](https://img.shields.io/badge/Spring%20WebFlux-3.2.0-brightgreen.svg)](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html)
[![Feign Reactive](https://img.shields.io/badge/Feign%20Reactive-3.0.3-blue.svg)](https://github.com/OpenFeign/feign)


Este projeto é um exemplo de como utilizar o feign reactive numa API REST Java para consumir dados de CEP de uma API externa, a API do ViaCEP (https://viacep.com.br). O projeto permite obter informações de endereços a partir de um CEP.

# Índice

- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Funcionalidade](#funcionalidade)
- [Acesso ao Projeto](#acesso-ao-projeto)
  - [Código Fonte](#acesso-ao-projeto)
  - [Clone do Projeto](#acesso-ao-projeto)
  - [Zip do Projeto](#acesso-ao-projeto)
- [Configuração do Ambiente](#configuração-do-ambiente)
  - [Abrir e Rodar o Projeto](#configuração-do-ambiente)
- [Acesso à API](#acesso-à-api)
- [Exemplo de Resposta](#exemplo-de-resposta)
- [Tratamento de Exceções](#tratamento-de-exceções)
- [Observações](#observações)


## [Tecnologias Utilizadas](#tecnologias-utilizadas)

- Java 17
- Spring Boot 2.5.15
- Feign Reactive 3.0.3
- Lombok
- Reactor Core
- Spring WebFlux

## [Estrutura do Projeto](#estrutura-do-projeto)

- CepResponse: DTO que representa a resposta da API de CEP.
- CepService: Serviço que utiliza o Feign Reactive para consultar informações de CEP.
- RestExceptionHandler: Handler de exceções, tratando exceções específicas.
- CepController: Controlador REST que expõe endpoints relacionados a CEP.

## [Funcionalidade](#funcionalidade)

A API disponibiliza um endpoint `/zipcode/{zipCode}` que recebe um CEP como parâmetro e retorna um objeto CepResponse contendo as informações do endereço associado ao CEP.

## [Acesso ao Projeto](#acesso-ao-projeto)

- Você pode [acessar o código fonte](https://github.com/diegoSbrandao/API_REST-Java-com-Feign_Reactive/tree/main/src/main/java/br/com/diego)
- ou fazer o clone do projeto: <pre><code>git clone https://github.com/diegoSbrandao/API_REST-Java-com-Feign_Reactive.git</code></pre>
- ou baixar o [zip do projeto](https://github.com/diegoSbrandao/API_REST-Java-com-Feign_Reactive/archive/refs/heads/main.zip).

## [Configuração do Ambiente](#configuração-do-ambiente)

* Certifique-se de ter o Java 17 instalado em seu ambiente.

### [Abrir e rodar o projeto](#configuração-do-ambiente)

Utilize o Maven para construir o projeto. <pre><code>`mvn clean install`</code></pre>

Execução da Aplicação: Execute o JAR gerado pelo Maven. <pre><code>`java -jar target/exemplo-feign-reactor-1.0.0.jar`</code></pre>

### [Acesso à API](#acesso-à-api)

- A API estará disponível em http://localhost:8080/zipcode/{zipCode}.
- Substitua {zipCode} pelo CEP desejado na URL.

### [Exemplo de Resposta](#exemplo-de-resposta)

```json
{
 "cep": "01001-000",
 "logradouro": "Praça Sete de Setembro",
 "complemento": "",
 "bairro": "Centro",
 "localidade": "Rio de Janeiro",
 "uf": "RJ"
}
```


## Tratamento de Exceções
- CepNotFoundException: Retorna um status 404 quando o CEP não é encontrado.
- CommunicationException: Retorna um status 500 em caso de erro de comunicação com o servidor.

#Observações
- Certifique-se de que a aplicação esteja rodando antes de fazer chamadas à API.
- Este projeto utiliza a versão mais recente do Feign Reactive disponível no momento da criação deste README. Recomenda-se verificar se há versões mais recentes disponíveis.
- Lembre-se de substituir as versões das dependências conforme necessário e considerar atualizações regulares para manter a segurança e a compatibilidade.

