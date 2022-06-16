package Mobile_worldd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class Sig_in {
static {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\kantharaju.kn\\eclipse-workspace\\Mobile\\Driver\\chromedriver.exe");
}
WebDriver driver;

@Test(priority = 1)
public void launchBrowser() throws InterruptedException {
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mobileworld.azurewebsites.net/sign.html");
}

@Test(priority = 2)
public void enterUserName() throws InterruptedException {
driver.findElement(By.id("username")).sendKeys("Kantharaju K N");
}

@Test(priority = 3)
public void enterPassword() throws InterruptedException {
driver.findElement(By.id("password")).sendKeys("Kantha@00");
}

@Test(priority = 4)
public void clickOnLogin() throws InterruptedException {
driver.findElement(By.xpath("//a[text()='Log In']")).click();
}
}




