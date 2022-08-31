package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LandingPage {
        private WebDriver driver;

        public LandingPage(WebDriver driver) {
            this.driver = driver;
        }

        public void clickSignIn(){
            WebElement signIn = driver.findElement(By.cssSelector("[title='Log in to your customer account']"));
            signIn.click();
        }

        public void searchHotel() throws InterruptedException {
            WebElement location = driver.findElement(By.id("hotel_location"));
            WebElement hotelList = driver.findElement(By.xpath("//span[@id='hotel_cat_name']"));
            WebElement checkIn = driver.findElement(By.id("check_in_time"));
            WebElement checkOut = driver.findElement(By.id("check_out_time"));
            WebElement searchButton = driver.findElement(By.id("search_room_submit"));

            String date = String.valueOf(LocalDate.now());
            LocalDate checkInDate = LocalDate.now();
            LocalDate checkOutDate = checkInDate.plusDays(2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


            location.sendKeys("Poland");
            hotelList.click();
            Thread.sleep(100);
            WebElement hotelName = driver.findElement(By.xpath("//li[@data-id-hotel=1]"));
            hotelName.click();
            checkIn.sendKeys(checkInDate.format(formatter));
            checkOut.sendKeys(checkOutDate.format(formatter));
            Thread.sleep(1000);
            searchButton.click();

        }
}
