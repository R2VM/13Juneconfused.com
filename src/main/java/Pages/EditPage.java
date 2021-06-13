package Pages;

import TestBase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage extends BaseClass {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"main\"]/table/tbody/tr[1]/td[1]/a")
    public WebElement selectComputerLnk;
    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement compNameText;
    @FindBy(xpath = "//*[@id=\"introduced\"]")
    public WebElement introducedDateText;
    @FindBy(xpath = "//*[@id=\"discontinued\"]")
    public WebElement discontinuedDateText;
    @FindBy(xpath = "//*[@id=\"company\"]")
    public WebElement companyDrp;
    @FindBy(xpath = "//*[@id=\"main\"]/form[1]/div/input")
    public WebElement saveComputerBtn;
    @FindBy(xpath = "//*[@id=\"main\"]/form/div/a")
    public WebElement cancelBtn;
    @FindBy(xpath = "//*[@id=\"main\"]/form[2]/input")
    public WebElement deleteComputerBtn;
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]")
    public WebElement deleteMsg;

    public EditPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectComputerLnk() {selectComputerLnk.click();}
    public void compNameText() {compNameText.sendKeys();}
    public void introducedDateText() {introducedDateText.sendKeys();}
    public void discontinuedDateText() {discontinuedDateText.sendKeys();}
    public void companyDrp(){companyDrp.click();}
    public void saveComputerBtn() {saveComputerBtn.click();}
    public void cancelBtn() {cancelBtn.click();}
    public void deleteComputerBtn() {deleteComputerBtn.click();}
    public void deleteMsg() { deleteMsg.isDisplayed();}
}
