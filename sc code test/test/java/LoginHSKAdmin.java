import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class LoginHSKAdmin {
    WebDriver driver;
    @BeforeMethod
 public void Loginn() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://staging.hasaki.vn/admin/login");
        driver.manage().window().maximize();

        //Login Hasaki.vn/admin
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("s*2Ws5S%JC@");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
        Thread.sleep(5000);
}
public void quit(){
        driver.quit();
}
}
