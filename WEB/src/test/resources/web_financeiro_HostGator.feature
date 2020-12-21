#language:pt
#Author: Vinicius Marra Santos

@LoginFinanceiro
Funcionalidade: testes de login da pagina financeiro

	@login_testeC @Chrome
	Esquema do Cenario: testes de login cenarios negativos no chrome
    Dado que eu acesso a página "https://financeiro.hostgator.com.br/"
    Quando faco o login com o email "<EMAIL>" e digito a senha "<Senha>"
    E clico em Entrar
    Entao deve apresentar a mensagem de erro "<Msg>" do campo "<vCampo>"
    
  Exemplos:
  |Cenario									|vCampo			|EMAIL						|Senha		|Msg																								|
  |Senha em branco					|senha			|teste@teste.com	|					|	Please fill out this field.												|
  |email em branco					|email			|									|111111		|	Please fill out this field.												|
  |email invalido						|email			|testem						|111111		|	Please include an '@' in the email address.				|
  |senha com 1 caracter 		|senha			|teste@teste.com	|1				| Please lengthen this text to 5 characters or more	|

      
@login_testeF @Firefox
	Esquema do Cenario: testes de login cenarios negativos no firefox
    Dado que eu acesso a página "https://financeiro.hostgator.com.br/"
    Quando faco o login com o email "<EMAIL>" e digito a senha "<Senha>"
    E clico em Entrar
    Entao deve apresentar a mensagem de erro "<Msg>" do campo "<vCampo>"
    
  Exemplos:
  |Cenario							|vCampo	|EMAIL						|Senha		|Msg																								|
  |Senha em branco			|senha	|teste@teste.com	|					|	Please fill out this field.												|
  |email em branco			|email	|									|111111		|	Please fill out this field.												|
  |email invalido				|email	|testem						|111111		|	Please include an '@' in the email address.				|
  |senha com 1 caracter |senha	|teste@teste.com	|1				| Please lengthen this text to 5 characters or more	|
      

      
@recuperar_senha_teste_negativoc @Chrome
	Esquema do Cenario: testes de recuperar senha cenarios negativos no chrome
    Dado que eu acesso a página "https://financeiro.hostgator.com.br/"
    Quando eu clico no botão Esqueceu sua senha
    E digito no campo E-mail ou CPF CNPJ o valor "<vCampo1>" e digito no campo confirma E-mail ou CPF CNPJ o valor "<vCampo2>"
    E clico em avançar
    Entao deve apresentar a mensagem de erro "<Msg>" do campo "<tpCampo>"
    
  Exemplos:
  |Cenario							|tpCampo	|	vCampo1					|vCampo2				|Msg																						|
  |campo em branco			|emailCpf	|testem						|								|	E-mail ou CPF/CNPJ devem ser informado!				|
  |email diferente			|emailCpf	|									|testem					|	E-mail ou CPF/CNPJ devem ser informado!				|
  |cnpj diferente		 		|emailCpf	|11111111111			|33333333333		| E-mail ou CPF/CNPJ devem ser iguais!					|
 	|cpf diferente		 		|emailCpf	|33333333333111		|11111111111333	| E-mail ou CPF/CNPJ devem ser iguais!					|
           
 @recuperar_senha_teste_negativof @Firefox
	Esquema do Cenario: testes de recuperar senha cenarios negativos no chrome
    Dado que eu acesso a página "https://financeiro.hostgator.com.br/"
    Quando eu clico no botão Esqueceu sua senha
    E digito no campo E-mail ou CPF CNPJ o valor "<vCampo1>" e digito no campo confirma E-mail ou CPF CNPJ o valor "<vCampo2>"
    E clico em avançar
    Entao deve apresentar a mensagem de erro "<Msg>" do campo "<tpCampo>"
    
  Exemplos:
  |Cenario							|tpCampo	|	vCampo1					|vCampo2				|Msg																						|
  |campo em branco			|emailCpf	|testem						|								|	E-mail ou CPF/CNPJ devem ser informado!				|
  |email diferente			|emailCpf	|									|testem					|	E-mail ou CPF/CNPJ devem ser informado!				|
  |cnpj diferente		 		|emailCpf	|11111111111			|33333333333		| E-mail ou CPF/CNPJ devem ser iguais!					|
 	|cpf diferente		 		|emailCpf	|33333333333111		|11111111111333	| E-mail ou CPF/CNPJ devem ser iguais!					|
           
           