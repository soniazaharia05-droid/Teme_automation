import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tema2_3 {

    @Test(priority = 1)
    public void openExample() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/");

        driver.quit();

    }

    @Test(priority = 2)
    public void openApple() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");

        driver.quit();
    }
}
