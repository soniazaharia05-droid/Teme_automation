import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tema2_4 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void openExample() {
        driver.get("https://example.com/");
    }

    @Test(priority = 2)
    public void openApple() {
        driver.get("https://www.apple.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
