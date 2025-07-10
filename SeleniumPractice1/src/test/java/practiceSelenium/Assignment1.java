package practiceSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment1 {
	
	/*
	 * 1. provide some string search for it
	 * 2. count number of links
	 * 3. click on each link using for loop
	 * 4. get windowIDs for each window
	 * 5. close specific browser window
	 */
	
	@Test
	void test1() {
		 WebDriver driver=new ChromeDriver();
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000)); 
		 
		 //launching Website
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 // provide some String search for it
		  WebElement wikiPediaSearchBox=driver.findElement(By.xpath("//input[@class=\"wikipedia-search-input\"]"));
		  wikiPediaSearchBox.sendKeys("Selenium");
		  
		 // Clicked on Search button
		  WebElement clickButton= driver.findElement(By.xpath("//input[@type='submit']"));
		  clickButton.click();
		  
		  // List of suggested result after entering text
		  List<WebElement> searchResult=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		 
		  //count number of links
		  int totalLinks = searchResult.size();
		  System.out.println(totalLinks);
		  
		  //Clicking on each link
		  for(WebElement result:searchResult) {
			  result.click();
		  }
		  
		  // get windowID for each window
		  Set<String> windowID=driver.getWindowHandles();	 
		  List<String> windowIDs=new ArrayList(windowID);
		  for(String a: windowIDs) {
			  System.out.println(a);
		  }
		  
		  //switching to specific window and closing that window
		  driver.switchTo().window(windowIDs.get(1));
		  System.out.println(driver.getCurrentUrl());
		  driver.close();
		  
		  
		 }
		 

		 
		 
	}


