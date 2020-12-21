package stepDefinitions;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class steps_cep {
	
	static String urlBase;
	Response apiResponse;
	@Dado("que eu acesse a API {string}")
	public void que_eu_acesse_a_API(String string) {
		urlBase = string;
	}

	@Quando("passo o CEP {string}")
	public void passo_o_CEP(String cep) {
		apiResponse = RestAssured.given().contentType(ContentType.JSON)
		.when().get(String.format(urlBase+="%s", cep));
	}

	@Entao("eu devo receber a resposta {string}")
	public void eu_devo_receber_a_resposta(String string) {
		System.out.println(apiResponse.getStatusCode());
		boolean rep = string.equals(String.valueOf(apiResponse.getStatusCode()));
		assertEquals(rep, true);
	}

}
