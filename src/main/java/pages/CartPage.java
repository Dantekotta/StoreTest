package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout(){
        WebElement proceedButton = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        proceedButton.click();
    }
}
