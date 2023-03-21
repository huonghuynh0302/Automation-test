import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
    @Test(dataProvider = "1")
    public void Login(){
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qcwork.inshasaki.com/auth/login");
        driver.findElement(By.id("login_form_email")).sendKeys("huonght2@hasaki.vn");
        driver.findElement(By.id("login_form_password")).sendKeys("Huong0302");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}