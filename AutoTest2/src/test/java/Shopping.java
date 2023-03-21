import org.example.input_data;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Shopping extends LoginHSKStaging{
    @Test(dataProvider = "3", dataProviderClass = input_data.class)
    public void DK1(String sp) throws InterruptedException {
        //DK1
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).sendKeys(sp);
        driver.findElement(By.xpath("//button[@title='Search']")).click();
        Thread.sleep(3000);
        if(driver.findElement(By.xpath("//button[@id='buy-now']")).isDisplayed()) {
            driver.findElement(By.id("buy-now")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[5]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[2]")).click();
        }
        else {
            System.out.println("het hang");
        }

    }
//    @Test(dataProvider = "2", dataProviderClass = input_data.class)
//    public void HetHang(String sp) throws InterruptedException {
//        //SP hết hàng
//        driver.findElement(By.id("search")).click();
//        driver.findElement(By.id("search")).sendKeys(sp);
//        driver.findElement(By.xpath("//button[@title='Search']")).click();
//        driver.findElement(By.xpath("//div[@class='actions']//a[@class='action showcart btn_notify_stock']")).click();
//        driver.findElement(By.id("notify-fullname")).sendKeys("Hương");
//        driver.findElement(By.id("notify-email")).sendKeys("huynhtuyethuong0302@gmail.com");
//        driver.findElement(By.id("sendNotifyStock")).click();
//    }
}
