import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Kalpusree\\eclipse\\newWorkspace\\Sample\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	driver.manage().window().maximize();
	
	WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='pushAlert()']"));
	simpleAlert.click();
	
	Alert al=driver.switchTo().alert();
	al.accept();
	
	WebElement confirmAlert = driver.findElement(By.xpath("//button[@onclick='pushConfirm()']"));
	confirmAlert.click();
	
	Alert al1=driver.switchTo().alert();
	al1.accept();
	
	WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='promptConfirm()']"));
	promptAlert.click();
	
	Alert al2=driver.switchTo().alert();
	al2.sendKeys("yes");
	
	driver.quit();
}
}
