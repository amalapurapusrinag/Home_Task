package org.example.PageObject;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    BasePage(WebDriver driver)
    {
        this.driver=driver;
    }
}
