#language:pt
#Author: Vinicius Marra Santos
@testeCEP
Funcionalidade: testes de login da pagina financeiro

  @testeCEP
  Esquema do Cenario: testes de login cenarios negativos no chrome
    Dado que eu acesse a API "<url>"
    Quando passo o CEP "<cep>"
    Entao eu devo receber a resposta "<resposta>"

    Exemplos: 
      | Cenario         	| url																												|cep				|resposta |
      | CEP correto		 		| https://financeiro.hostgator.com.br/api/v3/checkout/cep/  |04384032		|200			|
      | CEP correto	com -	| https://financeiro.hostgator.com.br/api/v3/checkout/cep/  |04384-032	|200			|
      | CEP invalido 			| https://financeiro.hostgator.com.br/api/v3/checkout/cep/  |00000000		|404			|
      | CEP em branco 		| https://financeiro.hostgator.com.br/api/v3/checkout/cep/  |						|405			|
      | CEP incompleto		| https://financeiro.hostgator.com.br/api/v3/checkout/cep/  |1					|400			|
      | enviar letras			| https://financeiro.hostgator.com.br/api/v3/checkout/cep/  |dsaasdasd	|400			|