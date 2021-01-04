package Gloria;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class test2 {

	public void Print() throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.teachaway.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"block-mainnavigation-2\"]/div/div/div/ul/li[1]/span"));
	
	List<WebElement> menu = driver.findElement(By.xpath("//*[@id=\"tb-megamenu-column-1\"]/div/ul/li[1]"));
	
	for (int i=0; i<menu.size(); i++)
	{
		WebElement element = menu.get(i);
		String submenu = element.getAttribute("innerHTML");
		System.out.println(submenu);
	}
	}
}
