package restassured.restassure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/*SpaceX API testing automation
 * Created script by Hanumanth 
 * Date:06-10-2021
 */
public class SpaceXAPI {

		
	 @BeforeClass
	    public static void setup() {
		 
		 
		 Properties properties = new Properties();
		    try {
				properties.load(new FileInputStream(new File("./resources/properties/config.properties")));
				RestAssured.baseURI = properties.getProperty("URL");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                  
	 }
        
	  
	
	@Test
	void test_01(){
	
		
			    Response response = RestAssured.given()
          	    .when()
          	    .get("/latest");
          	 
		System.out.println(response.asString());

		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getContentType());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("Content-Type"));
		System.out.println(response.getTime());
		 
		
//Test1: To validate Response code
		int sta = response.getStatusCode();
		Assert.assertEquals(sta, 200);
		System.out.println("Validation of response code with 200");
//Test 2: validate Success header response with "true"
		JsonPath jsp = response.jsonPath();
		String success = jsp.getString("success");
		Assert.assertTrue(true, success);
		System.out.println("Validation of success header response with true");

//Test 3: validate failures header response with "empty"
		
		String failures = jsp.getString("failures");
		Assert.assertEquals("[]", failures);
		System.out.println("Validation of failures header response with empty");
		
   }

}

