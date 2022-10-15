package QAclickacademy2;

import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	public void testSelenium1()
	{
		System.out.println("testSelenium1");
	}
		@Test
		public void testSelenium2()
		{
			System.out.println("testSelenium2");
	}
		
		//to run maven project from Command prompt- mvn test
		//to clean maven project from Command prompt- mvn clean
		//to compile maven project from Command prompt- mvn compile
		//To run .xml file - need to add xml file name in POM 
		//If we want to run only one test class from cmd, use mvn -Dtest=TestCircle test command
		//Profile- to segrigate the testng xml file. Command - mvn test -PRegression
}
