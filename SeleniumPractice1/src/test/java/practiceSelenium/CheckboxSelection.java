package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxSelection {

	@Test
	public void checkboxselectionmethod() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// launching the website
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> dayschkbox = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		List<WebElement> daysname = driver.findElements(
				By.xpath("//input[@class='form-check-input' and @type=\"checkbox\"]/following-sibling::label"));
		for (int i = 0; i < dayschkbox.size(); i++) {
			int r = i + 1;
			WebElement name = driver.findElement(By.xpath("//div[" + r
					+ "]/input[@class='form-check-input' and @type=\"checkbox\"]/following-sibling::label"));
			if (name.getText().equalsIgnoreCase("Friday")) {
				dayschkbox.get(i).click();
			}
		}
		
		
		for(WebElement x:daysname) {
			System.out.println(x.getText());
		}

		// driver.quit();
	}
}