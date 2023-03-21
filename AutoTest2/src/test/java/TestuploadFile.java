import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestuploadFile {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");
        //we want to import selenium-snapshot file.
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\DELL\\Downloads\\IMG_0164.jpg");
        //driver.findElement(By.id("file-submit")).submit();
        if(driver.getPageSource().contains("File Uploaded!")) {
            System.out.println("file uploaded");
        }
        else{
            System.out.println("file not uploaded");
        }
        //driver.quit();
    }
}
