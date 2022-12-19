package jWay_jsonpathWithJava;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import static io.restassured.RestAssured.*;

import java.util.Map;

import com.jayway.jsonpath.spi.mapper.JsonOrgMappingProvider;

public class DesrializationEg {
	
	
	String json="{\"firstName\": \"Hasini\", \"lastName\": \"Babu\", \"email\": \"hasi.b@gm.com\",\"skills\":[\"java\",\"selelnium\"]}";
	public void asfunction() {
		
		Map<String,Object> response= given()
		.baseUri("http://localhost:3000/MyEmployees")
		.when()
		.get("/433")
		.then()
		.extract()
		.body()
		.as(new TypeRef <Map<String,Object>>() {});
		
		System.out.println(response);
		
	}
	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     DesrializationEg desrialization =new DesrializationEg();
     desrialization.asfunction();
	}

}
