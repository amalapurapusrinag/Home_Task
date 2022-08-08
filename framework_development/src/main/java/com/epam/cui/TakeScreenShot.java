package com.epam.cui;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class TakeScreenShot {
    private WebDriver driver;

    public void takesScreenshot(WebDriver driver) throws IOException {
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String filePath= "C:\\Users\\Srinag_Amalapurapu\\IdeaProjects\\ProjectHardCode\\target\\screenshot\\img"+ LocalDate.now() +"-"+System.currentTimeMillis()+".jpg";
        File destinationFile=new File(filePath);
        FileUtils.copyFile(sourceFile,destinationFile);
    }


}
