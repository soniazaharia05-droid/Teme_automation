import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExercitiuInteractiuni {



//    Scenariu
//1. Navighează la
//    https://demoqa.com/select-menu
//            2. Selectează Blue
//3. Verifică valoarea selectată
//4. Navighează la
//    https://demoqa.com/buttons
//            4. Execută:
//    a. double click
//    b. right click
//5. Verifică mesajele.

    WebDriver driver;

    @Test
    public void testQA() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldSelectMenu);
        select.selectByValue("1");

        String selectedOptionText = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOptionText, "Blue", "Optiunea selectata nu este corecta.");

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        Actions actiuni = new Actions(driver);

        actiuni.doubleClick(doubleClickBtn).perform();

        WebElement doubleClickMsg = driver.findElement(By.id("doubleClickMessage"));
        Assert.assertTrue(doubleClickMsg.isDisplayed(), "Mesajul nu este vizibil.");
    }
}
