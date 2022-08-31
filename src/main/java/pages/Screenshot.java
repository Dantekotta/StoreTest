package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.sql.Timestamp;

public class Screenshot {
    private WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public File takeSnapShot(WebDriver webdriver) throws Exception{
        TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
        File scr = scrShot.getScreenshotAs(OutputType.FILE);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        FileUtils.copyFile(scr, new File("c:\\tmp\\screenshot" + timestamp.getTime() + ".png"));
        return scr;
    }

}
