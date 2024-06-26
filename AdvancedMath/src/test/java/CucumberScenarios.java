
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AdvMath;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assumptions.*;


public class CucumberScenarios {
    private int input;
    private int prime;
    @Given("Values that are less than two like {int}")
    public void lessThanInput(int n)
    {
        System.out.println("Cucumber test with less than 2 value:");
        System.out.println("    Values that are less than two like "+n);
        input=n;
    }

    @When("I ask to generate next prime number to test default case")
    public void generateFromLessThan()
    {
        System.out.println("    I ask to generate next prime number");
        prime=AdvMath.findPrimeAfter(input);
    }

    @Then("I get {int}")
    public void checkResultFromLessThan(int res)
    {
        Assertions.assertEquals(res, prime);
        System.out.println("    I get "+prime);
    }

    @Given("Starting value {int}")
    public void mainTestInput(int n)
    {
        System.out.println("Cucumber test of main functionality:");
        System.out.println("    Given value "+n);
        input=n;
    }

    @When("I ask to generate next prime number")
    public void mainTestGeneration()
    {
        System.out.println("    I ask to generate next prime number");
        prime=AdvMath.findPrimeAfter(input);
    }

    @Then("I get result {int}")
    public void chaeckGeneratedResult(int res)
    {
        Assertions.assertEquals(res, prime);
        System.out.println("    I get result " + prime + " and it is correct");
    }

}
