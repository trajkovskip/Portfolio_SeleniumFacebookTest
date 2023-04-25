import Functions.Google;
import org.checkerframework.checker.units.qual.C;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleImageSearch {
    WebDriver driver = new ChromeDriver();
    Google google = new Google(driver);

    @Before
    public void navigate(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pero\\IdeaProjects\\chromedriver\\chromedriver.exe");
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void checkImage(){
        google.navigate();
        google.imageTab();
        google.imageCheck();
    }
}
