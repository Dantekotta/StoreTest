package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class FeatureSteps {
    private static WebDriver driver;
    @Given("User is on {string} site")
    public void userIsOnSite(String url) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("User login to account with {string} i {string}")
    public void userLoginToAccountWithI(String email, String passwd) {
        LandingPage onLandingPage = new LandingPage(driver);
        onLandingPage.clickSignIn();
        SignInPage onSignInPage = new SignInPage(driver);
        onSignInPage.LogIn(email, passwd);


    }

    @And("User click on Addresses and Add Address buttons")
    public void userClickOnAddressesAndAddAddressButtons() {
        AccountPage onAccountPage = new AccountPage(driver);
        onAccountPage.getAddressSite();
        AddressPage onAddressPage = new AddressPage(driver);
        onAddressPage.createNewAddress();
    }

    @And("User fills the form with {string}, {string}, {string}, {string}, {string}, {string} and confirms")
    public void userFillsTheFormWithAndConfirms(String alias, String address, String city, String zip, String country, String phone) {
        NewAddressPage onNewAddressPage = new NewAddressPage(driver);
        onNewAddressPage.newAddress(alias, address, city, zip, country, phone);

    }

    @Then("User should be redirected to address page")
    public void userShouldBeRedirectedToAddressPage() {
        AddressPage onAddressPage = new AddressPage(driver);
        Assert.isTrue(onAddressPage.checkAddress(), "Niepoprawne dane");
    }

    @Then("New address should appear with {string}, {string}, {string}, {string}, {string}, {string}")
    public void newAddressShouldAppearWith(String alias, String address, String city, String zip, String country, String phone) {
        AddressPage onAddressPage = new AddressPage(driver);
        Assert.isTrue(onAddressPage.checktest(alias, address, city, zip, country, phone), "Niepoprawne dane");
    }

    @And("browser close")
    public void browserClose() {
        driver.quit();
    }


    @And("User click on Clothes")
    public void userClickOnClothes() {
        AccountPage onAccountPage = new AccountPage(driver);
        onAccountPage.getClothesSite();
    }

    @And("User choose Hummingbird Printed Sweater")
    public void userChooseHummingbirdPrintedSweater() {
        ClothesPage onClothesPage = new ClothesPage(driver);
        onClothesPage.getSweater();
    }

    @And("User choose {string} and {string}")
    public void userChooseAnd(String size, String quantity) {
        ProductPage onProductPage = new ProductPage(driver);
        onProductPage.chooseSize(size);
        onProductPage.chooseQuantity(quantity);
    }

    @And("User clicks on Add to cart button")
    public void userClicksOnAddToCartButton() {
        ProductPage onProductPage = new ProductPage(driver);
        onProductPage.addToCart();
        onProductPage.proceedToCheckout();
    }

    @And("User proceed to checkout")
    public void userProceedToCheckout() {
        CartPage onCartPage = new CartPage(driver);
        onCartPage.proceedToCheckout();
    }

    @And("User confirms address")
    public void userConfirmsAddress() {
        OrderPage onOrderPage = new OrderPage(driver);
        onOrderPage.confirmAddress();
    }

    @And("User confirms shopping method")
    public void userConfirmsShoppingMethod() {
        OrderPage onOrderPage = new OrderPage(driver);
        onOrderPage.confirmShipping();
    }

    @And("User choose option Pay by check and clicks on Order with obligation to pay")
    public void userChooseOptionPayByCheckAndClicksOnOrderWithObligationToPay() {
        OrderPage onOrderPage = new OrderPage(driver);
        onOrderPage.choosePayment();
        onOrderPage.agreeTerms();
        onOrderPage.order();
    }


    @Then("Order is confirmed and Printscreen is taken")
    public void orderIsConfirmedAndPrintscreenIsTaken() throws Exception {
        Screenshot takeScreenshot = new Screenshot(driver);
        takeScreenshot.takeSnapShot(driver);

    }
}
