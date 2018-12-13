package fr.univ.lorraine.bootifultest.story;

import fr.univ.lorraine.bootifultest.steps.AdderRestSteps;
import fr.univ.lorraine.bootifultest.steps.AdderServiceSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AdderStory {

    @Steps
    AdderRestSteps restSteps;

    @Given("a number")
    public void givenNumber() throws Exception{
        restSteps.givenBase();
    }

    @When("I submit another number $num to adder")
    public void whenISubmitToAdderWithNumber(int num){
        restSteps.whenAdd(num);
    }

    @Then("I get a sum of the numbers")
    public void thenIGetTheSum(){
        restSteps.thenSummedUp();
    }
}