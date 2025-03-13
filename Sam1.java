package demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sam1 {
	
	@Test
	public void test() {
		System.out.println("Hi");
		WebDriver driver= new EdgeDriver(); 
		assertNotEquals(driver,null);
	}
}
