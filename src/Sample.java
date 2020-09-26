import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws IOException, InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hariom\\eclipse-workspace\\Sample\\libs\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		//Actions action = new Actions(driver);
		//WebElement Admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		//action.moveToElement(Admin).moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).click().build().perform();
		//WebElement performance = driver.findElement(By.id("menu__Performance"));
		//action.moveToElement(performance).moveToElement(driver.findElement(By.id("menu_performance_ManageReviews"))).moveToElement(driver.findElement(By.id("menu_performance_myPerformanceReview"))).click().build().perform();
		
		//driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		
		WebElement OrangeImage = driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img"));
		
		if(OrangeImage.isDisplayed())
		{
			System.out.println("Image is Displayed");
			System.out.println("User logout successfully :" +OrangeImage.getAttribute("alt"));
		}
		
		//Thread.sleep(1000);
		//driver.quit();
}
}
