import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateHandbook extends LoginHSKAdmin{
    @Test
    public void CreateBaiViet (){
        WebElement handbook = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://staging.hasaki.vn/admin/spa/handbook/list']")));
        handbook.click();

        driver.findElement(By.xpath("//a[normalize-space()='Create HandBook']")).click();

        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Test auto create");

        //driver.findElement(By.xpath("//input[@name='image']")).click();
        WebElement image = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='image']")));
        image.sendKeys("C:\\\\Users\\\\DELL\\\\Screenshot_93.png");
        //driver.findElement(By.xpath("//input[@name='image']")).sendKeys("C:\\Users\\DELL\\Screenshot_93.png");

        WebElement submit = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("subHandbook")));
        submit.click();
        //driver.findElement(By.id("subHandbook")).click();
        WebElement alertbutton = driver.findElement(By.cssSelector("html>body>div>button"));
        alertbutton.click();
    }
}
