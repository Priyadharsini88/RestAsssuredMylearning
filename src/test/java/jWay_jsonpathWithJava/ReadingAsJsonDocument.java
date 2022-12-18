package jWay_jsonpathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class ReadingAsJsonDocument {
	
	public static void readAJson() throws IOException {
		
		File jsonfile=new File ("src/test/resources/bookstore.json");
		
		List<Object> Bookpages =JsonPath.read(jsonfile, "$..pages");
		
		for(Object pages:Bookpages)
		{
			System.out.println(pages);
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readAJson();
		
	}

}
