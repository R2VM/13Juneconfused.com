package TestBase;
import Util.TestUtil;
import Pages.AddPage;
import Pages.EditPage;
import Pages.FilterPage;
import Pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import javax.rmi.CORBA.Util;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static EventFiringWebDriver e_driver;
    public static AddPage AddPage;
    public static EditPage EditPage;
    public static FilterPage FilterPage;
    public static MainPage MainPage;

    public static void initialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://computer-database.herokuapp.com/computers");
        e_driver = new EventFiringWebDriver(driver);

        driver = e_driver;
        driver.manage().window().maximize();
        AddPage = new AddPage(driver);
        EditPage = new EditPage(driver);
        FilterPage = new FilterPage(driver);
        MainPage = new MainPage(driver);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }
    public String getPageTitle() {return  driver.getTitle(); }
    public static void tearDown() {driver.quit();}
}
