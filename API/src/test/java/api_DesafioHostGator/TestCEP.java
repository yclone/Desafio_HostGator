package api_DesafioHostGator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.path.json.JSONAssertion;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class TestCEP{
	boolean getResponse = false;
	String urlBase = "https://financeiro.hostgator.com.br/api/v3/checkout/cep/";
	Response apiResponse;
	
	@Test
	public void testeCEP() {

		String cep = "04384032";
		
		Response response = RestAssured.given().contentType(ContentType.JSON)
				.when().get(String.format(urlBase+="%s", cep));
		try {
			response.then().assertThat().statusCode(200);
			getResponse = true;
		} catch (Exception e) {
			getResponse = false;
		}

	}
	

}
