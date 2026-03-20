import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Tema4 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Homepage
    @Test
    public void testHomePage() {

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Practice Software Testing"));

        WebElement logo = driver.findElement(By.xpath("//img"));
        Assert.assertTrue(logo.isDisplayed());
    }

    // Search
    @Test
    public void testSearchProduct() {

        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));

        search.sendKeys("hammer");
        search.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'card')]")
        ));

        List<WebElement> products = driver.findElements(
                By.xpath("//div[contains(@class,'card')]")
        );

        Assert.assertTrue(products.size() > 0);
    }

    // Open product
    @Test
    public void testOpenProduct() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'card')]")
        ));

        driver.findElements(By.xpath("//div[contains(@class,'card')]"))
                .get(0)
                .click();

        WebElement image = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//img"))
        );

        WebElement addToCart = driver.findElement(
                By.xpath("//button[contains(text(),'Add to cart')]")
        );

        Assert.assertTrue(image.isDisplayed());
        Assert.assertTrue(addToCart.isDisplayed());
    }

    // Filter
    @Test
    public void testFilterProducts() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'card')]")));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

        WebElement category = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//label[contains(.,'Hand Tools')]")
        ));

        js.executeScript("arguments[0].scrollIntoView(true);", category);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", category);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'card')]")
        ));

        List<WebElement> products = driver.findElements(
                By.xpath("//div[contains(@class,'card')]")
        );

        Assert.assertTrue(products.size() > 0);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
