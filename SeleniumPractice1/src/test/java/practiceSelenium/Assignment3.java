package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment3 {

	@Test
	void test3() {

		WebDriver driver = new ChromeDriver();
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"table-container\"]//tr/td[4]/input"));
		List<WebElement> product = driver.findElements(By.xpath("//div[@class='table-container']//tr//td[2]"));

		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getText().equalsIgnoreCase("laptop")) {
				int r = 1 + i;
				driver.findElement(By.xpath("//div[@class=\"table-container\"]//tr[" + r + "]/td[4]/input")).click();
			}
		}

		System.out.println("total checkbox in the table " + list.size());

		/*
		 * for (WebElement l : list) { l.click(); }
		 */

	}

}
