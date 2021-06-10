package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Amazon_search_data_drivenTestTest {
	
	
	
	
	
  @Test(dataProvider = "myDataBucket")
  public void test(String input) {
	  
	System.out.println(input) ;
	
		 }
  @BeforeMethod
 
	  public String[] myDataBucket() {
		  String [] myData = new String[5];
		  myData[0] = "coffe mug";
		  myData[1] = "pretty coffe mug";
		  myData[2] = "cool coffe mug";
		  myData[3] = "cute coffe mug";
		  myData[4] = "ugly coffe mug";
		  
		 return myData; 
	  }
	  


  @AfterMethod
  public void afterMethod() {
  }

}
