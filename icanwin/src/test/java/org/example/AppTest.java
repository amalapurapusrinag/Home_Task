package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;
public class AppTest {
    @Test
    public void pastebinTest() throws Exception {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Srinag_Amalapurapu\\IdeaProjects\\test_ui\\src\\test\\resources\\webdriver\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        driver.manage().window().maximize();

        WebElement txt2 = driver.findElement(By.id("postform-text")); //- Code: "Hello from WebDriver"
        txt2.sendKeys(("Hello from webdriver"));
        Thread.sleep(3000);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; // to scroll down the window
        jsExecutor.executeScript("window.scrollTo(0,500)");

        driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[2]/div/span/span[1]/span/span[2]")).click();
        Thread.sleep(1000); // selecting dropdown for 10min

        driver.findElement(By.xpath("/html/body/span[2]/span/span[2]/ul/li[3]")).click();
        Thread.sleep(1000); // selecting 10min

        WebElement usernameTxt1 = driver.findElement(By.id("postform-name"));
        usernameTxt1.sendKeys("helloweb");
        usernameTxt1.getAttribute("value"); // to type helloweb in paste title
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
