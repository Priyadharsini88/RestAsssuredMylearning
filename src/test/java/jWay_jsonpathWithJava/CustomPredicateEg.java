package jWay_jsonpathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;

public class CustomPredicateEg {

	File jsonfile=new File ("src/test/resources/bookstore.json");

	public void mycustomPredicate() throws IOException
	{
		//		Predicate bookwithcountry= new Predicate() {
		//
		//			public boolean apply(PredicateContext ctx) {
		//				// TODO Auto-generated method stub
		//				return false;
		//			}
		//
		//		}

		Predicate bookwithcountry=ctx->ctx.item(Map.class).containsKey("Italy");

		//@SuppressWarnings("unchecked")
		List<Map<Object,String>> result=JsonPath.parse(jsonfile)
		.read("$.Store.book[?(@.country=='Italy')]");
		System.out.println(result);


	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		CustomPredicateEg custompredicate=new CustomPredicateEg();
		custompredicate.mycustomPredicate();
	}

}
