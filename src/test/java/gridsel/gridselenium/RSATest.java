package gridsel.gridselenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {
	@Test
	public void HomePageCheck() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.12:4444"),caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}
}