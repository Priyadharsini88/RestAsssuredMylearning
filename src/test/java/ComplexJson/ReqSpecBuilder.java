package ComplexJson;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class ReqSpecBuilder {

	public static void main(String[] args) {

		//Creating an object for the class 

		RequestSpecBuilder builder=new RequestSpecBuilder();

		//Using Requestspecification class 
		//using builder function .

		RequestSpecification spec=builder
				.setBaseUri("http://localhost:3000")
				.setBasePath("/MyEmployees").build();

		//getting the specific id value 

		RestAssured.given(spec).get("/290").prettyPrint();

	}
}
