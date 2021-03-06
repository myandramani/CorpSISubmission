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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
public class CertificateOfStatus {
	 WebDriver driver;
 @Test
	public void testUntitledTestCase() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://meena/CorpBizFileCertVerification//chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://cbstest.sos.ca.gov");
	    driver.findElement(By.xpath("//form[@id='formSearch']/div/div/ul")).click();
	    driver.findElement(By.id("NumberOpt")).click();
	    driver.findElement(By.id("formSearch")).click();
	    driver.findElement(By.id("SearchCriteria")).click();
	    driver.findElement(By.id("SearchCriteria")).clear();
	    driver.findElement(By.id("SearchCriteria")).sendKeys("c0008881");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.id("btnDetail-00008881")).click();
	    driver.findElement(By.id("loader")).click();
	
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
	    //driver.get("https://bebizfiletest.sos.ca.gov/CertofStatus/submission/new/00008881");
	    //WebElement fr = driver.findElement(By.cssSelector("iframe"));
	    //driver.switchTo().frame(fr);
	    driver.switchTo().frame(driver.findElement(By.xpath("id(\"ts-iframe\")/iframe[1]")));
	    driver.findElement(By.cssSelector("#element3__Option_1")).click();
	    driver.findElement(By.xpath("//*[@id=\"breadcrumb-item-1\"]")).click();
	    //WebDriverWait wait1 = new WebDriverWait(driver , 1000) ;
	    // wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#element3__Option_1")));
	    // WebDriverWait wait2 = new WebDriverWait(driver , 1000) ;
	     //wait2.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name=\"element2\"]")));
	   // driver.findElement(By.cssSelector("#element3__Option_1")).click();
	     	  
	    //driver.get("https://bebizfiletest.sos.ca.gov/CertofStatus/submission/new/00008881");
	    //WebDriverWait wait3 = new WebDriverWait(driver , 1000) ;
	   // wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"breadcrumb-item-1\"]")));
	    //driver.findElement(By.xpath("//*[@id=\"breadcrumb-item-1\"]")).click();
	   // WebDriverWait wait6 = new WebDriverWait(driver , 1000) ;
	   // wait6.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#element3__Option_1")));
	    ///driver.findElement(By.name("element2")).click();
	    
	  //driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div/div[1]/div[1]/div/div/div/div/form/div/div[3]/div[33]/input[1]")).click();
	    //driver.switchTo().frame(driver.findElement(By.xpath("id(\"ts-iframe\")/iframe[1]")));
	    //WebDriverWait wait4 = new WebDriverWait(driver , 1000) ;
	    //wait4.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#element3__Option_1")));
	     //WebDriverWait wait5 = new WebDriverWait(driver , 1000) ;
	    // wait5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name=\"element2\"]")));
	  WebDriverWait wait = new WebDriverWait(driver , 1000) ;
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("element97")));
	    driver.findElement(By.id("element97")).click();
	    driver.findElement(By.id("element32")).click();
	   driver.findElement(By.id("element32")).sendKeys("4000000000000002");
	    driver.findElement(By.id("element33")).click();
	    driver.findElement(By.id("element33")).clear();
	    driver.findElement(By.id("element33")).sendKeys("123");
	    driver.findElement(By.id("element34")).click();
	    driver.findElement(By.id("element34")).clear();
	    driver.findElement(By.id("element34")).sendKeys("02");
	    driver.findElement(By.id("element35")).click();
	    driver.findElement(By.id("element35")).clear();
	    driver.findElement(By.id("element35")).sendKeys("23");
	    driver.findElement(By.id("element36")).click();
	    driver.findElement(By.id("element36")).clear();
	    driver.findElement(By.id("element36")).sendKeys("tester");
	    driver.findElement(By.id("element37")).click();
	    driver.findElement(By.id("element37")).clear();
	    driver.findElement(By.id("element37")).sendKeys("240 natoma");
	    driver.findElement(By.id("element39")).click();
	    driver.findElement(By.id("element39")).clear();
	    driver.findElement(By.id("element39")).sendKeys("folsom");
	    driver.findElement(By.id("element40")).click();
	    driver.findElement(By.id("element40")).clear();
	    driver.findElement(By.id("element40")).sendKeys("ca");
	    driver.findElement(By.id("element41")).click();
	    driver.findElement(By.id("element41")).clear();
	    driver.findElement(By.id("element41")).sendKeys("95630");
	    driver.findElement(By.id("element43_Option_1")).click();
	    driver.findElement(By.id("element45")).click();
	    driver.findElement(By.id("element45")).sendKeys(Keys.HOME);
	    driver.findElement(By.id("element45")).sendKeys("8885671234"); 
	    driver.findElement(By.id("element48")).click();
	    driver.findElement(By.id("element48")).sendKeys("meenatestsos@gmail.com");
	    driver.findElement(By.id("element49")).click();
	    driver.findElement(By.id("element49")).sendKeys("meenatestsos@gmail.com");
	   // driver.findElement(By.xpath("/*[@id=\"recaptcha-anchor-label\"]")).click();
	    //driver.findElement(By.id("element2")).click();
	  }

	  
	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    boolean acceptNextAlert = false;
		try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}	
