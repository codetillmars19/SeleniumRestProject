package stepDef;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class sampleApi {
	
	@Given("^Open restApi url$")
	public void open_restApi_url(String file) throws Throwable {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	}

	@When("^Get information of a city$")
	public void get_information_of_a_city() throws Throwable {
		System.out.println("Info of city Hyderabad");
	}

	@Then("^Validate the response of the city$")
	public void validate_the_response_of_the_city() throws Throwable {
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Hyderabad");		
		String responseBody = response.getBody().asString();
		 System.out.println("Response Body is =>  " + responseBody);
		 int statusCode = response.getStatusCode();		 
		 Assert.assertEquals(statusCode , 200);
		 System.out.println("Status code is : " + statusCode);
	}


}
	

