package dockerselenium;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithfirefox {

	@Test
	public void test() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();

		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		System.out.println("The title of the Bigbazaar =" + driver.getTitle());

		driver.quit();

	}
}
