import Functions.Login;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_test {
    WebDriver driver = new ChromeDriver();
    Login login = new Login(driver);

    @Before
    public void navigate(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pero\\IdeaProjects\\chromedriver\\chromedriver.exe");
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void Login(){
        login.inputDetails();
        login.clickLogin();
        login.checkLogin();
    }
    @After
    public void close(){
        driver.quit();
    }
}
