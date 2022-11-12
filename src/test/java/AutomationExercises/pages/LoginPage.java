package AutomationExercises.pages;

import AutomationExercises.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signupLoginBtn;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement NewUserHeader;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement sigUpBtn;

}