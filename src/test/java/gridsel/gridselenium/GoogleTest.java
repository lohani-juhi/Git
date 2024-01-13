package gridsel.gridselenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
	public void HomePageCheck() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("firefox");
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.12:4444"),caps);
<<<<<<< HEAD
		driver.get("http://rahulshetty.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("juhilohani");
=======
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("juhi lohani");
>>>>>>> f71af1355c4e5f2052e45c2e4eaa5e1e6a6af2b8
	
	}
}