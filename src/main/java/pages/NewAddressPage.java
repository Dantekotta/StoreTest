package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAddressPage {
    private WebDriver driver;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void newAddress(String alias, String address, String city, String zip, String country, String phone){
        WebElement aliasInput = driver.findElement(By.cssSelector("[name='alias']"));
        WebElement addressInput = driver.findElement(By.cssSelector("[name='address1']"));
        WebElement cityInput = driver.findElement(By.cssSelector("[name='city']"));
        WebElement zipInput = driver.findElement(By.cssSelector("[name='postcode']"));
        WebElement countryInput = driver.findElement(By.cssSelector("[name='id_country']"));
        WebElement countryOption = driver.findElement(By.cssSelector("[value='17']"));
        WebElement phoneInput = driver.findElement(By.cssSelector("[name='phone']"));
        WebElement saveButton = driver.findElement(By.cssSelector("footer > button"));

        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        zipInput.sendKeys(zip);
        countryInput.click();
        countryOption.click();
        phoneInput.sendKeys(phone);
        saveButton.click();

    }

}
