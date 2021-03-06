package CertificationVerificationCorp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
public class CertificationVerification{
   WebDriver driver;
   
  
   @Test
  public void CertificateVerification() {
	  System.setProperty("webdriver.chrome.driver", "C://meena/CorpBizFileCertVerification//chromedriver.exe");
	    driver=new ChromeDriver();
	     driver.get("https://corpbizfiletest.sos.ca.gov/Certification");
    driver.findElement(By.xpath("//*[@id=\"CertificateNumber\"]")).sendKeys("76B53YP");
    driver.findElement(By.xpath("//*[@id=\"loader\"]")).click();
  }

@AfterTest
public void tearDown() {
  driver.quit();
}
}
