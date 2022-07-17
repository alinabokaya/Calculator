import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {

    @Test
    public void StarvationTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        //Input weight to "Weight" field
        driver.findElement(By.name("wg")).sendKeys("50");

        //Input height to "Height" field in cms format
        driver.findElement(By.name("ht")).sendKeys("185");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add check
        String actualText = driver.findElement(By.className("content")).getAttribute("value");
        boolean isActualTextDisplayed = actualText.contentEquals("Your category is Starvation");
        driver.quit();
        Assert.assertTrue(isActualTextDisplayed, "Message doesn't match!");

    }

    @Test
    public void UnderweightTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        //Input weight to "Weight" field
        driver.findElement(By.name("wg")).sendKeys("50");

        //Input height to "Height" field in cms format
        driver.findElement(By.name("ht")).sendKeys("170");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add check
        String actualText = driver.findElement(By.className("content")).getAttribute("value");
        boolean isActualTextDisplayed = actualText.contentEquals("Your category is Underweight");
        driver.quit();
        Assert.assertTrue(isActualTextDisplayed, "Message doesn't match!");

    }

    @Test
    public void NormalTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        //Input weight to "Weight" field
        driver.findElement(By.name("wg")).sendKeys("50");

        //Input height to "Height" field in cms format
        driver.findElement(By.name("ht")).sendKeys("160");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add check
        String actualText = driver.findElement(By.className("content")).getAttribute("value");
        boolean isActualTextDisplayed = actualText.contentEquals("Your category is Normal");
        driver.quit();
        Assert.assertTrue(isActualTextDisplayed, "Message doesn't match!");

    }

    @Test
    public void OverweightTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        //Input weight to "Weight" field
        driver.findElement(By.name("wg")).sendKeys("50");

        //Input height to "Height" field in cms format
        driver.findElement(By.name("ht")).sendKeys("140");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add check
        String actualText = driver.findElement(By.className("content")).getAttribute("value");
        boolean isActualTextDisplayed = actualText.contentEquals("Your category is Overweight");
        driver.quit();
        Assert.assertTrue(isActualTextDisplayed, "Message doesn't match!");

    }

    @Test
    public void ObeseTest() {
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of bmi calculator page
        driver.get("https://healthunify.com/bmicalculator/");

        //Input weight to "Weight" field
        driver.findElement(By.name("wg")).sendKeys("50");

        //Input height to "Height" field in cms format
        driver.findElement(By.name("ht")).sendKeys("120");

        //Click 'Calculate'
        driver.findElement(By.cssSelector("[value=Calculate]")).click();

        //Add check
        String actualText = driver.findElement(By.className("content")).getAttribute("value");
        boolean isActualTextDisplayed = actualText.contentEquals("Your category is Obese");
        driver.quit();
        Assert.assertTrue(isActualTextDisplayed, "Message doesn't match!");

    }

}
