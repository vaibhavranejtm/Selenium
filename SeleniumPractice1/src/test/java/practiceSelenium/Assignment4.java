package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment4 {

	@Test
	void test4() {
		WebDriver driver = new ChromeDriver();
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://ui.vision/demo/webtest/frames/");

		String mainWindow = driver.getCurrentUrl();
		System.out.println("Main winodw Url " + mainWindow);

		WebElement fr1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));

		driver.switchTo().frame(fr1);

		System.out.println();

		System.out.println(driver.getCurrentUrl());

		WebElement txtBoxfr1 = driver.findElement(By.xpath("//form[@name=\"name1\"]//input[@type=\"text\"]"));

		txtBoxfr1.sendKeys("Welcome to frame1");

		driver.switchTo().defaultContent();

		WebElement fr2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

		driver.switchTo().frame(fr2);

		System.out.println();

		System.out.println(driver.getCurrentUrl());

		WebElement txtBoxfr2 = driver.findElement(By.xpath("//form[@name='name2']//input"));

		txtBoxfr2.sendKeys("Welcome to frame2");

		driver.switchTo().defaultContent();

		WebElement fr3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

		driver.switchTo().frame(fr3);

		WebElement txtBoxfr3 = driver.findElement(By.xpath("//form[@name='name3']//input"));

		txtBoxfr3.sendKeys("Welcome to frame3");

		WebElement innerFrame = driver.findElement(By.xpath("//iframe"));

		driver.switchTo().frame(innerFrame);

		WebElement chkBoxfri3 = driver.findElement(By.xpath("//div[@id=\"i21\"]"));

		chkBoxfri3.click();

		driver.switchTo().defaultContent();
	}

}
