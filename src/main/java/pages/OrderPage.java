package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmAddress(){
        WebElement confirmButton = driver.findElement(By.name("confirm-addresses"));
        confirmButton.click();
    }

    public void confirmShipping(){
        WebElement confirmButton = driver.findElement(By.name("confirmDeliveryOption"));
        confirmButton.click();
    }

    public void choosePayment(){
        WebElement payByCheckOption = driver.findElement(By.id("payment-option-1"));
        payByCheckOption.click();
    }

    public void agreeTerms(){
        WebElement termsCheckbox = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
        termsCheckbox.click();
    }

    public void order(){
        WebElement orderButton = driver.findElement(By.id("payment-confirmation"));
        orderButton.click();
    }

    public String cost(){
        WebElement costText = driver.findElement(By.cssSelector(".price"));
        String cost = costText.getText();
        return cost;
    }
    public void AccountPage(){
        WebElement accountButton = driver.findElement(By.linkText("Baniel Banusz"));
        accountButton.click();
    }

}
