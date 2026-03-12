import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demoqa {

    @Test
    public void textBoxTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        WebElement submit = driver.findElement(By.className("btn-primary"));

        fullName.sendKeys("Sonia");
        email.sendKeys("test@itschool.com");
        currentAddress.sendKeys("Bucuresti");
        permanentAddress.sendKeys("Ilfov");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        submit.click();

        WebElement output =  driver.findElement(By.id("output"));



        Assert.assertTrue(output.isDisplayed());


    }

    @Test

    public void textBoxTestNegativ() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));

        WebElement submit = driver.findElement(By.className("btn-primary"));

        fullName.sendKeys("Sonia");
        email.sendKeys("test");
        currentAddress.sendKeys("Bucuresti");
        permanentAddress.sendKeys("Ilfov");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        submit.click();

        String classAtribute =  email.getAttribute("class");

        System.out.println(classAtribute);

        Assert.assertTrue(classAtribute.contains("field-error"));
    }



    }
