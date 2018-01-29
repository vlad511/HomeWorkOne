package epamAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import static java.lang.System.setProperty;

public class TestInit {

    protected static WebDriver driver;

    @BeforeSuite

    public static void setUp()  {

        setProperty("webdriver.chrome.driver", "c:/Selenium/Tools/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(" https://epam.github.io/JDI/index.html");

    }
}
