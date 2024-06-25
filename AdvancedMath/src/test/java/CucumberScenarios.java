
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AdvMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;


public class CucumberScenarios {
    private int input;
    private int prime;
    @Given("Values that are less than 2 like {string}")
    public void lessThanInput(int n)
    {
        //TODO: треба додати оту бібліотеку assertj щоб перевірити чи можна стрінг до інта парсити
        //TODO: ну і коли цей тест запрацює то треба зробити ще тест для якихось рандомних випадків
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
