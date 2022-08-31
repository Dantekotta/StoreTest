package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class AddressPage {
    private WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewAddress(){
        WebElement createButton = driver.findElement(By.cssSelector("[data-link-action='add-address']"));
        createButton.click();
    }
    public boolean checkAddress(){
        boolean check;
        if (Objects.equals(driver.getCurrentUrl(), "https://mystore-testlab.coderslab.pl/index.php?controller=addresses")){
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public boolean checktest(String alias, String address, String city, String zip, String country, String phone){
        boolean test;
        String added = alias + "\n" + "Baniel Banusz" + "\n" +address + "\n" +city + "\n" +zip + "\n" +country + "\n" +phone;
//        WebElement newAddress = driver.findElement(By.className("address-body"));
//        String displayAddress = newAddress.getText();
        List<WebElement> addresses = driver.findElements(By.className("address-body"));
        WebElement lastAddress = addresses.get(addresses.size()-1);
        String displayAddress = lastAddress.getText();
        System.out.println(displayAddress);
        if (Objects.equals(displayAddress, added)) {
            test = true;
        } else {
            test = false;
        }
        return test;
    }
}
