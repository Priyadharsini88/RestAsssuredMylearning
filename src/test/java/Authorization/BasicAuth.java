package Authorization;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class BasicAuth {
	
	//basic authentication using postman echo url ...passsing username and password 
	//use the above import static statement for using given ...
	
	@Test
	public void basicAuth() {
		
		given()
		.auth()
		.basic("postman", "password")
		.baseUri("https://postman-echo.com/")
		.when()
		.get("basic-auth")
		.prettyPrint();
		
		
	}

}
