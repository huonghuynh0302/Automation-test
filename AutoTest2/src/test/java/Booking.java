import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Booking {
    String URL_login = "http://qcwork.inshasaki.com/auth/login";
    String user_email = "login_form_email";
    String user_pass = "login_form_password";
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
        driver.get(URL_login);
    }

    @Test
    public void CreateBooking() throws InterruptedException {
        loginHSK("huonght2@hasaki.vn","Huong0302");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[@class='icon_header icon_08'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary ml-2'])[1]")).click();
        driver.findElement(By.id("title")).sendKeys("automationTest");
        driver.findElement(By.xpath("//div[contains(@class,'')]//div[contains(@class,'ant-select-selector')]")).sendKeys("lầu 1");
//        WebElement dropdownRoom = driver.findElement(By.xpath("//div[contains(@class,'')]//div[contains(@class,'ant-select-selector')]"));
//        Thread.sleep(5000);
//        Select selectRoom = new Select(dropdownRoom);
//        selectRoom.selectByVisibleText("lầu 1");
    }
}
