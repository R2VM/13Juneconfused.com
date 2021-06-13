package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseClass {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"add\"]")
    public WebElement addButton;
    @FindBy(xpath = "//*[@id=\"main\"]/table/thead/tr/th[1]/a")
    public WebElement computerNameLabel;
    @FindBy(xpath = "//*[@id=\"main\"]/table/thead/tr/th[2]/a")
    public WebElement introducedLabel;
    @FindBy(xpath = "//*[@id=\"main\"]/table/thead/tr/th[3]/a")
    public WebElement discontinuedLabel;
    @FindBy(xpath = "//*[@id=\"main\"]/table/thead/tr/th[4]/a")
    public WebElement companyLabel;
    @FindBy(xpath = "//*[@id=\"searchsubmit\"]")
    public WebElement searchText;
    @FindBy(xpath = "//*[@id=\"searchsubmit\"]")
    public WebElement filterByNameBtn;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addButton() {addButton.click();}
    public void computerNameLabel() {computerNameLabel.isDisplayed();}
    public void introducedLabel() {introducedLabel.isDisplayed();}
    public void discontinuedLabel() {discontinuedLabel.isDisplayed();}
    public void companyLabel() {companyLabel.isDisplayed();}
    public void searchText() {searchText.sendKeys();}
    public void filterByNameBtn() {filterByNameBtn.click();}
}
