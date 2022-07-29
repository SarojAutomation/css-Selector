package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffMailBrowser_02 {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://Rediff.com");
      driver.findElement(By.cssSelector("div.logobar>div.table>div:nth-child(2)>a:nth-child(1)")).click();
driver.findElement(By.cssSelector("div.table>div.row>div:nth-child(2)>input#login1")).sendKeys("seleniumpanda@rediffmail.com");
driver.findElement(By.cssSelector("div.row>div:nth-child(2)>input[name *=passwd]")).sendKeys("Selenium123");
driver.findElement(By.cssSelector("div.row>div:nth-child(2)>input[name *=passwd]+input.signinbtn")).click();
Thread.sleep(3000);
      driver.quit();
	}

}
