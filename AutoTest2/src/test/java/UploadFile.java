import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class UploadFile extends TestLoginHSK {

    @Test
    public void UploadF() throws InterruptedException, IOException {
        loginHSK("huonght2@hasaki.vn","Huong0302");
        Thread.sleep(5000);
    driver.findElement(By.xpath("(//span[@class='icon_header icon_03'])[1]")).click();
    driver.findElement(By.xpath("//a[normalize-space()='Test Automation upload file']")).click();
        Thread.sleep(5000);
    driver.findElement(By.xpath("//span[normalize-space()='upload file']")).click();
        Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='block_multiupload']//div//div//span[@role='button']")).click();
    driver.findElement(By.xpath("//div[@class='block_multiupload']//div//div//span[@role='button']")).sendKeys("C:\\Users\\DELL\\Downloads\\IMG_0572.jpg");
        Thread.sleep(5000);
    driver.findElement(By.xpath("//span[@class='btn_site_udate_task btn_submit']")).click();
    }
}
//Chạy được nhưng không thấy file xuất hiện trên task => hong biết tại sao