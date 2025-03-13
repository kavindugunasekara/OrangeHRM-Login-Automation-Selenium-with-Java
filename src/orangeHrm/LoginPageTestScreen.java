package orangeHrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPageTestScreen {
	
	static WebDriver driver;
	
	public static void LoginWithValidCrediantial() {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
     	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
     	driver.findElement(By.xpath("//button[@type='submit']")).click();
     	String ActualMessage = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
     	String ExpectedMassage="Dashboard";
     	
     	if(ExpectedMassage.contains(ActualMessage)) {
     		System.out.println("user login successful!");
     		
     		
     	}else {
     		System.out.println("falid : user not login");
     	}
	}
	public static void main(String[] args) {
		LoginWithValidCrediantial();
	}

}
