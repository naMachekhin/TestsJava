import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AdvMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
public class CucumberTests {
    private int input;
    private int prime;
    @Given("Values that are less than two like {int}")
    public void lessThanInput(int n)
    {

        input=n;
    }

    @When("I ask to generate next prime number")
    public void generateFromLessThan()
    {
        prime=AdvMath.findPrimeAfter(input);
    }

    @Then("I get {int}")
    public void checkResultFromLessThan(int res)
    {
        Assertions.assertEquals(res, prime);
    }
}
