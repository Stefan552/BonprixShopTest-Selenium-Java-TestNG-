package Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driver {
    public ChromeDriver getDriver() {
        return driver;
    }

    public ChromeDriver driver;

    @BeforeMethod
    public void SetupDriver(){
        System.setProperty("web-driver.chrome.driver","src/test/resources/WebDriver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void Clear(){
        driver.quit();
    }
    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitFewSecs() throws InterruptedException {
        Thread.sleep(2500);
    }

}
