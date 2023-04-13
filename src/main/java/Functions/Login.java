package Functions;
import Objects.LoginPage;
import Objects.User;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    User user = new User();

    public Login(WebDriver driver){
        this.driver = driver;
    }
    public void inputDetails(){
        driver.findElement(loginPage.email).sendKeys(user.email);
        driver.findElement(loginPage.password).sendKeys(user.password);
    }
    public void clickLogin(){
        driver.findElement(loginPage.loginButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Facebook"));
    }
    public void checkLogin(){
        String title = driver.getTitle();
        Assertions.assertEquals("Facebook", title);
    }
}
