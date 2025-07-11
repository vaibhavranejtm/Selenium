package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChkBoxSelectionInTable {

	@Test
	public void BoxSelectionInTable() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// launching the website
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr[1]/td"));
		int noOfRows = Rows.size();
		int noOfCol = columns.size();

		for (int i = 0; i < noOfRows-1; i++) {
			int r = i + 1;
			for (int j = 0; j < noOfCol; j++) {
				int s = j + 1;
				if (driver.findElement(By.xpath("//table[@id='productTable']//tr[" + r + "]/td[" + s + "]")).getText()
						.equalsIgnoreCase("Laptop")  && driver.findElement(By.xpath("//table[@id='productTable']//tr[" + r + "]/td[ 3]")).getText()
						.equalsIgnoreCase("$19.99") ) {

					driver.findElement(By.xpath("//table[@id='productTable']//tr[" + r + "]/td[4]/input")).click();
				}
			}
		}
	}
}
