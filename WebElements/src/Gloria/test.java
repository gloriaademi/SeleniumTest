package Gloria;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.teachaway.com/");
		
		
		WebElement firstMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigation-2\"]/div/div/div/ul/li[1]/span"));
		WebElement subMenu  = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[1]/div/div/div/div/ul/li[1]/div/div/div/div/div/ul/li[1]/a"));
		
		Actions a = new Actions(driver);
	
		a.moveToElement(firstMenu);
		a.click(subMenu);
		
		a.build().perform();
	}

}
