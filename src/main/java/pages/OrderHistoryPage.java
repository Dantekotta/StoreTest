package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderHistoryPage {
    private WebDriver driver;

    public OrderHistoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getDetails(){
        WebElement detailsButton = driver.findElement(By.cssSelector("[data-link-action=view-order-details]"));
        detailsButton.click();
    }
}
