
package examples;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import groovy.util.logging.Log;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class example1 {

    @Test
    public void GetPetDetails() {
        // Specify the base URL to the RESTful web service
        baseURI = "https://petstore.swagger.io/v2/pet";

        // Make a request to the server by specifying the method Type and 
        // resource to send the request to.
        // Store the response received from the server for later use.
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .when().get(baseURI + "/findByStatus?status=sold"); // Run GET request

        // Now let us print the body of the message to see what response
        // we have received from the server
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is =>  " + responseBody);

        // Assertions
        response.then().statusCode(200);
        response.then().body("[0].status", equalTo("sold"));
    }
    
    @Test
    public void getRequestWithPathParam() {
    	given().
    	 	baseUri("https://petstore.swagger.io/v2/pet").
    	 	header("Content-Type", "application/json").
    	 	pathParam("petId", 77232).
    	 when().
    	 	get("/{petId}").
    	 then().
    	 	statusCode(200).
    	 	body("name",equalTo("Hansel")).
    		log().all();
    	 	
    	 	
    }

}
