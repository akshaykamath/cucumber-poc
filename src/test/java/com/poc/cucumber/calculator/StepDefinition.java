package com.poc.cucumber.calculator;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation
public class StepDefinition {
	
	Calculator calculator;
	int answer;

	@Given("Noncondition")
	public void preReq() {
		calculator = new Calculator();

	}

	@When("Add operation invoked on 5 and 2")
	public void performSummation() {
		answer = calculator.add(5, 2);
	}

	@Then("The result is 7")
	public void verifyResult() {
		assertEquals(answer, 7);
	}
}
