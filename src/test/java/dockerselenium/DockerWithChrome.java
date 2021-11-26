package dockerselenium;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DockerWithChrome {
	// @Test(description="COD Order")
	public void testCOD() throws MalformedURLException, InterruptedException {

		try {

			/* =====Docker code===== */

			DesiredCapabilities dc = DesiredCapabilities.chrome();
			URL url = new URL("http://localhost:4444/wd/hub");
			RemoteWebDriver driver = new RemoteWebDriver(url, dc);

			/* =====local code===== */
			/*
			 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
			 * + "/driver/chromedriver"); WebDriver driver = new ChromeDriver();
			 */
			driver.get("https://preprod-web.bigb.fgcommerce.net");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.findElement(By.id("mobileNumber")).sendKeys("9731353629");
			driver.findElement(By.id("getpopOtp")).click();

			driver.findElement(By.id("otp1")).sendKeys("1");
			driver.findElement(By.id("otp2")).sendKeys("2");
			driver.findElement(By.id("otp3")).sendKeys("3");
			driver.findElement(By.id("otp4")).sendKeys("4");
			driver.findElement(By.xpath("//*[@id=\"otp-validate\"]/div/form/div[2]/div/div[5]/button")).click();

			Thread.sleep(5000);
			driver.findElement(By.id("headerImage")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"profileSlider\"]/div[2]/div/div/div[2]/div[2]/div[1]/span[2]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"test\"]/div[2]/div[1]/div/div[6]/div/a")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id=\"orderSummaryPage\"]/div/div/div/div/div[1]/div[4]/div[2]/button[2]"))
					.click();
			//
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//*[@id=\"orderSummaryPage\"]/div/div/div[1]/div/div/div[1]/div/div/div/button[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"cartSlider\"]/div[2]/undefined/div/div[3]/div/div/div/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"express_next_button\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"CashOnDelivery\"]/p")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//button[contains(text(),'Pay')]")).click();
			Thread.sleep(5000);
			String URL = driver.getCurrentUrl();

			int sub = URL.length() - 8;

			System.out.println("Order no. is =" + URL.substring(sub));
			driver.quit();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

	}

	@Test(description = "FP Order")
	public void FPOrder() throws MalformedURLException, InterruptedException {

		try {

			// =====Docker code===== */

			/*
			 * URL url = new URL("http://localhost:4444/wd/hub"); DesiredCapabilities dc =
			 * DesiredCapabilities.chrome(); ChromeOptions options = new ChromeOptions();
			 * Map<String, Object> prefs = new HashMap<String, Object>();
			 * prefs.put("profile.default_content_setting_values.notifications", 1);
			 * options.setExperimentalOption("prefs", prefs);
			 * //dc.setCapability(ChromeOptions.CAPABILITY, options); RemoteWebDriver driver
			 * = new RemoteWebDriver(url, dc);
			 * 
			 */

		//	DesiredCapabilities dc = DesiredCapabilities.chrome();
		//	URL url = new URL("http://localhost:4444/wd/hub");
		//	RemoteWebDriver driver = new RemoteWebDriver(url, dc);

			/* =====local code===== */

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
			WebDriver driver = new ChromeDriver();

			driver.get("https://preprod-web.bigb.fgcommerce.net");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.findElement(By.id("mobileNumber")).sendKeys("9731353629");
			driver.findElement(By.id("getpopOtp")).click();

			driver.findElement(By.id("otp1")).sendKeys("1");
			driver.findElement(By.id("otp2")).sendKeys("2");
			driver.findElement(By.id("otp3")).sendKeys("3");
			driver.findElement(By.id("otp4")).sendKeys("4");
			driver.findElement(By.xpath("//*[@id=\"otp-validate\"]/div/form/div[2]/div/div[5]/button")).click();

			Thread.sleep(5000);

			// pop up
			//driver.switchTo().alert().dismiss();

			driver.findElement(By.id("headerImage")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"profileSlider\"]/div[2]/div/div/div[2]/div[2]/div[1]/span[2]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"test\"]/div[2]/div[1]/div/div[6]/div/a")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id=\"orderSummaryPage\"]/div/div/div/div/div[1]/div[4]/div[2]/button[2]"))
					.click();
			//
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//*[@id=\"orderSummaryPage\"]/div/div/div[1]/div/div/div[1]/div/div/div/button[1]"))
					.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"cartSlider\"]/div[2]/undefined/div/div[3]/div/div/div/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"express_next_button\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"Wallet\"]")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//button[contains(text(),'Pay Now')]")).click();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"orderSummaryPage\"]/div/h3")));
			System.out.println("Order got placed");
			String URL = driver.getCurrentUrl();

			int sub = URL.length() - 8;

			System.out.println("Order no. is =" + URL.substring(sub));
			// Thread.sleep(10000);
			// driver.quit();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

	}

}
