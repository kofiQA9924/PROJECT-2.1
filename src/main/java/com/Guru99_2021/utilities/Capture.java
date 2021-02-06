package com.Guru99_2021.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static com.Guru99_2021.base.BaseClass.driver;

/**
 * Created by RUTHERFORD on 2/4/2021.
 */
public class Capture {
    public void captureScreen() throws IOException {
        File screenshotPath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotPath,new File(System.getProperty("user.dir")+"/Screenshots/"+"image.png"));
    }
}
