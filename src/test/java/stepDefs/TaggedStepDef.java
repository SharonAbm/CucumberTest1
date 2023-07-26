package stepDefs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaggedStepDef {
	
	@Before("@SmokeTest")
	public void initEdge() {
		System.out.println("Edge Before Each Scenario...");
	}
	
	@Before("@RegressionTest")
	public void initChrome() {
		System.out.println("Chrome Before Each Scenario...");
	}
	
	
	@BeforeAll
	public static void setup() {
		System.out.println("Before All the scenarios...");
	}
	
	@Before
	public void eachScenario() {
		System.out.println("Before each scenario...");
	}
	@BeforeStep
	public void eachStep() {
		System.out.println("Before each step...");
	}
	@AfterAll
	public static void teardown() {
		System.out.println("After all the scenarios...");
	}
	
	
	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");

	}
	@When("User delete a deals")
	public void user_delete_a_deals() {
		System.out.println("User delete a deals");
	}
	
	
	@When("User update a task")
	public void user_update_a_task() {
		System.out.println("User update a task");
	}
	
	@When("User update a contacts")
	public void user_update_a_contacts() {
		System.out.println("User update a contacts");
	}
	

	@When("User create a contacts")
	public void user_create_a_contacts() {
		System.out.println("User create a contacts");
	}
	
	@When("User delete a contacts")
	public void user_delete_a_contacts() {
		System.out.println("User delete a contacts");
	}
	
	@When("User create a task")
	public void user_create_a_task() {
		System.out.println("User create a task");
	}
	
	
	@When("User create a deals")
	public void user_create_a_deals() {
		System.out.println("User create a deals");
	}
	
	
	@When("User delete a task")
	public void user_delete_a_task() {
		System.out.println("User delete a task");    
	
}

	@When("User update a deals")
	public void user_update_a_deals() {
		System.out.println("User update a deals");
	}
	
	
}
	
