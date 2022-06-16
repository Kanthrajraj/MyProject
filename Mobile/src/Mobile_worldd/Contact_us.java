package Mobile_worldd;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Contact_us {
static {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\kantharaju.kn\\eclipse-workspace\\Mobile\\Driver\\chromedriver.exe");
}
WebDriver driver;

@Test(priority = 1)
public void launchBrowser() throws InterruptedException {
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mobileworld.azurewebsites.net/index.html#");
}
@Test(priority = 2)
public void clickContactUs() throws InterruptedException {
driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
Thread.sleep(2000);
Set<String> id = driver.getWindowHandles();
Iterator<String> it = id.iterator();
String parentId = it.next();
String childId = it.next();
driver.switchTo().window(childId);
driver.manage().window().maximize();
}

@Test(priority = 2)
public void enterName() throws InterruptedException {
driver.findElement(By.name("name")).sendKeys("Kantharaju K N");
}

@Test(priority = 3)
public void enterMail() throws InterruptedException {
driver.findElement(By.name("email")).sendKeys("raj959988@gmail.com");
}

@Test(priority = 4)
public void enterPhoneNumber() throws InterruptedException {
driver.findElement(By.name("phone")).sendKeys("9591334951");
}

@Test(priority = 5)
public void enterMessage() throws InterruptedException {
driver.findElement(By.name("message")).sendKeys("Hi i am facing some technical issues while using your application and it's not stable.");
}

@Test(priority = 6)
public void clickOnSend() throws InterruptedException {
driver.findElement(By.className("btn")).click();
}
}
