/**
 * 
 */
package com.javatraining.cucumber.runner;


import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author kiran
 *
 */
public class MathOperationsStepDef {

	Integer total = 0;
	Integer noOfItems = 0;
	Integer firstItem = 0;
	Integer secondItem = 0;
	@Given("^Customer purchased (\\d+) items worth of (\\d+) and (\\d+)$")
	public void step1(Integer arg1, Integer arg2, Integer arg3) {
		this.noOfItems = arg1;
		this.firstItem = arg2;
		this.secondItem = arg3;
	}

	@When("^customer checksout the cart$") 
	public void step2(){
	   this.total = this.firstItem + this.secondItem;
	}

	@Then("^the total should be (\\d+)$")
	public void step3 (Integer arg1) {
	    assertEquals("Test failed total is not equal",arg1.intValue(), this.total.intValue());
	}

}
