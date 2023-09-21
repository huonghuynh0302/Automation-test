import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLoginHSK {
    String URL_login = "http://qcwork.inshasaki.com/auth/login";
    String user_email = "upsertForm_email";
    String user_pass = "upsertForm_password";
    String btn_login = "//button[@type='submit']";

    WebDriver driver;
    public void loginHSK(String email, String pass) {
        driver.get(URL_login);
        driver.findElement(By.id(user_email)).sendKeys(email);
        driver.findElement(By.id(user_pass)).sendKeys(pass);
        driver.findElement(By.xpath(btn_login)).click();
    }
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(URL_login);
        driver.manage().window().maximize();
    }

//    @Test
//    public void LoginRight(){
//        loginHSK("huonght2@hasaki.vn","Huong0302");
//    }

//    @Test
//    public void LoginWrong(){
//        loginHSK("","");
//    }

//    @AfterMethod
//    public void Fn(){
//        driver.quit();
//    }

}
