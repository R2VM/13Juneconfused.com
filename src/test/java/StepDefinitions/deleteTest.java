package StepDefinitions;

import TestBase.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class deleteTest extends BaseClass {
    @When("^user clicks on a Computer name$")
    public void userClicksOnAComputerName() {
         EditPage.selectComputerLnk();
    }

    @Then("^Computer details displays$")
    public void computerDetailsDisplays() {

    }

    @And("^user clicks on Delete this computer button$")
    public void userClicksOnDeleteThisComputerButton() {
        EditPage.deleteComputerBtn();
    }

    @And("^Done This computer has been deleted message displays$")
    public void doneThisComputerHasBeenDeletedMessageDisplays() {
        EditPage.deleteMsg();
        String actualMsg = "Done! Computer has been deleted";
        String expectedMsg = "Done! Computer has been deleted";
        Assert.assertEquals(actualMsg, expectedMsg);
        System.out.println("DELETE : Computer was Successfull");
    }
}
