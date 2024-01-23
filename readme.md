Olá Analistas, desenvolvedores e recrutadores. Este readme irá apresentar a estrutura deste projeto API utilizando cucumber e screenplay pattern de portfólio pessoal.
A linguagem base é o JAVA e iremos abordar cenário inicial de utilização do aprendizado.

* Projeto para fazer os testes automatizados api rest.
  - url base a ser testada é a do k6 para estudos e cursos: https://test-api.k6.io/

### Setup necessário ###


* Ter SDK JAVA 11
* Baixar as dependencias do projeto 
```
mvn clean install
```


### Estrutura do projeto ###

* tests - Local onde são armazenados todos as classes de testes.
* features - local onde são armazenados nossas classes .features do negócio
* serenity.config - Arquivo de configuração da nossa URL base da API
* K6Api - Classe onde realizamos a integração com nosso arquivo serenity.config
* steps - Classe onde integramos as features com o código de interação com a API através do screenPlay pattern
* CucumberSuiteTest - Classe que configuramos onde se encontra nossos arquivos de feature
* target - diretório onde são armazenados os resultados das execuções de nossos testes

### Rodando o projeto ###

* Acessa a pasta do projeto
* Rode todas as suites de testes:

```
mvn verify
```

### Repositório github ###

* Consulte meu repositório de diversos projetos no github através da url

```
https://github.com/israfaioli?tab=repositories
```