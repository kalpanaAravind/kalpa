import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Kalpusree\\eclipse\\newWorkspace\\Addcustomer\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame(0);
	WebElement name = driver.findElement(By.name("fldLoginUserId"));
	name.sendKeys("Aravindan");
	WebElement btnco = driver.findElement(By.xpath("//img[@alt='continue']"));
	btnco.click();
	WebElement Pwd = driver.findElement(By.name("fldPassword"));
	Pwd.sendKeys("kalpana");
	
	WebElement Pwd1 = driver.findElement(By.name("fldPassword"));
	Pwd.sendKeys("greens");
	
	driver.switchTo().frame(0);
	
	driver.quit();
}
}
