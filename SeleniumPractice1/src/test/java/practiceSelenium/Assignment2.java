package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment2 {
	/*
	 * this is for checkbox select
	 */

	@Test
	void test2() {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> days = driver
				.findElements(By.xpath("//div[@class=\"form-check form-check-inline\"]/input[contains(@id, 'day')]"));
		System.out.println(days.size());

		/*
		 * for(WebElement day:days) { day.click(); }
		 */

		List<WebElement> daysname = driver
				.findElements(By.xpath("//div[@class=\"form-check form-check-inline\"]/label[contains(@for, 'day')]"));
		for (WebElement daysn : daysname) {
			System.out.println(daysn.getText());
		}

		for (int i = 0; i < 7; i++) {
			if (daysname.get(i).getText().equalsIgnoreCase("Monday")) {
				int r = 1 + i;
				// driver.findElement(By.xpath("//div[@class=\"form-check
				// form-check-inline\"]/input[contains(@id, 'day')]")).click();
				driver.findElement(
						By.xpath("//div[@class='form-check form-check-inline'][" + r + "]/input[@type='checkbox']"))
						.click();
				break;
			}
			System.out.println(" ");
		}

	}

}
