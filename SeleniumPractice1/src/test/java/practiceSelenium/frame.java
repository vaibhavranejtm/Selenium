package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frame {

	@Test
	void frameswitch() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

		driver.switchTo().frame(frame1);
		WebElement frame1Input = driver.findElement(By.xpath("//input[@name='mytext1']"));
		frame1Input.sendKeys("Vaibhav");
		
		driver.switchTo().defaultContent();

		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

		driver.switchTo().frame(frame2);
		WebElement frame2Input = driver.findElement(By.xpath("//input[@name='mytext2']"));
		frame2Input.sendKeys("Vaibhav");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		WebElement frame3Input = driver.findElement(By.xpath("//input[@name='mytext3']"));
		frame3Input.sendKeys("Venom");
		
		WebElement iframe=driver.findElement(By.xpath("//center//iframe"));
		
		driver.switchTo().frame(iframe);
		WebElement chkbox=driver.findElement(By.cssSelector("div#i21"));
		chkbox.click();
		
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);

		WebElement frame4Input = driver.findElement(By.xpath("//input[@name='mytext4']"));
		frame4Input.sendKeys("Venom");

		driver.switchTo().defaultContent();
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		
		WebElement link=driver.findElement(By.xpath("//form[@name=\"name5\"]/following-sibling::center//a"));
		link.click();
		String linketitle=driver.getTitle();
		System.out.println(linketitle);
		


		
		
		
		
		

	}

}
