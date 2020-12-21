# Desafio HostGator

projeto para testes automatizados em API criado em Java, Maven, TestNg, rest-assured e Cucumber

## Instalação

Baixe ou clone o repositório

Instale a ultima versão do Eclipse

Com o Eclipse aberto, importe o projeto via Projeto Maven Existente.

## Como Utilizar

necessario instalar o plugin do Cucumber no Eclipse para poder executar o projeto de dentro do próprio Eclipse.
```bash
botão direito sobre o projeto > Run as > Maven Install
```
Caso queira executar direto, necessario ter instalado o Maven e configurar nas variáveis de ambiente do Windows, com o seu pront de comando navegar ate a pasta onde contem o POM do projeto e digitar o comando abaixo

```maven
mvn clean install
```

## Report

Após executar o projeto, será gerado dentro da pasta "target" do projeto um arquivo JSON para poder ser utilizado em ci/cd, e uma pasta chamada cucumber-html-report com o arquivo "index.html", dentro deste html terá o relatório de execução do projeto

## Author

Vinicius Marra Santos - QA Engenier
