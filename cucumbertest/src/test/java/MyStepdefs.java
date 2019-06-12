import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class MyStepdefs  {
    @Given("^I am on the \"([^\"]*)\" page$")
    public void iAmOnThePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("第一步"+arg0);
//        throw new PendingException();
    }

    @And("^I click the \"([^\"]*)\" button$")
    public void iClickTheButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("第二步"+arg0);
//        throw new PendingException();
    }

    @Then("^I should go to the \"([^\"]*)\" page$")
    public void iShouldGoToThePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("第三步"+arg0);
//        throw new PendingException();
    }



}
