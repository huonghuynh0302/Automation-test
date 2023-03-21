import org.example.input_data;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

//Thêm địa chỉ tại staging.hasaki.vn
public class AddAddress_shoppingHSK extends LoginHSKStaging{
    @Test(dataProvider = "4", dataProviderClass = input_data.class)
    public void AddAddress(String Name, String Telephone, String Tp, String Quan, String Phuong, String Street){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//div[contains(@class,'item_header item_login')]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Địa chỉ giao hàng')]"))).click().build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'Thêm địa chỉ mới')]")).click();
        driver.findElement(By.id("fullName")).sendKeys(Name);
        driver.findElement(By.id("telephone")).sendKeys(Telephone);

        WebElement a = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.id("province_id_chosen")));
        a.click();
        WebElement e = driver.findElement(By.xpath("//div[@id='province_id_chosen']//input[@type='text']"));
        e.sendKeys(Tp);
        e.sendKeys(Keys.ENTER);
//        WebElement thanhpho = driver.findElement(By.xpath("//div[@id='province_id_chosen']//a[@class='chosen-single chosen-default']"));
//        Select select = new Select(thanhpho);
//        WebElement firstoptionTP = select.getFirstSelectedOption();
//        firstoptionTP.click();

        WebElement b = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.id("district_id_chosen")));
        b.click();
        WebElement f = driver.findElement(By.xpath("//div[@id='district_id_chosen']//input[@type='text']"));
        f.sendKeys(Quan);
        f.sendKeys(Keys.ENTER);
//        WebElement quan = driver.findElement(By.xpath("//div[@id='district_id_chosen']//a[@class='chosen-single chosen-default']"));
//        Select select1 = new Select(quan);
//        WebElement firstoptionQuan = select1.getFirstSelectedOption();
//        firstoptionQuan.click();

        WebElement c = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.id("ward_id_chosen")));
        c.click();
        WebElement g = driver.findElement(By.xpath("//div[@id='ward_id_chosen']//input[@type='text']"));
        g.sendKeys(Phuong);
        g.sendKeys(Keys.ENTER);
//        WebElement phuong = driver.findElement(By.xpath("//a[@class='chosen-single chosen-default']"));
//        Select select2 = new Select(phuong);
//        WebElement firstoptionPhuong = select2.getFirstSelectedOption();
//        firstoptionPhuong.click();

        driver.findElement(By.id("street")).sendKeys(Street);
//        WebElement Checkbox = driver.findElement(By.id("defaultShipping"));
//        boolean isSelected = Checkbox.isSelected();
//                if (isSelected == false){
//                    Checkbox.click();
//                }
        WebElement d = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Cập nhật')]")));
        d.click();
    }

}
