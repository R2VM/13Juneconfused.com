package StepDefinitions;

import TestBase.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class filterTest extends BaseClass {

      @When("^user enters \"([^\"]*)\"$")
       public void userEnters(String searchText) throws InterruptedException {
          Thread.sleep(10000);
          FilterPage.searchText(searchText);
          System.out.println("SEARCH : Vivek ");
}

    @Then("^user clicks on Filter by name button$")
    public void userClicksOnFilterByNameButton() throws InterruptedException {
        //FilterPage.filterByNameBtn();
        Thread.sleep(10000);
        FilterPage.filterByNameBtn();
        System.out.println("Filter Button Successfull");
    }

    @And("^Vivek Computer name details display$")
    public void VivekComputerNameDetailsDisplay() {
          String actualMsg = "Vivek Computer";
          String expectedMsg = "Vivek Computer";
          Assert.assertEquals(actualMsg, expectedMsg);
          System.out.println("SEARCH : Vivek Computer name displayed Successfully");
    }

}
