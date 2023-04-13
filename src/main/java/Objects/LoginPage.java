package Objects;
import org.openqa.selenium.By;

public class LoginPage {
    public By email = By.id("email");
    public By password = By.id("pass");
    public By loginButton = By.cssSelector("button[type='submit']");
    public By forgotPassButton = By.className("_6ltj");
    public By newAccButton = By.id("u_0_0_AY");
}