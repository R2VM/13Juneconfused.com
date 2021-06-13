package Util;

import TestBase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TestUtil extends BaseClass {

    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 30;


    public static void takeScreenshotAtEndOfTest() throws IOException {
        String currentDir = System.getProperty("user.dir");
    }
}
