package StepDefinitions;

import Pages.AddPage;
import TestBase.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class addTest extends BaseClass {

    @Given("^user navigates to url \"([^\"]*)\"$")
    public void user_navigates_to_url(String arg1)  {
        initialization();
    }

    @When("^user clicks on Add new Computer button$")
    public void user_clicks_on_Add_new_Computer_button()  {
        AddPage.addButton();
    }

    @Then("^Add Computer webpage dispalys$")
    public void add_Computer_webpage_dispalys()  {
        String AddPageTitle = getPageTitle();
        System.out.println(AddPageTitle);
    }

    @Then("^user enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void user_enters(String compNameText, String introducedDateText,String discontinuedDateText ) {
        AddPage.compNameText(compNameText);
        AddPage.introducedDateText(introducedDateText);
        AddPage.discontinuedDateText(discontinuedDateText);
    }

//    @Then("^user enters \"([^\"]*)\"$")
//    public void user_selects(String introducedDateText)  {
//        AddPage.introducedDateText(introducedDateText);
//    }
//
//    @Then("^user enters \"([^\"]*)\"$")
//    public void userEnters(String discontinuedDateText) {
//        AddPage.discontinuedDateText(discontinuedDateText);
//    }

    @Then("^user selects \"([^\"]*)\"$")
    public void userSelects()  {
        AddPage.companyDrp.click();
    }

    @Then("^user clicks Create this computer button$")
    public void user_clicks_Create_this_computer_button()  {
        AddPage.createComputerBtn();
    }

}
