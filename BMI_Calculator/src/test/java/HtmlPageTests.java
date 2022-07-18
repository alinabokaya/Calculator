import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlPageTests {
    private static final String PATH = "file:///Users/alinabo/Git/Calculator/BMI_Calculator/src/test/resources/index.html";


    @Test
    public void WelcomingTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of index html page
        driver.get(PATH);

        //Add check
        WebElement welcome = driver.findElement(By.name("header"));
        boolean isWelcomeExists = welcome.isDisplayed();
        driver.quit();
        Assert.assertTrue(isWelcomeExists, "Welcome message doesn't exist");

    }

    @Test
    public void BandsListTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of index html page
        driver.get(PATH);

        //Add check
        WebElement bandsList = driver.findElement(By.name("my bands"));
        boolean isBandsListExists = bandsList.isDisplayed();
        driver.quit();
        Assert.assertTrue(isBandsListExists, "Bands List doesn't exist");

    }

    @Test
    public void ButtonTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of index html page
        driver.get(PATH);

        //Add check
        WebElement button = driver.findElement(By.className("button"));
        boolean isButtonExists = button.isDisplayed();
        driver.quit();
        Assert.assertTrue(isButtonExists, "Button doesn't exist");

    }

    @Test
    public void GreetingBlockTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of index html page
        driver.get(PATH);

        //Add check
        String name = driver.findElement(By.name("greeting")).getText();
        boolean isNameDisplayed = name.contains("Alina");
        driver.quit();
        Assert.assertTrue(isNameDisplayed, "Name doesn't exist");

    }


    @Test
    public void UrlTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of index html page
        driver.get(PATH);

        //Click 'Click here to learn HTML!'
        driver.findElement(By.id("a_1")).click();

        //Add check
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.w3schools.com/html/default.asp",
                "Links do not match!");
        driver.quit();

    }

    @Test
    public void ImageAltTextTest() {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Open url of index html page
        driver.get(PATH);

        //Add check
        String imageAltText = driver.findElement(By.className("images")).getAttribute("alt");
        boolean isImageAltTextExists = imageAltText.contentEquals("oops, you found it");
        driver.quit();
        Assert.assertTrue(isImageAltTextExists, "Alt text doesn't exist");
    }

}