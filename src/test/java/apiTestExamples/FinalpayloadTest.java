package apiTestExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalpayloadTest {
	
	public static String mydata;

	public static void main(String[] args) {

		support support = new support("http://gmail.com","Nayana payload test");
		
		data data = new data(7,"nayana@epicor.com","Nayana","Raghu","http://avatar.reqres.in");
		
		jsonpayload jsonpayload1 = new jsonpayload(1,12,14,2, data, support);
		
		json jsondata = new json(jsonpayload1);

		ObjectMapper objmapper = new ObjectMapper();
		
		try {
			mydata= objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsondata);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(mydata);
	}

}
