package jWay_jsonpathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

//import static com.jayway.jsonpath.Filter.Criteria.*;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterPredicate {

	File jsonfile=new File ("src/test/resources/bookstore.json");

	public   void filterEg() throws IOException {

		Filter firstcriteria=Filter.filter(Criteria.where("pages").lt(700).and("year").gt(1300));

		List<Object> result=JsonPath.parse(jsonfile).read("$.Store.book[?]",firstcriteria);

		System.out.println(result);


	}
	
	public   void filtersecondEg() throws IOException {

		Filter firstcriteria=Filter.filter(Criteria.where("pages").lt(700).and("year").gt(1300));
		
//using list of map since ,to get specific value 
		List<Map<String,Object>> result2=JsonPath.parse(jsonfile).read("$.Store.book[?]",firstcriteria);

		System.out.println(result2.get(0).get("country"));


	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FilterPredicate  filterpredicateexample=new FilterPredicate();

		filterpredicateexample.filterEg();
		filterpredicateexample.filtersecondEg();

	}

}
