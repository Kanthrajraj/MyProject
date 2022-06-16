package Mobile_worldd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login {
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kantharaju.kn\\eclipse-workspace\\Mobile\\driver\\chromedriver.exe");
	}
	WebDriver driver=new ChromeDriver();
	
	@Test(dataProvider="data")
	public void login(String username, String password){
		driver.get("https://mobileworld.azurewebsites.net/index.html");
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
	}
	
	@DataProvider
	public Object[][] data() {
		Object [] [] data = new Object[4][2];
		data[0][0]="kanthraj";
		data[0][1]="Kanth@00";
		data[1][0]="sjkdfa";
		data[1][1]="Kantha@00";
		data[2][0]="kanthraj";
		data[2][1]="9458jg";
		data[3][0]="kisug";
		data[3][1]="kdsjfjsd";
		return data;
	}
}

