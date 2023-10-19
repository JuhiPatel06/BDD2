package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("User should be logged in and should be present at its own wall")
    public void userShouldBeLoggedInAndShouldBePresentAtItsOwnWall() {
        System.out.println("userShouldBeLoggedInAndShouldBePresentAtItsOwnWall");
    }

    @When("I type the message in and the text box")
    public void iTypeTheMessageInAndTheTextBox() {
        System.out.println("iTypeTheMessageInAndTheTextBox");
    }

    @And("Click on post button")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("The message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("theMessageShouldGetPosted");
    }

    @When("User supply the youtube link in the text box")
    public void userSupplyTheYoutubeLinkInTheTextBox() {
        System.out.println("userSupplyTheYoutubeLinkInTheTextBox");
    }

    @Then("Then video should get posted on the user wall")
    public void thenVideoShouldGetPostedOnTheUserWall() {
        System.out.println("thenVideoShouldGetPostedOnTheUserWall");
    }

    @And("the video should have proper thumbnail")
    public void theVideoShouldHaveProperThumbnail() {
        System.out.println("theVideoShouldHaveProperThumbnail");
    }

    @When("I type the message as{string} in the text box")
    public void iTypeTheMessageAsInTheTextBox(String arg0) {
        
    }

    @When("User supply the youtube link as {string} in the text box")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String arg0) {
    }
}
