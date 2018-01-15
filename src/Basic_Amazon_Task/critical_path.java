package Basic_Amazon_Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class critical_path {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver",
	            "C:\\Users\\Ademola Bhadmus\\Documents\\HTC\\Learning Folder\\Amazon Test\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		JavascriptExecutor javaExec = (JavascriptExecutor) driver;
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		  WebElement signIn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[1]"));
		  signIn.click();
		   
		   String newUrl = driver.getCurrentUrl();
		   driver.get(newUrl);
		   
		   WebElement email = driver.findElement(By.id("ap_email"));
		   email.clear();
		   email.sendKeys("ademolabhadmus@hotmail.com");
		   Thread.sleep(2000);
		   
		   WebElement password = driver.findElement(By.id("ap_password"));
		   password.clear();
		   password.sendKeys("Qwerty123@");
		   
		   WebElement submitButton = driver.findElement(By.id("signInSubmit"));
		   submitButton.click();
		   
		   
		   javaExec.executeScript("scroll(0, 90)");
		   Actions hover = new Actions (driver);
		   hover.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[2]"))).build().perform();
		   Thread.sleep(5000);
		   
		   
		   WebElement signOut = driver.findElement(By.xpath("//*[@id=\"nav-item-signout-sa\"]"));
		   signOut.click();
	}

}
