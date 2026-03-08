import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tema2_2 {

    @Test
    public void openRoblox() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.roblox.com/");

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Roblox";

        Assert.assertEquals(actualTitle, expectedTitle, "Verifica titlul paginii.");

        driver.quit();
    }

}
