package step_Defenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyingPendingTimeSheet_StepDef {
	

@Given("the user is on the homepage")
public void the_user_is_on_the_homepage() {
    System.out.println("the user is on the homepage");
}

@When("the user click on the time option form the menu")
public void the_user_click_on_the_time_option_form_the_menu() {
	System.out.println("the user click on the time option form the menu");
}

@And("the user enter the name as {string}")
public void the_user_enter_the_name_as(String string) {
	System.out.println("the user enter the name as John Smith");
}

@And("clicks on the view button")
public void clicks_on_the_view_button() {
	System.out.println("clicks on the view button");
}

@Then("the user should see the message as {string}")
public void the_user_should_see_the_message_as(String string) {
	System.out.println("the user should see the message as John Smith");
}


}
