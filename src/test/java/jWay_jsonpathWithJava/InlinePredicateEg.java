package jWay_jsonpathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class InlinePredicateEg {

	File jsonfile=new File ("src/test/resources/bookstore.json");
	
	public  void InlinePredicate() throws IOException
	{
		List<Object> result=JsonPath.parse(jsonfile).read("$.Store.book[?(@.year>1300 &&  @.pages>700)]");
		
		System.out.println(result);
		
	}
	public static void main(String[] args ) throws IOException {
		InlinePredicateEg example=new InlinePredicateEg();
		
		example.InlinePredicate();
		
	}
}
