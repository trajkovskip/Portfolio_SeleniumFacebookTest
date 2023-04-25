package Functions;
import Objects.GoogleObjects;
import Objects.Image;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Google {
    WebDriver driver;
    Image image = new Image();
    GoogleObjects google = new GoogleObjects();
    public Google(WebDriver driver){
        this.driver = driver;
    }
    public void navigate(){
        WebElement googleBar = driver.findElement(google.searchBar);
        googleBar.sendKeys("Selenium Java");
        googleBar.sendKeys(Keys.ENTER);
    }
    public void imageTab(){
        driver.findElement(google.imageTab).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Selenium Java - Google Search"));
    }
    public void imageCheck(){
        WebElement seleniumImage = driver.findElement(image.SeleniumImage);
        Assertions.assertTrue(seleniumImage.isDisplayed());
    }
}
