package AutomationExercises.step_definitions;

import AutomationExercises.pages.LoginPage;
import AutomationExercises.utilities.ConfigurationReader;
import AutomationExercises.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisteringStep_Def {

    LoginPage obj = new LoginPage();

    @Given("user on the http://automationexercise.com pages")
    public void user_on_the_http_automationexercise_com_page() {

    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

    }
    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
        obj.signupLoginBtn.click();
    }
    @Then("Verify New User Signup! is visible")
    public void verify_is_visible() {
        Assert.assertTrue(obj.NewUserHeader.isDisplayed());
    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        obj.nameInput.sendKeys(ConfigurationReader.getProperty("name"));
        obj.emailInput.sendKeys(ConfigurationReader.getProperty("email"));
    }
    @Then("Click Signup button")
    public void click_signup_button() {
        obj.sigUpBtn.click();
    }
    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {

    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

    }
    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {

    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {

    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

    }
    @Then("Click Create Account button")
    public void click_create_account_button() {

    }
    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {

    }
    @Then("Click Continue button")
    public void click_continue_button() {

    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {

    }
    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_button() {

    }
}
