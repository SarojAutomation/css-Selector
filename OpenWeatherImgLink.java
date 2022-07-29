package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWeatherImgLink {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
	//	driver.findElement(By.cssSelector("li.logo>a>img")).click();
	//	driver.findElement(By.cssSelector("nav#nav-website>ul>li>a>img")).click();
	//driver.findElement(By.cssSelector("nav#nav-website>ul:nth-child(1)>li:nth-child(1)>a:nth-child(1)>img")).click();
	//driver.findElement(By.cssSelector("div#banner_android+script+ins+nav:nth-of-type(1)>ul:nth-of-type(1)>li:nth-of-type(1)>a:nth-of-type(1)>img")).click();
	//driver.findElement(By.cssSelector("li.logo>a:nth-child(1)>img:nth-child(1)"));
//	driver.findElement(By.cssSelector("nav#nav-website>ul#first-level-nav>li.logo>a>img")).click();	
//driver.findElement(By.cssSelector("ins.adsbygoogle.adsbygoogle-noablate+nav:nth-of-type(1)>ul:nth-child(1)>li:nth-child(1)>a>img")).click();
//driver.findElement(By.cssSelector("div#banner_android+script+ins+nav>ul>li>a>img")).click();
//driver.findElement(By.cssSelector("div#banner_android+script+ins.adsbygoogle.adsbygoogle-noablate+nav#nav-website>ul:nth-child(1)>li:nth-child(1)>a:nth-of-type(1)>img")).click();
//driver.findElement(By.cssSelector("a:nth-of-type(1)>img")).click();
//driver.findElement(By.cssSelector("a:nth-child(1)>img")).click();
//driver.findElement(By.cssSelector("a:nth-child(1)>img:nth-child(1)")).click();
//driver.findElement(By.cssSelector("a:nth-child(1)>img:nth-of-type(1)")).click();
//driver.findElement(By.cssSelector("div#banner_android+script+ins+nav>ul:nth-of-type(1)>li:nth-of-type(1)>a>img")).click();
//driver.findElement(By.cssSelector("nav#nav-website>ul:nth-of-type(1)>li:nth-of-type(1)>a:nth-of-type(1)>img")).click();
		//driver.findElement(By.cssSelector("li.logo>a:nth-of-type(1)>img:nth-of-type(1)")).click();	
		//driver.findElement(By.cssSelector("li[class *=logo]>a:nth-of-type(1)>img")).click();
	//	driver.findElement(By.cssSelector("ins[class ^=adsbygoogle]+nav>ul>li>a:nth-of-type(1)>img")).click();
	//	driver.findElement(By.cssSelector("ins[class ^=adsbygoogle]+nav>ul:nth-of-type(1)>li:nth-of-type(1)>a:nth-of-type(1)>img")).click();
	//	driver.findElement(By.cssSelector("ins[class $=noablate]+nav>ul>li>a:nth-of-type(1)>img")).click();
//driver.findElement(By.cssSelector("ins[class $=noablate]+nav>ul>li>a>img")).click();
//driver.findElement(By.cssSelector("ins[class $=noablate]+nav>ul:nth-child(1)>li:nth-child(1)>a:nth-child(1)>img:nth-child(1)")).click();
//driver.findElement(By.cssSelector("div[id  *=banner_android]+script+ins+nav>ul:nth-of-type(1)>li:nth-of-type(1)>a:nth-of-type(1)>img")).click();
		//driver.findElement(By.cssSelector("div[id  *=banner_android]+script+ins+nav:nth-of-type(1)>ul:nth-of-type(1)>li:nth-of-type(1)>a:nth-of-type(1)>img")).click();	
	
	
	}
	
	
}
