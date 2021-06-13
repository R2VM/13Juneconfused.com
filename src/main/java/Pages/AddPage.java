package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddPage extends BaseClass {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"add\"]")
    public WebElement addButton;
    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement compNameText;
    @FindBy(xpath = "//*[@id=\"introduced\"]")
    public WebElement introducedDateText;
    @FindBy(xpath = "//*[@id=\"discontinued\"]")
    public WebElement discontinuedDateText;
    @FindBy(xpath = "//*[@id=\"company\"]")
    public WebElement companyDrp;
    @FindBy(xpath = "//*[@id=\"main\"]/form/div/input")
    public WebElement createComputerBtn;
    @FindBy(xpath = "//*[@id=\"main\"]/form/div/a")
    public WebElement cancelBtn;

    public AddPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addButton() {addButton.click();}
    public void compNameText(String v) {compNameText.sendKeys(v);}
    public void introducedDateText(String i) {introducedDateText.sendKeys(i);}
    public void discontinuedDateText(String d) {discontinuedDateText.sendKeys(d);}
    public void createComputerBtn() {createComputerBtn.click();}
    public void cancelBtn(){cancelBtn.click();}
}
