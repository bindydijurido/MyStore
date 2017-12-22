package utility;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class Root {

    public static WebDriver driver;

    @Before
    public void setUpBeforeClass() {

        System.setProperty("webdriver.chrome.driver", "libs/chromedriver.exe");

        /*
          for MacOS systems:
          System.setProperty("webdriver.chrome.driver", "libs/chromedriver");
         */

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {

        driver.close();
        driver.quit();
    }
}
