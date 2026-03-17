import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.time.Duration;

public class Tema3_2 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void addUserTest() {

        // Click Add
        driver.findElement(By.id("addNewRecordButton")).click();

        // Wait pentru popup
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));

        // Completeaza form
        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("lastName")).sendKeys("User");

        String email = "test" + System.currentTimeMillis() + "@email.com";
        driver.findElement(By.id("userEmail")).sendKeys(email);

        driver.findElement(By.id("age")).sendKeys("30");
        driver.findElement(By.id("salary")).sendKeys("5000");
        driver.findElement(By.id("department")).sendKeys("QA");

        // Submit
        driver.findElement(By.id("submit")).click();

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}