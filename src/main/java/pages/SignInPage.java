package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    //"<witin26173@yasiok.com>" i "<Password123>"
    public void LogIn(String email, String passwd){
        WebElement emailInput = driver.findElement(By.cssSelector("[name='email']"));
        WebElement passwdInput = driver.findElement(By.cssSelector("[name='password']"));
        WebElement loginButton = driver.findElement(By.id("submit-login"));
        emailInput.sendKeys(email);
        passwdInput.sendKeys(passwd);
        loginButton.click();
    }
}
