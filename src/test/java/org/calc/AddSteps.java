package org.calc;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

public class AddSteps {

    Calculator calc = new Calculator();
    int result;

    @When("we add two numbers {int} and {int}")
    public void weAddTwoNumbersAnd(int arg0, int arg1) {
        result = calc.add(arg0, arg1);
    }

    @Then("the result is {int}")
    public void theResultIs(int arg0) {
        assertEquals("Incorrect result", arg0, result);
    }
}
