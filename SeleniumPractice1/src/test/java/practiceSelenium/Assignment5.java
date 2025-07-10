package practiceSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment5 {

	@Test
	void test5() {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		WebElement countrylist = driver.findElement(By.xpath("//select[@id='country-list']"));

		Select sel = new Select(countrylist);
		List<WebElement> options = sel.getOptions();

		System.out.println("total number of country " + options.size());
		System.out.println();
		for (WebElement s : options) {
			String countryname = s.getText();
			System.out.println(countryname);
		}

		sel.selectByContainsVisibleText("Brazil");

		WebElement state = driver.findElement(By.xpath("//select[@id='state-list']"));
		Select stateselect = new Select(state);

		List<WebElement> st = stateselect.getOptions();
		for (WebElement n : st) {

			String statena = n.getText();
			System.out.println(statena);

		}

		stateselect.selectByVisibleText("Ceara");

	}

}
