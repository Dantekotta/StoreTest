package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseSize(String size){
        Select sizeOption = new Select(driver.findElement(By.id("group_1")));
        sizeOption.selectByVisibleText(size);
    }

    public void chooseQuantity(String quantity){
        WebElement chooseAmount = driver.findElement(By.id("quantity_wanted"));
        chooseAmount.clear();
        chooseAmount.sendKeys(quantity);
    }

    public void checkDiscount(){
        String discountAvailable;
        boolean exist = driver.findElements(By.cssSelector(".discount.discount-percentage")).size() !=0;
        if (exist == true) {
            WebElement discount = driver.findElement(By.cssSelector(".discount.discount-percentage"));
            discountAvailable = discount.getText();
            System.out.println(discountAvailable);
        }
    }

    public void addToCart(){
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-button-action='add-to-cart']"));
        addToCartButton.click();
    }

    public void proceedToCheckout(){
        WebElement proceedButton = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        proceedButton.click();
    }
}
