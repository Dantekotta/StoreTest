package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class OrderDetailsPage {

    private WebDriver driver;


    public static String cost;

    public OrderDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void setCost(String cost) {
        OrderDetailsPage.cost = cost;
    }

    public boolean StatusAwaiting(){
        boolean status;
        WebElement statusText = driver.findElement(By.cssSelector(".label"));
        String actualStatus = statusText.getText();
        String awaiting = "Awaiting check payment";
        if (Objects.equals(actualStatus, awaiting)){
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean costComparison(){
        boolean isEqual;
        WebElement price = driver.findElement(By.cssSelector("#order-products > tfoot > tr.text-xs-right.line-total > td:nth-child(2)"));
        String detailedPrice = price.getText();
        if (Objects.equals(cost, detailedPrice)){
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }

}
