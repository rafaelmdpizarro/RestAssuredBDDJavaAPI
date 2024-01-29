package stepdefinition;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	private static final Logger LOG = LogManager.getLogger(Hooks.class);
	String baseUrl = "https://reqres.in/api";
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	@Before
	public void testStart(Scenario scenario) {

		RestAssured.baseURI = baseUrl;
		RequestSpecBuilder reqBuilder = new RequestSpecBuilder();
		reqBuilder.setContentType(APP_CONTENT_TYPE);
		LOG.info("*****************************************************************************************");
		LOG.info("	Scenario: "+scenario.getName());
		LOG.info("*****************************************************************************************");
	}
}
