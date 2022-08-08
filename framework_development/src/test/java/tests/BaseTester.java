package tests;
import com.epam.cui.TakeScreenShot;
import com.epam.cui.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import pages.CalculatorPage;

import java.io.IOException;

public class BaseTester {
    private WebDriver driver;
    protected CalculatorPage calculatorPage;
    @BeforeMethod
    public void setDriver(){

        driver=WebDriverSingleton.getWebDriverSingleton();
        driver.manage().window().maximize();
        calculatorPage = new CalculatorPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void takeScreenshot() throws IOException {
        new TakeScreenShot().takesScreenshot(driver);
    }

    @AfterSuite
    public void closeDriver() {
        driver.close();
    }
}

