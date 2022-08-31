package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getAddressSite(){
        WebElement addressButton = driver.findElement(By.cssSelector("[title='Addresses']"));
        addressButton.click();
    }

    public void getClothesSite(){
        WebElement clothes = driver.findElement(By.id("category-3"));
        clothes.click();
    }

}
