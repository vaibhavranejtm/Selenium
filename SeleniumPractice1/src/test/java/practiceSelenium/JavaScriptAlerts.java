package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptAlerts {

	@Test
	public void alertPractice() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// launching the website
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement jsAlert = driver.findElement(By.xpath("//li/button[@onclick=\"jsAlert()\"]"));
		jsAlert.click();
		driver.switchTo().alert().accept();
		WebElement Result= driver.findElement(By.xpath("//p[@id='result']"));
		if(Result.getText().equalsIgnoreCase("You successfully clicked an alert")) {
			System.out.println("successfully clicked on alert");
		}
		else {
			System.out.println("unsuccessful to clicked on alert");

		}
		
		WebElement jsConfirm = driver.findElement(By.xpath("//li/button[@onclick=\"jsConfirm()\"]"));
		jsConfirm.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		

		WebElement jsPrompt = driver.findElement(By.xpath("//li/button[@onclick=\"jsPrompt()\"]"));
		jsPrompt.click();
		driver.switchTo().alert().sendKeys("hellow");
		driver.switchTo().alert().accept();
	}

}
