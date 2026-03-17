import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.time.Duration;

public class Tema3_1 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void completeFormTest() {

        // First Name - placeholder
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");

        // Last Name
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("User");

        // Email
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@email.com");

        // Gender
        driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();

        // Mobile
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0770000000");

        // Subjects
        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Maths");
        subjects.sendKeys(Keys.ENTER);

        // Address
        driver.findElement(By.id("currentAddress")).sendKeys("Bucuresti");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        // Submit
        WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));

        // WAIT
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();

        // Close
        driver.findElement(By.xpath("//button[text()='Close']")).click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
