package Mobile_worldd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Order {
static {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\kantharaju.kn\\eclipse-workspace\\Mobile\\Driver\\chromedriver.exe");
}
WebDriver driver;


@Test(priority = 1)
public void launchBrowser() throws InterruptedException {
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://mobileworld.azurewebsites.net/order.html");
}

@Test(priority = 2)
public void enterFirstName() throws InterruptedException {
driver.findElement(By.id("inputFirstName")).sendKeys("Kantharaju");
}

@Test(priority = 3)
public void enterLastName() throws InterruptedException {
driver.findElement(By.xpath("(//input[@id='inputFirstName'])[2]")).sendKeys("K N");
}

@Test(priority = 4)
public void enterEmailId() throws InterruptedException {
driver.findElement(By.id("inputEmail")).sendKeys("raj959988@gmail.com");
}

@Test(priority = 5)
public void enterPassword() throws InterruptedException {
driver.findElement(By.id("inputPassword")).sendKeys("Kantha@00");
}


@Test(priority = 6)
public void selectGender() throws InterruptedException {
driver.findElement(By.id("flexRadioDefault1")).click();
Assert.assertTrue(driver.findElement(By.id("flexRadioDefault1")).isSelected());
}

@Test(priority = 7)
public void enterNumber() throws InterruptedException {
driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("9591334951");
}

@Test(priority = 8)
public void enterAddress1() throws InterruptedException {
driver.findElement(By.id(" address1")).sendKeys("Maralawadi");
}

@Test(priority = 9)
public void enterAddress2() throws InterruptedException {
driver.findElement(By.id("address2")).sendKeys("Kanakapura");
}

@Test(priority = 10)
public void enterCity() throws InterruptedException {
driver.findElement(By.id("inputCity")).sendKeys("Ramanagara");
}

@Test(priority = 11)
public void selectState() throws InterruptedException {
WebElement dropdown = driver.findElement(By.id("inputState"));
Select s = new Select(dropdown);
s.selectByVisibleText("Karnataka");
}

@Test(priority = 12)
public void enterZIP() throws InterruptedException {
driver.findElement(By.id("inputZip")).sendKeys("562121");
}

@Test(priority = 13)
public void selectBrand() throws InterruptedException {
driver.findElement(By.xpath("//input[@rel='samsung']")).click();
driver.findElement(By.xpath("//input[@rel='samsung']")).click();
Assert.assertTrue(driver.findElement(By.xpath("//input[@rel='samsung']")).isSelected());
}

@Test(priority = 14)
public void selectModel() throws InterruptedException {
driver.findElement(By.xpath("//option[text()='Samsng A13 ']")).click();
Assert.assertTrue(driver.findElement(By.xpath("//option[text()='Samsng A13 ']")).isSelected());
}

@Test(priority = 15)
public void enterCount() throws InterruptedException {
driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("3");
}

@Test(priority = 16)
public void selectHaveYouBought() throws InterruptedException {
WebElement dropdown = driver.findElement(By.id("bought"));
Select s = new Select(dropdown);
s.selectByVisibleText("No");
}

@Test(priority = 17)
public void selectCheck() throws InterruptedException {
driver.findElement(By.xpath("(//input[@id='gridCheck1'])[1]")).click();
driver.findElement(By.xpath("(//input[@id='gridCheck1'])[2]")).click();
Assert.assertTrue(driver.findElement(By.xpath("(//input[@id='gridCheck1'])[1]")).isSelected());
Assert.assertTrue(driver.findElement(By.xpath("(//input[@id='gridCheck1'])[2]")).isSelected());
}


@Test(priority = 18)
public void selectOrder() throws InterruptedException {
Thread.sleep(5000);
driver.findElement(By.xpath("(//div/button)[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Close']")).click();
}

}