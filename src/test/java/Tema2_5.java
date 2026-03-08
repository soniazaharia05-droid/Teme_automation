import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tema2_5 {

    @Test
    public void verifyExampleTitle() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com/");

        String title = driver.getTitle();

        Assert.assertNotNull(title, "Titlul paginii este null");

        Assert.assertTrue(title.contains("Example"),"Titlul nu contine 'Example'");

        driver.quit();

    }
}

