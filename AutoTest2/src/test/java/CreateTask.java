import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.input_data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class CreateTask extends TestLoginHSK {

    @Test (dataProvider = "task", dataProviderClass = input_data.class)
    public void Task(String nameTask) throws InterruptedException {
        loginHSK("huonght2@hasaki.vn","123456");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[4]/span[1]")).click();
        driver.findElement(By.xpath("(//span[@class='icon_header icon_04'])[1]")).click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//body//div//li[1]")));
        Assert.assertEquals(firstResult.isDisplayed(),true);
        firstResult.click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]")).click();
        driver.findElement(By.xpath("(//span[@class='icon_header icon_04'])[1]")).click();
        WebElement createTask = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='rounded-circle btn-redirect-task-input']")));
        Assert.assertEquals(firstResult.isDisplayed(),true);
        createTask.click();
        driver.findElement(By.id("name")).sendKeys(nameTask);
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();


//        //Deadline
//        driver.findElement(By.xpath("//input[@id='upsertTaskForm_date_end']")).click();
//        WebElement date = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(@title,'2022-11-01')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='1']")));
//        date.click();
//        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm']")).click();
//
//        //Ưu tiên
//        WebElement UuTien = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='ant-select-selector'])[2]")));
//        UuTien.click();
//        driver.findElement(By.xpath("//div[@title='High']")).click();
//
//        //Nhóm công việc
//        driver.findElement(By.xpath("//textarea[@placeholder='Nhóm việc']")).sendKeys("Worlplace");
//
//        //Tên công việc
//        driver.findElement(By.xpath("//textarea[@placeholder='Tên công việc']")).sendKeys("Test automation 2");
//
//        //Khối lượng
//        driver.findElement(By.xpath("//input[@id='upsertTaskForm_amount_of_work']")).sendKeys("5");
//
//        //Giờ dự định
//        driver.findElement(By.xpath("//input[@id='upsertTaskForm_planned_hours']")).sendKeys("67");
//
//        //Giao cho
//        driver.findElement(By.xpath("//div[contains(@class,'ant-select ant-select-in-form-item ant-select-multiple ant-select-allow-clear ant-select-show-search')]")).click();
//        driver.findElement(By.xpath("//div[contains(@class,'ant-select ant-select-in-form-item ant-select-multiple ant-select-allow-clear ant-select-show-search')]")).sendKeys("qc");
//        WebElement gg = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'ant-select ant-select-in-form-item ant-select-multiple ant-select-allow-clear ant-select-show-search')]")));
//        gg.sendKeys("qc");
//        WebElement s = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-select-item-option-content']")));
//        s.click();
//
//
//
//        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

    @AfterTest
    public void Task2(){
       driver.quit();

    }

}
