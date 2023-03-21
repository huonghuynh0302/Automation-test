import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.input_data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginHSKStaging {
    WebDriver driver;
    @BeforeMethod
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://staging.hasaki.vn");
        driver.manage().window().maximize();

        //Login Hasaki.vn
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//div[contains(@class,'item_header item_login')]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.id("hskLoginButton"))).click().build().perform();
        driver.findElement(By.id("username")).sendKeys("huynhtuyethuong0302@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Huong0302");
        driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void Out(){
        driver.quit();
    }
}
