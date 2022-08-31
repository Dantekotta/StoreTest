package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClothesPage {
    private WebDriver driver;

    public ClothesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getSweater(){
        WebElement sweaterItem = driver.findElement(By.xpath("//img[@alt='Brown bear printed sweater']"));
        sweaterItem.click();
    }
}
