package jWay_jsonpathWithJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.InvalidJsonException;
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
	
	public static void ParseOneTime() throws InvalidJsonException, IOException
	{
		InputStream jsonFile= new FileInputStream("src/test/resources/bookstore.json");
		
		Object Parsedjsondoc=Configuration.defaultConfiguration().jsonProvider().parse(jsonFile.readAllBytes());
		
		List<Object> countries=JsonPath.read(Parsedjsondoc,"$..country");
		
		for(Object country:countries)
		{
			System.out.println(country);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readAJson();
		ParseOneTime();
	}

}
