package steps;
// Should be no selenium import, means that implementation separated for test layer

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PageManager;
import pom.pages.LoginPage;
import utils.ConfigurationFileReader;

import static constants.EndPoints.LOGIN;
import static org.junit.Assert.assertTrue;

/**
 * Mapped into Java methods Gherkin test steps from feature files related to {@link LoginPage}.
 */
public class LoginStepsDefinitions {
    private final LoginPage loginPage;

    /**
     * Constructor for dependency injection.
     *
     * @param context The {@link TestContext} instance for managing shared state across steps.
     */
    public LoginStepsDefinitions(TestContext context) { // constructor for dependency injection
        this.loginPage = PageManager.getLoginPage(context.driver); // assign page using copy of driver from DI containe
    }

    @Given("I go to login page")
    public void iGoToLoginPage() {
        this.loginPage.
                load(LOGIN);
    }


    @Then("The field Username is empty")
    public void theFieldUsernameIsEmpty() {
        assertTrue(
                this.loginPage.getLoginWrapperInner().isUsernameEmpty()
        );
    }

    @Then("The field Password is empty")
    public void theFieldPasswordIsEmpty() {
        assertTrue(
                this.loginPage.getLoginWrapperInner().isPasswordEmpty()
        );
    }

    @When("I click on Login")
    public void iClickOnLogin() {
        this.loginPage
                .getLoginWrapperInner()
                .clickLoginButton();
    }

    @Then("Field Username should be with error")
    public void fieldUsernameShouldBeWithError() {
        assertTrue(
                this.loginPage.getLoginWrapperInner().isUsernameErrorIconVisible()
        );
    }

    @Then("Field Password should be with error")
    public void fieldPasswordShouldBeWithError() {
        assertTrue(
                this.loginPage.getLoginWrapperInner().isPasswordErrorIconVisible()
        );
    }

    @When("I provide valid credentials and click login button")
    public void iProvideValidCredentialsAndClickLoginButton() {
        this.loginPage
                .getLoginWrapperInner()
                .login(
                        ConfigurationFileReader.getInstance().getUsername(),
                        ConfigurationFileReader.getInstance().getPassword()
                );
    }

}
