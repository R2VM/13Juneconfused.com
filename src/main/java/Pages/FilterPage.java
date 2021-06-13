package Pages;

import TestBase.BaseClass;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class FilterPage extends BaseClass {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"searchsubmit\"]")
    public WebElement searchText;
    @FindBy(xpath = "//*[@id=\"searchsubmit\"]")
    public WebElement filterByNameBtn;
    @FindBy(xpath = "//*[@id=\"add\"]")
    public WebElement addNewComputerBtn;

    public FilterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchText(String s) {searchText.sendKeys(s);}
    public void filterByNameBtn() {filterByNameBtn.click();
    }

}